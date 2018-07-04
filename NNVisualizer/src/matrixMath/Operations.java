package matrixMath;

import java.util.Random;

public class Operations {

	public static double[][] generate2D(int row, int col){
		double[][] values = new double[row][col];
		
		Random gen = new Random();
		//Generates a 2d array from 0.01 to 100
		for(int i =0; i < row; i++){
			for(int j = 0; j < col; j++){
				values[i][j] = gen.nextDouble()*100;
				if(values[i][j] == 0){
					values[i][j] = 0.01;
				}
			}
		}
		
		return values;
	}
	
	public static double[][] broadcastSum(double[][] first, double[][] second){
		double[][] values = new double[first.length][first[0].length];
		
		
		//If it is an integer
		if(second.length==1 && second[0].length == 1){
			for(int i =0; i < first.length; i++){
				for(int j = 0; j < first[0].length; j++){
					values[i][j] = first[i][j] + second[0][0];
				}
			}
		}else if(second.length == 1){
			if(second[0].length == first[0].length){
				for(int i =0; i < first.length; i++){
					for(int j = 0; j < first[0].length; j++){
						values[i][j] = first[i][j]+second[0][j];
					}
				}
			}else{
				//throw an exception about size not being met
			}
		}else if(second[0].length == 1){
			if(second.length == first.length){
				for(int i =0; i < first.length; i++){
					for(int j = 0; j < first[0].length; j++){
						values[i][j] = first[i][j]+second[i][0];
					}
				}
			}else{
				//throw an exception about size not being met
			}
		}else if(first.length == second.length && first[0].length == second[0].length){
			for(int i =0; i < first.length; i++){
				for(int j = 0; j < first[0].length; j++){
					values[i][j] += first[i][j] + second[i][j];
				}
			}
		}else{
			//Throw an exception
		}
			//throw an exception that i will add to a list
		
		
		return values;
	}
	
	public static double[][] multiply(double[][] first, double[][] second){
		double[][] values = new double[first.length][first[0].length];
		
		int aRows = first.length;
		int aCols = first[0].length;
		int bRows = second.length;
		int bCols = second[0].length;
		for(int i =0; i < aRows; i++){
			for(int j = 0; j < bCols; j++){
				values[i][j] = 0.000;
			}
		}
		
		if(aCols == bRows){
			for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bCols; j++) { // bCols
	                for (int k = 0; k < aCols; k++) { // aCols
	                    values[i][j] += first[i][k] * second[k][j];
	                }
	            }
	        }
		}else{
			//Throw an error
		}
		return values; 
	}
	
	public static double[][] transpose(double[][] matrix){
		double[][] values = new double[matrix.length][matrix[0].length];
		for(int i =0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				values[i][j] = matrix[j][i];
			}
		}
		
		return values;
	}
	
	
	public static void print(double[][] matrix){
		for(int i =0; i < matrix.length; i++){
			for(int j =0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
}
