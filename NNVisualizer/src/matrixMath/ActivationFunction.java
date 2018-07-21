package matrixMath;

public class ActivationFunction {
	
	
	/*
	 * This class provides a variety of activation functions and their
	 * computations that can be tested within the Deep Learning class.
	 * Currently supported is sigmoid, tanh, RELU, Leaky RELU and gives
	 * their slopes.
	 * Can take in either a double for a single computation or a Matrix
	 */
	
	
	//Performs Sigmoid function on a single value
	public static double sigmoid(double x){
		return 1/(1+Math.pow(Math.E,-x));	
	}
	
	//Performs Sigmoid function on each element in a Matrix;
	public static Matrix sigmoid(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = sigmoid(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	//Returns the derivative of the sigmoid function at x
	public static double slopeSigmoid(double x){
		return sigmoid(x)*(1-sigmoid(x));
	}
	
	//Returns derivative of the sigmoid function on each element in a Matrix
	public static Matrix slopeSigmoid(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = slopeSigmoid(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	//Returns the Tanh of a double
	public static double tanh(double x){
		return Math.tanh(x);
	}
	
	//Returns the Tanh of each element in a Matrix
	public static Matrix tanh(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = tanh(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	public static double slopeTanh(double x){
		return (1 - Math.pow(tanh(x),tanh(x)));
	}
	
	public static Matrix slopeTanh(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = slopeTanh(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}

	public static double RELU(double x) {
		if(x>=0) {
			return x;
		}else {
			return 0;
		}
	}
	
	public static Matrix RELU(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = RELU(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	public static double slopeRELU(double x) {
		return x>=0?1:0;
	}
	
	public static Matrix slopeRELU(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = slopeRELU(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	public static double LeakyRELU(double x) {
		return x>=0?x:0.01*x;
	}
	
	public static Matrix LeakyRELU(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = LeakyRELU(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
	
	public static double slopeLeakyRELU(double x) {
		return x>=0?1:0.01;
	}
	
	public static Matrix slopeLeakyRELU(Matrix input){
		int rows = input.rows;
		int cols = input.cols;
		double[][] data = new double[rows][cols];
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				data[i][j] = slopeLeakyRELU(input.data[i][j]);
			}
		}
		return new Matrix(data);
	}
}
