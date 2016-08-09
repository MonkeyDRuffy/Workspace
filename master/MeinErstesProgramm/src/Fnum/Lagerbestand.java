package Fnum;

import java.io.IOException;

import Methoden.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {


		System.out.println("Wie viel unterschiedliche Artikel haben sie im Lager?");
		int arrG = IO.readInt();

		String articles[] = new String[arrG];
		double amount[] = new double[arrG];
		double price[] = new double[arrG];


		System.out.println("Erfassen sie die einzelnen Artikelbezeichnungen: ");
		articles[0] = IO.readString();
		articles[1] = IO.readString();
		articles[2] = IO.readString();

		System.out.println("Erfassen sie jetzt den Einzelpreis jedes Artikels: ");
		System.out.println("Preis des Artikels Monitor");
		price[0] = IO.readDouble();
		System.out.println("Preis des Artikels Tastatur");
		price[1] = IO.readDouble();
		System.out.println("Presi des Artikels Maus");
		price[2] = IO.readDouble();

		System.out.println("Erfassen sie jetzt die Anzahl der einzelnen Artikel:");
		System.out.println("Menge des Artikels Monitor");
		amount[0] = IO.readDouble();
		System.out.println("Menge des Artikels Tastatur");
		amount[1] = IO.readDouble();
		System.out.println("Menge des Artikels Maus");
		amount[2] = IO.readDouble();

		double wert = amount[0] * price[0] + amount[1] * price[1] + amount[2] * price[2];
		double anzahl = amount[0] + amount[1] + amount[2];


		System.out.println("In ihrem Lager befinden sich insgesamt " + anzahl + "Artikel im wert von" + wert);

	}

}
