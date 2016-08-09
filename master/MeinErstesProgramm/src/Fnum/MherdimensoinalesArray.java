package Fnum ;

public class MherdimensoinalesArray {

	public static void main ( String[] args ) {
		int[][] data = { 	{3, 2, 5, 7},
				{1, 4, 4, 8},
				{9, 1, 0, 2},
				{0, 2, 6, 3},
				{0, 2, 6, 3, 42} };

		int [] zeilen = new int [data.length];
		int [] spalten= new int [data.length];

		// Summe deklarieren
		int summe;

		//Matrix ausgeben
		for ( int zeile=0; zeile < data.length; zeile++) {
			for ( int spalte = 0; spalte < data[zeile].length; spalte++){
				System.out.print(data[zeile][spalte] + " ");
			}
			System.out.println();
		}
		// Summe berechnen
		for ( int zeile = 0; zeile < data.length; zeile++){
			for ( int spalte=0; spalte < data[zeile].length; spalte++) {
				zeilen[spalte] += data[zeile][spalte];
			}
		}
		for ( int zeile=0; zeile < data.length; zeile++) {
			summe = 0;
			for ( int spalte = 0; spalte < data[0].length; spalte++){
				summe = summe + data[zeile][spalte];
			}
			spalten[zeile]=summe;
		}

		// Summe ausgeben
		for (int i=0; i < zeilen.length; i++ ) {
			System.out.println("Summe der Zeile " +(i+1) +": " +spalten[i]);
			System.out.println("Summe der Spalte " +(i+1) +": " +zeilen[i]);
		}
	}
}