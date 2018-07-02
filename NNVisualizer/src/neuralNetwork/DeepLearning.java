package neuralNetwork;

import java.util.ArrayList;

public class DeepLearning {

	
	
	int layers;
	double rate;
	int numInputs;
	
	String dataset;
	
	ArrayList<Integer> nodes;
	ArrayList<double[][]> W = new ArrayList<>();
	ArrayList<double[][]> B = new ArrayList<>();
	
	//numLayers is the number of layers, including the output node, but not including the inputs
	//numPer should have a length of 1 less than the number of layers because the output layer always has 1
	//lr is the learning rate, so the constant we can multiply by
	//inputs is the number of inputs we will feed into the neural network
	
	public DeepLearning(int numLayers, int[] numPer, double lr, int inputs) throws Exception{
		layers = numLayers;
		rate = lr;
		numInputs = inputs; 
		
		
		
		nodes.add(numInputs);
		
		for(int i =0; i < numLayers; i++){
			nodes.add(numPer[i]);
		}
		
		nodes.add(1);
		
		
		
		if(numPer.length != layers-1){
			//Invalid dimensions
			throw new Exception();
		}
		
		for(int i = 0; i < layers; i++){
			W.add(matrixMath.Math.generate2D(nodes.get(i+1), nodes.get(i)));
			B.add(matrixMath.Math.generate2D(nodes.get(i+1), 1));
		}
		
	}
	
	
	public double train(){
		
		
		
		
		return 0.0;
	}
	
	public double calculate(){
		
		
		
		
		
		return 0.0;
	}
	
	
	//Path to a file giving training data
	public boolean load(String filepath){
		dataset = filepath;
		return false;
	}
}