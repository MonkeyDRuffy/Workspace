package Arrays;

import java.io.IOException;
import Methoden.IO;

public class VariablesArray {

	public static void main(String[] args) throws IOException {

		System.out.println("Geben sie die Anzahl der zahlen ein die zu erfassen sind: ");
		int a = IO.readInt();

		int arr[] = new int[a]; 

		for (int i = 0; i < a; i++){

			System.out.println("Geben sie eine Zahl ein die im Array stehen soll. Nach jeder eingabe ENTER drücken: ");
			arr[i] = IO.readInt();

		}
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);


		}

	}

}