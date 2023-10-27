package main

import (
	"fmt"
	"math"
)

// Back Propagation Algorithm
// BPA is supervised learning algorithm which uses gradient descent to train multilayer feed forward neural network
// Error Value:
// Error = 0.5 (target - actual)^2
//
// Total error is summition of from j = 1 to n of errors
// TotalError = [j=1 to n]Σ (0.5 *(target(j) - actual(j)) ^2)
//
// ErrorGradient = ∂ TotalError/ ∂ weight
type (
	/**
	Holds the partial deriavtive of error with respect to the total net input.
	∂(error)/∂(TotalNetInput)
	*/
	partialdifferentialErrorWrtTotalNetInputOfOutputNeuron float64
	neuron                                                 struct {
		inputs, weights, newWeights     []float64
		bias, newBias, netInput, output float64
		pd                              partialdifferentialErrorWrtTotalNetInputOfOutputNeuron
	}
)

func (n *neuron) String() string {
	return fmt.Sprintf(`Neuron {
		weights: %v,
		bias: %v,
	}`, n.weights, n.bias)
}

func newNeuron(weights []float64, bias float64) (*neuron, error) {
	if len(weights) == 0 {
		return nil, fmt.Errorf("unable to create neuron any weights")
	}
	return &neuron{
		weights:    weights,
		newWeights: make([]float64, len(weights)),
		bias:       bias,
	}, nil
}

func (n *neuron) calculateOutput(inputs []float64) float64 {
	n.inputs = inputs
	n.netInput = n.calculateTotalNetInput(inputs)
	n.output = squash(n.netInput)
	return n.output
}
func (n *neuron) calculateTotalNetInput(input []float64) float64 {
	netInput := float64(0)
	for i := range input {
		netInput += input[i] * n.weights[i]
	}
	return netInput + n.bias
}

func squash(input float64) float64 {
	if input < -45 {
		return 0
	} else if input > 45 {
		return 1
	} else {
		return 1 / (1.0 + math.Exp(-input))
	}
}

// ∂ Error/ ∂ TotalNetInput =  ∂ Error / ∂ Output * ∂ Output/ ∂ TotalNetInput

func (n *neuron) calculatePdErrorWrtTotalNetInputofOutputNeuron(targetOutput float64) float64 {
	// pdErrorWrtOutput := n.calculatePdErrorWrtOutput(targetOutput)
	// // https://github.com/surenderthakran/back-propagation-demo/blob/master/neuron.go
	return float64(0)
}

// }
