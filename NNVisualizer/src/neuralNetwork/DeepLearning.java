package neuralNetwork;

import java.util.ArrayList;
import java.util.HashMap;

import matrixMath.*;

/*
 * A Java based Deep Learning neural network program based off of
 * Andrew Ng's Python deep learning tutorials
 */

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
		int[] temp = new int[layerDims.length+1];
		temp[0] = inputs;
		for(int i =0; i < layerDims.length; i++) {
			temp[i+1] = layerDims[i];
		}
		initializeParameters(temp);
	}
	
	
	public double train(int m){
		
		
		return 0.0;
	}
	
	public double calculate(){
		
		
		
		return 0.0;
	}
	
	public Container linearForward(Matrix A, Matrix W, Matrix B) {
		Matrix Z = Operations.broadcastSum(Operations.multiply(W, A),B);
		HashMap<String, Matrix> temp = new HashMap<>();
		temp.put("A", A);
		temp.put("W", W);
		temp.put("B", B);
		HashMap<String, Object> temp2 = new HashMap<>();
		temp2.put("Z", Z);
		temp2.put("cache", temp);
		Container container = new Container(temp2);
		return container;
	}
	
	public Container linearForwardProp(Matrix prevA, Matrix W, Matrix B, String function){
		Container linearResult = linearForward(prevA, W, B);
		Matrix A;
		if(function.equals("RELU")) {
			A = ActivationFunction.RELU((Matrix)linearResult.getCache().get("Z"));
		}else if(function.equals("Sigmoid")) {
			A = ActivationFunction.sigmoid((Matrix)linearResult.getCache().get("Z"));
		}else {
			A = Operations.zeros(1, 1);
		}
		HashMap<String, Object> temp = new HashMap<>();
		temp.put("A", A);
		HashMap<String, Object> cache = new HashMap<>();
		cache.put("prevA", ((HashMap<String,Object>) linearResult.getCache().get("cache")).get("A"));
		cache.put("W", ((HashMap<String,Object>) linearResult.getCache().get("cache")).get("W"));
		cache.put("B", ((HashMap<String,Object>) linearResult.getCache().get("cache")).get("B"));
		cache.put("Z", linearResult.getCache().get("Z"));
		temp.put("cache", cache);
		return new Container(temp);
	}
	
	public Container fowardProp(Matrix X, Container parameters) {
		ArrayList<Container> caches = new ArrayList<>();
		Matrix A = X;
		int L = parameters.size();
		String len = String.valueOf(L);
		for(int i =1; i < L; i++) {
			Matrix A_prev = A;
			Container cache = linearForwardProp(A_prev,W.get("W"+String.valueOf(i)),
					B.get("B"+String.valueOf(i)),"RELU");
			caches.add(cache);	
		}
		Container last = linearForwardProp(A, W.get("W"+len),B.get("W"+len),"Sigmoid");
		caches.add(last);
		HashMap<String, Object> temp = new HashMap<>();
		temp.put("AL", last.getCache().get("A"));
		temp.put("caches",caches);
		return new Container(temp);
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
	
	public double costComputation(Matrix AL, Matrix Y) {
		int m = Y.getCols();
		
		double cost = (-1/m*1.0)*Operations.sum(
				Operations.broadcastSum((Operations.multiply(Operations.log(AL), Y)),
				Operations.multiply(Operations.sAdd(Operations.sMultiply(Y,-1),1.0), Operations.log(
						Operations.sAdd(Operations.sMultiply(AL,-1),1.0)))));
		return cost;
	}
	
	public void initializeParameters(int[] layerDims) {
		for(int i =1; i < layerDims.length; i++) {
			W.put("W"+String.valueOf(i), Operations.generate2D(layerDims[i], layerDims[i-1]));
			B.put("B" + String.valueOf(i), Operations.zeros(layerDims[i], 1));
		}
	}
	
}