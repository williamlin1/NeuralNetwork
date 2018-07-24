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
			for(int j = 0; j < getCols(); j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	public double toDouble() {
		if(rows == 1 && getCols() == 1) {
			return data[0][0];
		}else {
			//There is a sizing issue
			return -500;
		}
	}

	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}

}
