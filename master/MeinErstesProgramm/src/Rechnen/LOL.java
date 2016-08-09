package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LOL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Deklarieren und Initialisieren des BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text;

		System.out.println("Bitte denken sie sich eine zahl zwischen 1 und 10!");

		System.out.print("Liegt die Zahl zwischen 1 und 5? ");
		text = br.readLine();

		if (text.equalsIgnoreCase("j")) {
			System.out.print("Liegt die Zahl zwischen 1 und 3? ");
			text = br.readLine();
			if (text.equalsIgnoreCase("j")) {
				System.out.println("lautet die gesuchte Zahl 1 oder 2? ");
				text = br.readLine();
				if (text.equalsIgnoreCase("j")) {
					System.out.println("Lautet die Zahl 1? ");
					text = br.readLine();
					if (text.equalsIgnoreCase("j")) {
						System.out.println("Die gesuchte Zahl lautet 1!");
					}
					else {
						System.out.println("Die gesuchte Zahl lautet 2!");
					}
				}
				else {
					System.out.println("Die gesuchte Zahl lautet 3!");
				}
			}
		}
		else {
			System.out.println("Liegt Die Zahl zwischen 6 und 10?");
			text = br.readLine();
			if (text.equalsIgnoreCase("j")) {
				System.out.println("Liegt die Zahl zwischen 6 und 8?");
				text = br.readLine();
				if (text.equalsIgnoreCase("j")){
					System.out.println("liegt Die Zahl zwischen 6 und 7?");
					text = br.readLine();
					if (text.equalsIgnoreCase("j"))
						System.out.println("lautet die geuschte zahl 6?");
					text = br.readLine();
					if (text.equalsIgnoreCase("j")){
						System.out.println("Die gesuchte Zahl lautet 6!");
					} 
						
				}
			}
		}
		
	}
}









