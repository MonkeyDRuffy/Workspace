package Arrays;

import java.io.IOException;

import Methoden.IO;

public class Minimum {

	public static void main(String[] args) throws IOException {

		System.out.println("Geben sie die größe des Arrays an: ");
		int a = IO.readInt();

		double array[] = new double[a];

		for (int i = 0; i < a; i++) {


			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			array[i] = IO.readInt();

			double minimum = a;
			for (int in = a; in > array.length; in++) {
				if (array[in] < minimum) {
					minimum = array[in];
				}
				System.out.println("Minimum: " + minimum);
			}
		}

	}
}