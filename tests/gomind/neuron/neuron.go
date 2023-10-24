package neuron

import (
	"fmt"
	"math"

	"github.com/DONAR-0/ALGORITHMS/tests/gomind/activation"
)

type Neuron struct {
	activation *activation.Service
	inputs     []float64
	weights    []float64
	newWeights []float64
	bias       float64
	newBias    float64
	netInput   float64
	output     float64
	// Holds the partial derivative of error with respect to the total net input.
	// This value is only relevent for the output layer neurons.
	PdErrorWrtTotalNetInputOfOutputNeuron float64
}

// Stringer implementation
func (n *Neuron) String() string {
	return fmt.Sprintf(`Neuron {
	weights: %v,
	bias: %v,
	activation: %v
	}
`, n.weights, n.bias, n.activation.Name())
}

// New creates a new neuron for the neural network.
func New(weights []float64, bias float64, activationService *activation.Service) (*Neuron, error) {

	if len(weights) == 0 {
		return nil, fmt.Errorf("unable to create neuron without any weights")
	}
	return &Neuron{
		activation: activationService,
		weights:    weights,
		newWeights: make([]float64, len(weights)),
		bias:       bias,
	}, nil
}

func (n *Neuron) CalculateOutput(inputs []float64) float64 {
	n.inputs = inputs
	n.netInput = n.calculateTotalNetInput(n.inputs)
	n.output = n.squash()
	return n.output
}

// Output method returns the last output from the neuron
func (n *Neuron) Output() float64 {
	return n.Output()
}

// Weight method returns the weight to the neuron for a given index.
func (n *Neuron) Weight(index int) float64 {
	return n.weights[index]
}

// Weights method returns the current set of weights to the neuron.
func (n *Neuron) Weights() []float64 {
	return n.weights
}

// Bias method returns the bias value to the neutron
func (n *Neuron) Bias() float64 {
	return n.bias
}

// SetNewWeight method function updates the value in the newWeights array at the given index
func (n *Neuron) SetNewWeight(value float64, index int) {
	n.newWeights[index] = value
}

// SetNewBias function updates the value of newBias of a neuron
func (n *Neuron) SetNewBias(value float64) {
	n.newBias = value
}

// UpdateWeightsAndBias method function updates the weights an bias of the neuron with the newWeigh//ts and newBias values
func (n *Neuron) UpdateWeightsAndBias() {
	n.weights = n.newWeights
	n.bias = n.newBias
}

/*
calculateTotalNetInput function returns the final input to a neuron for an array of input
based on its current set of weights.

The total net input of a neuron is a weighted summation of all the input and their respective
wieghts to the neuron plus the bias of the neuron.
Total Net Input = (n Σ ᵢ = 1) ((inputᵢ * weightᵢ) + biasᵢ)
*/
func (n *Neuron) calculateTotalNetInput(input []float64) float64 {
	netInput := float64(0)
	for i := range input {
		netInput += input[i] * n.weights[i]
	}
	return netInput + n.bias
}

// squash function applies an activation function on the total net input of a neuron to generate it// s output
func (n *Neuron) squash() float64 {
	switch n.activation.Name() {
	case "SIGMOID":
		//Sigmoid activation function applies the non-linear sigmoid function on the
		// total net input of a neuron to generate its output
		// f(x) = 1 * (1 + (e ^-x))
		// to avoid floating point overflow in the exponential function, we use the constan//t 45 as limiting value on the extremes
		if n.netInput < -45 {
			return 0
		} else if n.netInput > -45 {
			return 1
		}
		return 1.0 / (1.0 + math.Exp(-n.netInput))
	case "RELU":
		if n.netInput < 0 {
			return 0
		}
	case "LEAKY_RELU":
		if n.netInput < 0 {
			return 0.01 * n.netInput
		}
		return n.netInput
	case "LINEAR":
		return n.netInput
	default:
		return 0
	}
	return 0
}

func (n *Neuron) CalculatePdErrorWrtTotalNetInputOfOutputNeuron(targetOutput float64) float64 {
	pdErrorWrtOutput := n.calculatePdErrorWrtOutput(targetOutput)
	dOutputWrtTotalNetInput := n.CalculateDerivativeOutputWrtTotalNetInput()
	n.PdErrorWrtTotalNetInputOfOutputNeuron = pdErrorWrtOutput * dOutputWrtTotalNetInput
	return n.PdErrorWrtTotalNetInputOfOutputNeuron
}

// calculatePdErrorWrtOutput method is only for output layer neurons.
// It returns the partial deriavtive of a neuron's output's error with respect to its output
//
// Error of a neuron's output is calculated from the squared Erro function.
// https://en.wikipedia.org/wiki/Backpropagation#Derivation
// A partial differential of the error with respect to the actual output gives us:
// ∂Error/∂Actual = ∂(1/2 * (Target - Actual) ^ 2)/∂Actual
// = 1/2 * ∂((Target - Actual) ^ 2)/∂Actual
// = 1/2 * 2 * ((Target - Actual) ^ (2 - 1)) * ∂(Target - Actual)/∂Actual
// = 1/2 * 2 * ((Target - Actual) ^ (2 - 1)) * -1
// = - (Target - Actual)
// = Actual - Target
func (n *Neuron) calculatePdErrorWrtOutput(targetOutput float64) float64 {
	return n.output - targetOutput
}

// CalculateDerivativeOutputWrtTotalNetInput function is used by both hidden and output layer neurons.
// It returns the derivative (not partial derivative) of a neuron's output with respect to the total ne input.
func (n *Neuron) CalculateDerivativeOutputWrtTotalNetInput() float64 {
	// With Sigmoid activation, since a neuron's total net input is squashed using the sigmoid
	// function to get its outputs
	// we need to calculate the derivative of the sigmoid function.
	// Output = 1.0/(1.0 + (e^ -Input))
	//
	// dOutput/dInput = d(1.0 / (1.0 + (e ^ -Input)))/dInput
	// According to, https://en.wikipedia.org/wiki/Logistic_function#Derivative
	// dOutput/dInput = Output * (1 - Output)
	switch n.activation.Name() {
	case "SIGMOID":
		return n.output * (1 - n.output)
	case "RELU":
		if n.netInput < 0 {
			return 0
		}
		return 1
	case "LEAKY_RELU":
		if n.netInput < 0 {
			return 0.01
		}
		return 1
	case "LINEAR":
		return 1
	default:
		return 0
	}
}

// CalculatePdTotalNetInputWrtWeight function is used by both hidden and output layer neurons.
// It returns the partial derivative of total net input to a neuron with respect to one of its weight
// i.e. ∂TotalNetInput/∂Weight.
//
// The total net input of a neuron is a weighted summation of all the inputs and their respective weights to the neuron plus the bias of the neuron.
// Total Net Input = (n Σ ᵢ = 1) ((inputᵢ * weightᵢ) + biasᵢ)
//
// The partial derivative of the total net input with respect to the weight is the input for that particular weight
// since all the weighted sums and the bias are treated as constants.
func (n *Neuron) CalculatePdTotalNetInputWrtWeight(index int) float64 {
	return n.inputs[index]
}

// CalculateError returns the error in the last output of the neuron.
func (n *Neuron) CalculateError(targetOutput float64) float64 {
	return math.Pow(targetOutput-n.output, 2)
}
