package Fnum;

public class MehrdimensoinalesArrayMaxMin {

	public static void main(String[] args) {
		int[][] data = { 	{3, 2, 5, 7},
				{1, 4, 4, 8},
				{9, 1, 0, 2},
				{0, 2, 6, 3},
				{0, 2, 6, 3} };
		int min = data[0][0];
		int max = data[0][0];
		int zahl = 0;

		for ( int zeile = 0; zeile < data.length; zeile++){
			for ( int spalte=0; spalte < data[zeile].length; spalte++) {
				zahl = data[zeile][spalte];
				if(zahl < min){
					min = data[zeile][spalte];			
				}
				if (zahl > max){
					max = data[zeile][spalte];
				}
			}
		}

		System.out.println("kleinste zahl: " + min);
		System.out.println("größe zahl: " + max);

	}

}
