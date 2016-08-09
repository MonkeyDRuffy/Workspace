package Tufan;

public class DurchHandyProFam {	//Ausgelagerter Code für die Berechnung der Durchschnitte von Handys pro Familie
	public static void allgemein(String[][] arr) {
		double dHpF;	//variable für Durchschnitt
		double handysumme = 0, z = 0;	//z=Familienanzahl
		for (int i = 0; i < arr.length; i++) {
			double iarr = Integer.parseInt(arr[i][4]);	//Handyanzahl in Double konvertiert
			handysumme = handysumme + iarr;	//Aufaddieren der Handys
			z++;	//Familiensumme
		}
		if (z != 0) {	//Sicherstellen das es min. 1 Familie gibt, da es sonst eine Fehlermeldung gibt
			dHpF = handysumme / z;	//Durchschnittsberechnung
		} else {
			dHpF = 0;
		}
		System.out.println("Durschnitt der Handys pro Familie: " + dHpF);	//Ausgabe des Durchschnittes
	}

	public static void arm(String[][] arr) {
		double dHpF;
		double handysumme = 0, z = 0;
		int maxwert=2500;	//Maximalwert des Monatgehaltes
		for (int i = 0; i < arr.length; i++) {
			double iarr = Integer.parseInt(arr[i][4]);
			double img = Integer.parseInt(arr[i][2]);	//Monatsgehalt konvertieren
			if (img < maxwert) {	//Vergleich von Monatgehalt und Maximalwert

				handysumme = handysumme + iarr;
				z = z + 1;
			}
		}
		if (z != 0) {
			dHpF = handysumme / z;
		} else {
			dHpF = 0;
		}
		System.out.println("Durschnitt der Handys pro Familie (Gesamt-Monatseinkommen < "+maxwert+"€): " + dHpF);
	}

	public static void mittel(String[][] arr) {
		double dHpF;
		double handysumme = 0, z = 0;
		int maxwert=5000, minwert=2500;
		for (int i = 0; i < arr.length; i++) {
			double iarr = Integer.parseInt(arr[i][4]);
			double img = Integer.parseInt(arr[i][2]);	//Monatsgehalt konvertieren
			if (img < maxwert && img >= minwert) {	//Vergleich mit Monatsgehalt und Min- und Maxwert

				handysumme = handysumme + iarr;
				z = z + 1;
			}
		}
		if (z != 0) {
			dHpF = handysumme / z;
		} else {
			dHpF = 0;
		}
		System.out.println("Durschnitt der Handys pro Familie ("+minwert+"€ < Gesamt-Monatseinkommen >"+maxwert+"€): " + dHpF);
	}

	public static void reich(String[][] arr) {
		double dHpF;
		double handysumme = 0, z = 0;
		int minwert=5000;
		for (int i = 0; i < arr.length; i++) {
			double iarr = Integer.parseInt(arr[i][4]);
			double img = Integer.parseInt(arr[i][2]);
			if (img >= minwert) {

				handysumme = handysumme + iarr;
				z = z + 1;
			}
		}
		if (z != 0) {
			dHpF = handysumme / z;
		} else {
			dHpF = 0;
		}
		System.out.println("Durschnitt der Handys pro Familie(Gesamt-Monatseinkommen > "+minwert+"€): " + dHpF);
	}
}