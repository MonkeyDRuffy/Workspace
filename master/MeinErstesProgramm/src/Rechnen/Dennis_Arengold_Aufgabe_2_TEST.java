package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dennis_Arengold_Aufgabe_2_TEST {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Naw;
		String Naw2;
		String Pva;
		
		System.out.println("Ist der Wert vom nettoauftragswert größer als 200?");
		Naw2 = br.readLine();
		System.out.println("Geben sie den Nettoauftragswert ein: ");
		Naw = br.readLine();
		int Naw3 = Integer.parseInt(Naw.trim().replace(',','.'));
		System.out.println("Geben sie denn Porto-Verpackungsanteil ein: ");
		Pva = br.readLine();
		int Pva2 = Integer.parseInt(Pva.trim().replace(',','.'));
		
		int Ergebnis1 = Naw3 + Pva2;
		
		int Ergebnis2 = Naw3 + Pva2 + 5;
		
		if (Naw2.equalsIgnoreCase("j")) {
			System.out.println(Ergebnis1);
		}
		else {
			System.out.println(Ergebnis2);
		}
		
		
		

	}

}
