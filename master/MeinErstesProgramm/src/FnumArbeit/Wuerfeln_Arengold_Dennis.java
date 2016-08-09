package FnumArbeit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wuerfeln_Arengold_Dennis {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Integer readInt() throws IOException {
		while (true) {
			try {
				String i = br.readLine();
				int number = Integer.parseInt(i.trim().replace(',','.'));
				return number;
			}
			catch (NumberFormatException e) {
				System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
			}
		}
	}

	public static void mittelWert(int[][] wuerfeln){

		double summe = 0;
		double mittel = 0;

		for (int zeile = 0; zeile < wuerfeln.length; zeile++){
			for (int spalte = 0; spalte < wuerfeln[0].length ; spalte++){
				summe += wuerfeln[zeile][spalte];
				mittel = summe * 0.5;
			}
		}
		System.out.println("Der Mittelwert beträgt: " + mittel);
	}

	public static void hoechsteUndKleinsteZahl(int[][] wuerfeln){

		int min = wuerfeln[0][0];
		int max = wuerfeln[0][0];

		int zahl = 0;

		for ( int zeile = 0; zeile < wuerfeln.length; zeile++){
			for ( int spalte=0; spalte < wuerfeln[zeile].length; spalte++) {
				zahl = wuerfeln[zeile][spalte];
				if(zahl < min){
					min = wuerfeln[zeile][spalte];			
				}
				if (zahl > max){
					max = wuerfeln[zeile][spalte];
				}
			}
		}
		System.out.println("kleinste zahl: " + min);
		System.out.println("größte zahl: " + max);
	}

	public static void arrayFuellen(int[][] wuerfeln) throws IOException{
		System.out.println("Geben sie an welche zahlen sie gewürfelt haben:");
		System.out.println("Erst die zahl vom jeden würfel beim ersten wurf ");
		System.out.println("und danach die zahl vom jeden würfel beim zweiten wurf usw.");

		for ( int zeile=0; zeile < wuerfeln.length; zeile++) {
			for ( int spalte = 0; spalte < wuerfeln[zeile].length; spalte++){
				System.out.println("Geben sie die Zahl ein:");
				int a = IO.readInt();
				wuerfeln[zeile][spalte] = a;
			}
		}
	}

	public static void summeBerechnen(int[][] wuerfeln){
		int gesamtsumme = 0;

		for (int zeile = 0; zeile < wuerfeln.length; zeile++){
			for (int spalte = 0; spalte < wuerfeln[0].length ; spalte++){
				gesamtsumme += wuerfeln[zeile][spalte];

			}
		}
		System.out.println("Gesamtsumme des Arrays: " + gesamtsumme);
	}

	public static void anzeigenWuerfelMatrix(int[][] wuerfeln){


		for ( int zeile=0; zeile < wuerfeln.length; zeile++) {
			for ( int spalte = 0; spalte < wuerfeln[zeile].length; spalte++){
				System.out.print(wuerfeln[zeile][spalte] + " ");
			}
			System.out.println();
		}


	}


	public static void main(String[] args) throws IOException {

		System.out.println("Geben sie an wie viele Experimente gemacht wurden: ");
		int expAn = IO.readInt();

		for(int i = 1; i <= expAn; i++){

			System.out.println();
			System.out.println("Geben sie an wie oft sie würfeln: ");
			int wuerfelMe = IO.readInt();
			System.out.println("Mit wie vielen Würfeln würfeln sie?: ");
			int wuerfelAn = IO.readInt();

			int[][] wuerfeln = new int[wuerfelMe][wuerfelAn];


			anzeigenWuerfelMatrix(wuerfeln);
			arrayFuellen(wuerfeln);
			anzeigenWuerfelMatrix(wuerfeln);
			summeBerechnen(wuerfeln);
			hoechsteUndKleinsteZahl(wuerfeln);
			mittelWert(wuerfeln);
		}
		System.out.println("IHR PROGRAMM WURDE BEENDET!!!");
	}
}