package neuralNetwork;

import java.util.ArrayList;

import matrixMath.Matrix;

public class DeepLearning {

	
	
	int layers;
	double rate;
	int numInputs;
	
	String dataset;
	
	ArrayList<Integer> nodes;
	ArrayList<Matrix> W = new ArrayList<>();
	ArrayList<Matrix> B = new ArrayList<>();
	
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
			W.add(matrixMath.Operations.generate2D(nodes.get(i+1), nodes.get(i)));
			B.add(matrixMath.Operations.generate2D(nodes.get(i+1), 1));
		}
		
		//Generated a random W and B
		
	}
	
	
	public double train(int m){
		
		
		return 0.0;
	}
	
	public double calculate(){
		
		
		
		return 0.0;
	}
	
	public double forwardProp(){
		
		//Performs forward propogation
		
		return 0.0;
	}
	
	public double backProp(){
		
		//Performs backward propogation
		
		return 0.0;
		
	}
	
	//Path to a file giving training data
	//returns true if loaded successfully, false otherwise
	public boolean load(String filepath){
		dataset = filepath;
		return false;
	}
	
	
	
}