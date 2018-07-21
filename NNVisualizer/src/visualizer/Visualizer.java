package visualizer;

//Do the Jframe stuff here

import matrixMath.*;

public class Visualizer {

	public static void main(String[] args){
		Matrix matrix = Operations.generate2D(4, 4);
		matrix.print();
		System.out.println("3");
	}
	
}