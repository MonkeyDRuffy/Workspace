package Arrays;

import java.io.IOException;
import Methoden.IO;

public class VariablesArrayMethoden {

	public static void main(String[] args) throws IOException {

		 int[] i = einlesenZahlen();
		ausgebenZahlen(i);

	}
	
	private static int[] einlesenZahlen() throws IOException {
		System.out.println("Geben sie die größe des Arrays an: ");
		int a = IO.readInt();

		int arr[] = new int[a]; 

		for (int i = 0; i < a; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readInt();
		}
		return arr;
	}

	private static void ausgebenZahlen(int[] arr) throws IOException { 
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);


		}

	}

}
