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
		rows = data.length;
		cols = data[0].length;
		Transpose = Operations.transpose(data);
	}
	
	public Matrix setMatrix(double[][] data){
		this.data = data;
		rows = data.length;
		cols = data[0].length;
		Transpose = Operations.transpose(data);
		return this;
	}
	
	public void print() {
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
