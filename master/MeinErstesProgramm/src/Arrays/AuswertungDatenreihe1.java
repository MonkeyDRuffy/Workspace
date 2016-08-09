package Arrays;

import java.io.IOException;

import Methoden.IO;

public class AuswertungDatenreihe1 {

	public static void main(String[] args) throws IOException {

		double a[] = IO.readDoubleArray();

		System.out.println("\nIhre eingegebenen zahlen:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}




	public static double maximum() throws IOException {
		double a[] = IO.readDoubleArray();

		double maximum = a[0];
		for(int i= 1;i <a.length;i++){
			if (a[i] > maximum){
				maximum=a[i];

				

			}
		}
		return maximum;
	}
}