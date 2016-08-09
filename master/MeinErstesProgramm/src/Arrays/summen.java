package Arrays;

import java.io.IOException;

import Methoden.IO;

public class summen {

	public static void main(String[] args) throws IOException {
		int gerade = 0;
		int ungerade = 0;
		int sumgerade = 0;
		int sumungerade = 0;

		int a[]=IO.readIntegerArray();

		
		for (int i = 0; i < a.length; i++) {		
			if (a[i] %2 == 0){			
				gerade++;
				sumgerade += a[i];
			}

		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] %2 == 1){		
				ungerade++;
				sumungerade += a[i];
			}

		}
		
		System.out.println("Gerade Zahlen: ");
		System.out.println("Anzahl: " + gerade);
		System.out.println("Summe: " + sumgerade);
		System.out.println("Ungerade Zahlen: ");
		System.out.println("Anzahl: " + ungerade);
		System.out.println("Summe: " + sumungerade);
	}

}
