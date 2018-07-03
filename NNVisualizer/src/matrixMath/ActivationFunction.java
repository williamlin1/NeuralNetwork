package matrixMath;

public class ActivationFunction {
	
	
	/*
	 * This class provides a variety of activation functions and their
	 * computations that can be tested within the Deep Learning class.
	 * Currently supported is sigmoid, tanh
	 * Will implement RELU and Leaky RELU later
	 */
	
	
	//Performs sigmoid function on a single value
	public static double sigmoid(double x){
		return 1/(1+Math.pow(Math.E,-x));	
	}
	
	//Performs sigmoid function on an array of values
	public static double[] sigmoid(double[] x){
		int len = x.length;
		double[] values = new double[len];
		for(int i =0; i < len; i++){
			values[i] = sigmoid(x[i]);
		}
		return values;	
	}
	
	//Returns the derivative of the sigmoid function at x
	public static double slopeSigmoid(double x){
		return sigmoid(x)*(1-sigmoid(x));
	}
	
	//Returns derivative of the sigmoid function on array of values
	public static double[] slopeSigmoid(double[] x){
		int len = x.length;
		double[] values = new double[len];
		for(int i =0; i < len; i++){
			values[i] = slopeSigmoid(x[i]);
		}
		return values;
	}
	
	public static double tanh(double x){
		return Math.tanh(x);
	}
	
	public static double[] tanh(double[] x){
		int len = x.length;
		double[] values = new double[len];
		
		for(int i =0; i < len; i++){
			values[i] = tanh(x[i]);
		}
		return values;
	}
	
	public static double slopeTanh(double x){
		return (1 - Math.pow(tanh(x),tanh(x)));
	}
	
	public static double[] slopeTanh(double[] x){
		int len = x.length;
		double[] values = new double[len];
		
		for(int i =0; i < len; i++){
			values[i] = slopeTanh(x[i]);
		}
		return values;
	}

	//TODO: add documentation and RELU/Leaky RELU
	
}
