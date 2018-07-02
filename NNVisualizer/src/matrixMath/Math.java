package matrixMath;

import java.util.Random;

public class Math {

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
		}else{
			//throw an exception that i will add to a list
		}
		
		return values;
	}
	
	
	
	
	
	
}
