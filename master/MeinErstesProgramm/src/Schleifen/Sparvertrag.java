package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Sparvertrag {


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		String antwort;
		do {
			System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
			String text = br.readLine();
			int n = Integer.parseInt(text.trim());
			System.out.print("Bitte Kapital eingeben: ");
			text = br.readLine();
			double aK = Double.parseDouble(text.trim().replace(",", "."));
			System.out.print("Bitte Zinssatz eingeben: ");
			text = br.readLine();
			double Pz = Double.parseDouble(text.trim().replace(",", "."));
			System.out.println("Jahr\t" + "Anfangskapital\t" + "Zinsbetrag\t"
					+ "Jahresendbetrag");
			
			double endbetrag = aK;
			for (int i = 1; i <= n; i++) {
				System.out.print(i);
				System.out.print("\t"
						+ df.format(Math.round(endbetrag * 100) / 100.0));
				double zinsbetrag = (endbetrag * Pz) / 100;
				System.out.print("\t" + "\t"
						+ df.format(Math.round(zinsbetrag * 100) / 100.0));
				endbetrag = endbetrag + zinsbetrag;
				System.out.println("\t" + "\t"
						+ df.format(Math.round(endbetrag * 100) / 100.0));

			}
			System.out.println();
			System.out.print("Weiteren Sparvertrag berechnen ? -> Dann 'j' eingeben!");
			antwort = br.readLine();
			
		} while (antwort.equalsIgnoreCase("j"));
		
	}
	
}