package FnumArbeit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] readIntegerArray() throws IOException {
		System.out.println("Geben sie die größe des Arrays an: ");
		int a = IO.readInt();

		int arr[] = new int[a]; 

		for (int i = 0; i < a; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readInt();
		}
		return arr;
	}

	public static int[] einlesenZahlen() throws IOException {
		System.out.println("Geben sie die größe des Arrays an: ");
		int a = IO.readInt();

		int arr[] = new int[a]; 

		for (int i = 0; i < a; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readInt();
		}
		return arr;
	}

	public static void ausgebenZahlen(int[] arr) throws IOException { 
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);
		}


	}

	public static double[] readDoubleArray() throws IOException {
		System.out.println("Geben sie die größe des Arrays an: ");
		int a = IO.readInt();

		double arr[] = new double[a ]; 

		for (int i = 0; i <= a ; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readInt();
		}
		return arr;
	}
	public static double[] readDoubleArray(int size) throws IOException {

		double arr[] = new double[size]; 

		for (int i = 0; i < arr.length; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readDouble();
		}
		return arr;
	}
	
	public static double[] writeDoubleArray(double[] arr) throws IOException { 
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);
		}
		return arr;

	}

	public static String readString() throws IOException {
		return br.readLine();

	}
	public static int readInt(int min, int max) throws Exception{
		while (true){
			int zahl = IO.readInt();
			if (( zahl <=min) && (zahl >= max)){
				return zahl;
			}
			if (zahl <=min){
				System.out.println("Ihre Zahl ist zu klein! ");
				return min;
			}
			else if (zahl >= max) {
				System.out.println("Ihre Zahl ist zu Groß! ");
				return max;
			}
		}
	}



	public static Integer readInt() throws IOException {
		while (true) {
			try {
				String i = br.readLine();
				int number = Integer.parseInt(i.trim().replace(',','.'));
				return number;
			}
			catch (NumberFormatException e) {
				System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
			}

		}

	}

	public static Double readDouble() throws IOException {
		while (true) {
			try {
				String i = br.readLine();
				double number = Double.parseDouble(i.trim().replace(',','.'));
				return number;
			}
			catch (NumberFormatException e) {
				System.out.print("Falsche Eingabe! Bitte erneut versuchen: ");
			}

		}

	}

	public static boolean readBoolean() throws IOException {
		while (true) {
			String tmpEingabe = br.readLine();
			if (tmpEingabe != null
					&& tmpEingabe.equalsIgnoreCase("ja")
					|| tmpEingabe.equalsIgnoreCase("j")
					|| tmpEingabe.equalsIgnoreCase("yes")
					|| tmpEingabe.equalsIgnoreCase("y")) {
				return true;
			} else if (tmpEingabe != null
					&& tmpEingabe.equalsIgnoreCase("nein")
					|| tmpEingabe.equalsIgnoreCase("n")
					|| tmpEingabe.equalsIgnoreCase("no")) {
				return false;
			} else {
				System.out.print("False Eingabe! Bitte erneut versuchen: ");
			}

		}

	}

}
