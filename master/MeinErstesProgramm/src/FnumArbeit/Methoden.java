package FnumArbeit;

import java.io.IOException;

import Methoden.IO;

public class Methoden {



	public static double[] readDoubleArrayP() throws IOException {

		int b = 0;
		int c = 0;
		System.out.println("Wie viele unterschiedliche Produkte haben sie? ");
		int a = IO.readInt();

		double arr[] = new double[a]; 

		a = a * 2;

		for (int i = 0; i < 5; i++){
			b++;
			System.out.println("Preis des Produkts " + b + ": ");
			arr[i] = IO.readInt();
		}
		for (int i = 0; i < 5; i++){
			c++;
			System.out.println("Verkaufszahlen des Produkts " + c + ": ");
			arr[i] = IO.readInt();

		}
		return arr;
	}


}

