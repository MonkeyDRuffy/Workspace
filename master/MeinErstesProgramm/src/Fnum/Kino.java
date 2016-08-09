package Fnum;


import java.io.IOException;

import Methoden.IO;

public class Kino {

	public static void stornierenPlatz(String[][] saal) throws IOException{

		String stor = "O";

		System.out.println("In welcher Reihe soll der platz storniert werden? ");
		int storReihe = IO.readInt()-1;
		System.out.println("welcher sitz soll storniert werden? ");
		int storSitz = IO.readInt()-1;

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

		System.out.println("Wie viele reihen hat ihr Saal? ");
		int reihe = IO.readInt();
		System.out.println("Wie viele sitze hat eine reihe? ");
		int sitze = IO.readInt();	
		String[][] saal = erzeugenSaal(sitze,reihe);
		anzeigenSaal(saal);

		for(;;){
			reservierenPlatz(saal);
			anzeigenSaal(saal);

			System.out.println("Haben sie ein fehler beim reservieren gemacht?(j): ");
			String fehler = IO.readString();
			if(fehler.equalsIgnoreCase("j")){
				stornierenPlatz(saal);
				anzeigenSaal(saal);
			}

			System.out.println("Möchten sie noch ein Sitz reservieren?(n/j): ");
			String res = IO.readString();
			if(res.equalsIgnoreCase("n")){

				System.out.println("Das ist ihr jetztiger Saal");
				anzeigenSaal(saal);
				System.out.println("Der Saal ist jetzt geschlossen!!");
				break;
			}


		}

	}

}