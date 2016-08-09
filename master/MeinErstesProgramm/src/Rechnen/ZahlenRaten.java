package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZahlenRaten {

    public static void main(String[] args) throws IOException {
	// Deklarieren und Initialisieren des BufferedReader.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String text;

	System.out.println("Bitte denken Sie sich eine Zahl zwischen 1 und 10!");

	System.out.print("Liegt die Zahl zwischen 1 und 5? (J/N)");
	text = br.readLine();
	if (text.equalsIgnoreCase("j")) {
	    System.out.print("Liegt die Zahl zwischen 1 und 3? (J/N): ");
	    text = br.readLine();
	    if (text.equalsIgnoreCase("j")) {
		System.out.println("Lautet die gesuchte Zahl 1 oder 2? (J/N): ");
		text = br.readLine();
		if (text.equalsIgnoreCase("j")) {
		    System.out.println("Lautet die Zahl 1? ");
		    text = br.readLine();
		    if (text.equalsIgnoreCase("j")) {
			System.out.println("Die gesuchte lautet 1!");
		    }
		    else {
			System.out.println("Die gesuchte lautet 2!");
		    }
		}
		// die Zahl 3
		else {
		    System.out.println("Die gesuchte lautet 3!");
		}
	    }
	    // 4 oder 5
	    else {
		System.out.println("Lautet die Zahl 4? ");
		text = br.readLine();
		if (text.equalsIgnoreCase("j")) {
		    System.out.println("Die gesuchte lautet 4!");
		}
		else {
		    System.out.println("Die gesuchte lautet 5!");
		}
	    }
	}

	// 6, 7, 8, 9 oder 10
	else {

	}

    }

}
