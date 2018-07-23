package neuralNetwork;

import java.util.ArrayList;
import java.util.HashMap;

import matrixMath.Matrix;
import matrixMath.Operations;

public class DeepLearning {

	
	
	int layers;
	double rate;
	int numInputs;
	
	int[] layerDimensions;
	
	String dataset;
	
	HashMap<String, Matrix> W = new HashMap<>();
	HashMap<String, Matrix> B = new HashMap<>();
	
	//numLayers is the number of layers, including the output node, but not including the inputs
	//numPer should have a length of 1 less than the number of layers because the output layer always has 1
	//lr is the learning rate, so the constant we can multiply by
	//inputs is the number of inputs we will feed into the neural network
	
	public DeepLearning(int[] layerDims, double lr, int inputs){
		rate = lr;
		numInputs = inputs; 
		layerDimensions = layerDims;
		
		//Generated a random W and B
		initializeParameters(new int[] {inputs, 3,5,3});
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
	
	public void initializeParameters(int[] layerDims) {
		for(int i =1; i < layerDims.length; i++) {
			W.put("W"+String.valueOf(i), Operations.generate2D(layerDims[i], layerDims[i-1]));
			B.put("B" + String.valueOf(i), Operations.generate2D(layerDims[i], 1));
		}
	}
	
}