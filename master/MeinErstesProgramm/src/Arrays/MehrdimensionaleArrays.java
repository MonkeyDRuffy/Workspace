package Arrays;

public class MehrdimensionaleArrays {

	public static void main(String[] args) {
		int [][] data = {{3,2,5,7},
				{1,4,4,8},
				{9,1,0,2},
				{0,2,6,3}};
		
		int[] summeZeile = new int[4];
		
		//Summe deklarieren
		
		int summeZeile1 = 0;
		int summeSpalte = 0;
		int gesamtSumme = 0;
		
		
		//Summe berechnen
		for (int zeile = 0; zeile < data.length; zeile++){
			for (int spalte = 0; spalte < data[0].length ; spalte++){
				gesamtSumme += data[zeile][spalte];
				

				
				
			}
		}
		
		System.out.println("Gesamtsumme des Arrays: " + gesamtSumme);

	}
	

}
