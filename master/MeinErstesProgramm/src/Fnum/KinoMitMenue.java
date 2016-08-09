
package Fnum;


import java.io.IOException;

import Methoden.IO;

public class KinoMitMenue {

	public static void stornierenPlatz(String[][] saal) throws IOException{

		String stor = "O";

		System.out.println("In welcher Reihe soll der platz storniert werden? ");
		int storReihe = IO.readInt()-1;
		System.out.println("welcher sitz soll storniert werden? ");
		int storSitz = IO.readInt()-1;

		System.out.println("Das ist ihr jetzgiger Saal");
		saal[storReihe][storSitz] = stor;

	}

	public static void reservierenPlatz(String[][] saal) throws IOException{

		String reserviert = "X";

		System.out.println("Sehen sie die Anzeigen wie ein koordinaten system!!!");
		System.out.println("sitze = x und reihe = y");
		System.out.println("Das Koordinaten System beginnt mit 0 und fängt oben links an!!!");
		System.out.println("Welche Reihe soll vergeben werden");
		int vergReihe = IO.readInt()-1;
		System.out.println("Welcher Sitz soll vergeben werden");
		int vergSitz = IO.readInt()-1;

		saal[vergReihe][vergSitz] = reserviert;


	}

	public static String[][] erzeugenSaal(int sitze, int reihe) throws IOException{


		String[][] saal = new String[reihe][sitze];

		for ( int zeile=0; zeile < saal.length; zeile++) {
			for ( int spalte = 0; spalte < saal[zeile].length; spalte++){
				saal[zeile][spalte] = "O";
			}
		}


		return saal;
	}

	public static void anzeigenSaal(String[][] saal){


		for ( int zeile=0; zeile < saal.length; zeile++) {
			for ( int spalte = 0; spalte < saal[zeile].length; spalte++){
				System.out.print(saal[zeile][spalte] + " ");
			}
			System.out.println();
		}


	}
	public static void main(String[] args) throws IOException{

		System.out.println("erzeugen sie erst ein Saal.");
		System.out.println("Wie viele reihen hat ihr Saal? ");
		int reihe = IO.readInt();
		System.out.println("Wie viele sitze hat eine reihe? ");
		int sitze = IO.readInt();	
		String[][] saal = erzeugenSaal(sitze,reihe);
		anzeigenSaal(saal);

		for(;;){
			System.out.println("Was wollen sie tun?");
			System.out.println("1 für Stornieren");
			System.out.println("2 für reservieren");
			System.out.println("3 für anzeigen");
			System.out.println("4 für beenden");
			System.out.println("Eingabe: ");
			int auswahl = IO.readInt();

			if(auswahl == 1){
				stornierenPlatz(saal);
				anzeigenSaal(saal);
			}
			if(auswahl == 2){
				reservierenPlatz(saal);
				anzeigenSaal(saal);
			}
			if(auswahl == 3){
				anzeigenSaal(saal);
			}
			if(auswahl == 4){
				System.out.println("Das ist ihr jetziger Saal: ");
				anzeigenSaal(saal);
				System.out.println("Der Saal ist Geschlossen!!!");
				break;
			}
		}

	}

}

