package layer

import (
	"fmt"
	"math/rand"

	"github.com/DONAR-0/ALGORITHMS/tests/gomind/activation"
	"github.com/DONAR-0/ALGORITHMS/tests/gomind/neuron"
)

type Layer struct {
	neurons    []*neuron.Neuron
	activation *activation.Service
}

// New creates a new neuron layer for the neural network.
func New(numberOfNeurons, numberOfNeuronsInPreviousLayer int, activationService *activation.Service) (*Layer, error) {
	if numberOfNeurons <= 0 {
		return nil, fmt.Errorf("%d is not valid number of neurons", numberOfNeurons)
	}
	var neurons []*neuron.Neuron
	for i := 0; i < numberOfNeurons; i++ {
		var weights []float64
		for i := 0; i < numberOfNeuronsInPreviousLayer; i++ {
			weights = append(weights, rand.Float64())
		}
		bias := rand.Float64()
		neuron, err := neuron.New(weights, bias, activationService)
		if err != nil {
			return nil, fmt.Errorf("error creating layer: \n %v", err)
		}
		neurons = append(neurons, neuron)
	}
	return &Layer{
		neurons:    neurons,
		activation: activationService,
	}, nil
}

// Neurons function returns an arrray of pointers to neurons of the layer.
func (l *Layer) Neurons() []*neuron.Neuron {
	return l.neurons
}

// Activation functions returns the Activation service objects of the layer.
func (l *Layer) Activation() *activation.Service {
	return l.activation
}

// CalculateOutput function returns the output array from a layer of neurons for an
// array of input for the current set of weights of its neurons
func (l *Layer) CalculateOutput(input []float64) []float64 {
	var output []float64
	for _, neuron := range l.neurons {
		output = append(output, neuron.CalculateOutput(input))
	}
	return output
}

func (l *Layer) Describe() {
	for index, neuron := range l.neurons {
		fmt.Println(fmt.Sprintf("Neuron: %v", index+1))
		fmt.Println(neuron)
	}
}
