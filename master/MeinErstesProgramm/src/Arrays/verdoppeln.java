package Arrays;

import java.io.IOException;

import Methoden.IO;

public class verdoppeln {

	public static void main(String[] args) throws IOException {

		double[] array = IO.readDoubleArray(3);

		System.out.println("Ursprüngliches Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		double[] doubledValues = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			doubledValues[i] = 2 * array[i] ;
		}
		
		System.out.println("\nNeues Array: ");
		for (int i = 0; i < doubledValues.length; i++) {
			System.out.print(doubledValues[i] + "\t");
		}
	}

}
