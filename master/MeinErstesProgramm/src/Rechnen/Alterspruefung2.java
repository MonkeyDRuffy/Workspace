package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Alterspruefung2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String age;
		System.out.println("Wie Alte sind sie?");
		age = br.readLine();
		int age2 = Integer.parseInt(age.trim().replace(',','.'));

		if (age2  < 14) {
			System.out.println("Du darfst noch nicht Mofa fahren!");
		}
		else if (age2 < 16){
			System.out.println("Du darfst Mofa fahren aber nicht Moped");
		}
		else if (age2 < 18) {
			System.out.println("Du darfst Moped fahren aber nicht Auto");
		}
		else {
			System.out.println("Du darfst Auto fahren!");
		}





	}
}
