package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dennis_Arengold_Aufgabe_1_TEST {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
				
		System.out.println("Geben sie Bitte die Rente an: ");
		String r = br.readLine();
		Double Rente =  Double.parseDouble(r.trim().replace(',','.'));
		System.out.println("Geben sie bitte die Laufzeit an: ");
		String n = br.readLine();
		double laufzeit =  Double.parseDouble(n.trim().replace(',','.'));
		System.out.println("Geben sie bitte den Zinssatz an: ");
		String p = br.readLine();
		double Prozent =  Double.parseDouble(p.trim().replace(',','.'));
		
		double q = Prozent + 1;

		System.out.println("Endwert: "+ ((Rente * ((Prozent*laufzeit)-1)/q-1)));
		
		
		
		
	}

}
