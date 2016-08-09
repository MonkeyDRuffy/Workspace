package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyOfRechner {

	public static void main(String[] args) throws IOException {
		// Deklarieren und Initialisieren des BufferedReader.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Deklarieren der Variablen.
		double zahl1, zahl2, ergebnis;
		String antwort , auswahl, eingabe;

		do {
			// Eingabe der ersten Zahl.
			System.out.print("Bitte die erste Zahl eingeben: ");
			eingabe = br.readLine();
			zahl1 = Double.parseDouble(eingabe);
			// Eingabe der zweiten Zahl.
			System.out.print("Bitte die zweite Zahl eingeben: ");
			eingabe = br.readLine();
			zahl2 = Double.parseDouble(eingabe);
			// Ausgabe der Addition.
			ergebnis = zahl1 + zahl2;
			System.out.println(zahl1 + " + " + zahl2 + " = " + ergebnis);
			// Ausgabe der Subtraktion.
			ergebnis = zahl1 - zahl2;
			System.out.println(zahl1 + " - " + zahl2 + " = " + ergebnis);
			// Ausgabe der Multiplikation.
			ergebnis = zahl1 * zahl2;
			System.out.println(zahl1 + " * " + zahl2 + " = " + ergebnis);
			// Ausgabe der Division.
			ergebnis = zahl1 / zahl2;
			System.out.println(zahl1 + " / " + zahl2 + " = " + ergebnis);
			// Ausgabe der Potenz.
			ergebnis = Math.pow(zahl1, zahl2);
			System.out.println(zahl1 + " hoch " + zahl2 + " = " + ergebnis);

			System.out.println("Wollen sie eine andere Berechnung machen ? (J/N)");
			antwort = br.readLine();
		} while (antwort.equalsIgnoreCase("J"));

	}
}
