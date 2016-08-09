package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Alterspruefung {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String age;
		System.out.println("Wie Alte sind sie?");
		age = br.readLine();
		int age2 = Integer.parseInt(age.trim().replace(',','.'));

		if (age2  <= 17) {
			System.out.println("Du bist noch Minderjährig!");
		}
		
		else {
			System.out.println("Du bist schon Volljährig");
		}






	}
}

