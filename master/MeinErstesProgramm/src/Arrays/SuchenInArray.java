package Arrays;

import java.io.IOException;

import Methoden.IO;

public class SuchenInArray {

	public static void main(String[] args) throws IOException {
		double[] arr = IO.readDoubleArray(5);

		System.out.println("Nach welcher Zahl wollen sie suchen? ");
		double target = IO.readDouble();

		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] == target) {
				System.out.println("Trefer :D");
			} else {
				System.out.println("Niete : (");
			}

		}

	}

}
