package Arrays;

import java.io.IOException;

import Methoden.IO;

public class Maxima {

	public static void main(String[] args) throws IOException {

		double[] array = IO.readDoubleArray();

		double maximum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}

		double secondMaximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] != maximum) {
				secondMaximum = array[i];
				break;

			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondMaximum && array[i] < maximum) {
				secondMaximum = array[i];
			}
		}
		System.out.println("Maximum: " + maximum);
		System.out.println("Zweites Maximum: " + secondMaximum);
	}

}
