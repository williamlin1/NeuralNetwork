package matrixMath;

/* This class serves as a representation of Matrixes for the Matrix
 * Math in the Operations class.
 */

public class Matrix {
	
	public double[][] data;
	
	public double[][] Transpose;
	
	int rows;
	
	int cols;
	
	public Matrix(double[][] data) {
		this.data = data;
		int rows = data.length;
		int cols = data[0].length;
		Transpose = Operations.transpose(data);
	}
	
}
