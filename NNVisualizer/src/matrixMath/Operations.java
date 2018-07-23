package matrixMath;

import java.util.Random;

public class Operations {

	public static Matrix generate2D(int row, int col){
		double[][] values = new double[row][col];
		
		Random gen = new Random();
		//Generates a 2d array from 0.0001 to 1
		for(int i =0; i < row; i++){
			for(int j = 0; j < col; j++){
				values[i][j] = gen.nextDouble();
				if(values[i][j] == 0){
					values[i][j] = 0.0001;
				}
			}
		}
		
		return new Matrix(values);
	}
	
	public static Matrix zeros(int row, int col){
		double[][] values = new double[row][col];
		for(int i =0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				values[i][j] = 0;
			}
		}
		return new Matrix(values);
	}
	
	
	public static Matrix broadcastSum(Matrix first, Matrix second){
		double[][] values = new double[first.rows][first.cols];
		
		
		//If it is an integer
		if(second.rows==1 && second.cols == 1){
			for(int i =0; i < first.rows; i++){
				for(int j = 0; j < first.cols; j++){
					values[i][j] = first.data[i][j] + second.data[0][0];
				}
			}
		}else if(second.rows == 1){
			if(second.cols == first.cols){
				for(int i =0; i < first.rows; i++){
					for(int j = 0; j < first.cols; j++){
						values[i][j] = first.data[i][j]+second.data[0][j];
					}
				}
			}else{
				//throw an exception about size not being met
			}
		}else if(second.cols == 1){
			if(second.rows == first.rows){
				for(int i =0; i < first.rows; i++){
					for(int j = 0; j < first.cols; j++){
						values[i][j] = first.data[i][j]+second.data[i][0];
					}
				}
			}else{
				//throw an exception about size not being met
			}
		}else if(first.rows == second.rows && first.cols == second.cols){
			for(int i =0; i < first.rows; i++){
				for(int j = 0; j < first.cols; j++){
					values[i][j] = first.data[i][j] + second.data[i][j];
				}
			}
		}else{
			//Throw an exception
		}		
		
		return new Matrix(values);
	}
	
	public static Matrix multiply(Matrix first, Matrix second){
		double[][] values = new double[first.rows][first.cols];
		
		int aRows = first.rows;
		int aCols = first.cols;
		int bRows = second.rows;
		int bCols = second.cols;
		for(int i =0; i < aRows; i++){
			for(int j = 0; j < bCols; j++){
				values[i][j] = 0.000;
			}
		}
		
		if(aCols == bRows){
			for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bCols; j++) { // bCols
	                for (int k = 0; k < aCols; k++) { // aCols
	                    values[i][j] += first.data[i][k] * second.data[k][j];
	                }
	            }
	        }
		}else{
			//Throw an error
		}
		return new Matrix(values); 
	}
	
	public static double[][] transpose(double[][] matrix){
		double[][] values = new double[matrix[0].length][matrix.length];
		for(int i =0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				values[j][i] = matrix[i][j];
			}
		}
		
		return values;
	}
	
}
