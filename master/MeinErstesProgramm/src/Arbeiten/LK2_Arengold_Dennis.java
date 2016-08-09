package Arbeiten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class LK2_Arengold_Dennis {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0");
		String antwort;
		do {
			System.out.print("Bitte Menge in mg eingeben: ");
			String text = br.readLine();
			double aK = Double.parseDouble(text.trim().replace(",", "."));
			System.out.print("Bitte Zerfallsrate pro Jahr in Prozent eingeben: ");
			text = br.readLine();
			double Pz = Double.parseDouble(text.trim().replace(",", "."));
			System.out.print("Bitte Zeitspanne in Jahren eingeben: ");
			text = br.readLine();
			System.out.println();
			int n = Integer.parseInt(text.trim());
			System.out.println("Jahr\t" + "Menge am Jahresanfang\t" + "Zerfall\t" + "	Menge am Jahresende\t");
			System.out.println("----\t" + "---------------------\t" + "-------\t" + "	-------------------\t");
			double endbetrag = aK;
			for (int i = 1; i <= n; i++) {
				System.out.print(i);
				System.out.print("\t"
						+ df.format(Math.round(endbetrag * 100) / 100.0));
				double zerfall = (endbetrag * Pz) / 100;
				System.out.print("\t" + "	\t"
						+ df.format(Math.round(zerfall * 100) / 100.0));
				endbetrag = endbetrag - zerfall;
				System.out.println("\t" + "\t"
						+ df.format(Math.round(endbetrag * 100) / 100.0));

			}
			System.out.println();
			System.out.print("Weitere Aufgabe bearbeiten? 1 = ja/ 0 = Nein:");
			antwort = br.readLine();

		} while (antwort.equalsIgnoreCase("1"));

	}

}

