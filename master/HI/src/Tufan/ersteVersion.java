//Ausgabe: Tabelle...?
//CodeDokumentation//75%
package Tufan;

import javax.swing.*;
import Tufan.DurchHandyProFam;

public class ersteVersion {

	public static void main(String[] args) {
		int y = 1;  //Variable zur Wiederholung der do-while-Schleife
		
		//String für Bearbeitung(vor Abgabe rausschneiden)
			/* String[][] arr ={{"Kim","Lin","9000","1","5","9000"},
			 * {"Ben","Bam","300","2","2","150"}};
			 */

		// Anzahl der Befragten_Länge des Arrays
		String Z = JOptionPane.showInputDialog("Wie viele Leute wurden befragt?");
		int z = Integer.parseInt(Z);

		// Erstellen des Arrays
		String[][] arr = new String[z][6];

		// Füllen des Arrays
		for (int i = 0; i < z; i++) {
			do {
				y = 1;	//bei wiederholung der Schleife y wieder auf 1 setzen
				try {	//Falls irgent wo in der Eingabe, bzw bei den Berechnungen ein Fehler auftritt wird zu 'catch' gesprungen 
					for (int j = 0; j < 6; j++) {
						switch (j) {
						//Eingabe des Vornamens
						case 0: {
							arr[i][j] = JOptionPane.showInputDialog((i + 1) + "." + (j + 1) + " Vorname der Person:");
							break;
						}
						//Eingabe des Nachnamens
						case 1: {
							arr[i][j] = JOptionPane.showInputDialog((i + 1) + "." + (j + 1) + " Nachname der Person:");
							break;
						}
						//Eingabe des Gesamt-Monatseinkommen des Haushaltes 
						case 2: {
							arr[i][j] = JOptionPane.showInputDialog(
									(i + 1) + "." + (j + 1) + " Gesamt-Monatseinkommen des Haushaltes:");
							break;
						}
						//Eingabe der im Haushalt lebenden Personen
						case 3: {
							arr[i][j] = JOptionPane
									.showInputDialog((i + 1) + "." + (j + 1) + " Im Haushalt lebende Personen:");
							break;
						}
						//Eingabe der Handys im Haushalt
						case 4: {
							arr[i][j] = JOptionPane
									.showInputDialog((i + 1) + "." + (j + 1) + " Im Haushalt verfügbare Handys:");
							break;
						}
						//Berechnung ProKopfEinkommen
						case 5: {
							double einkommen = Integer.parseInt(arr[i][2]);	//Muss wegen String-Array in einen Double konvertiert werden
							double personen = Integer.parseInt(arr[i][3]);
							double durschnitt = einkommen / personen;	//Berechnen des ProKopfEinkommen
							arr[i][j] = Double.toString(durschnitt);	//Eingabe in das Array
							break;
						}
						}
					}

				} catch (Exception e) {	//Bei Fehlermeldung geht es hier weiter
					y = 0;	//Wiederholung der do-while-Schleife
					JOptionPane.showMessageDialog(null,
							"Es gab einen Fehler bei der Eingabe\n" + "Bitte versuchen Sie es nochmal.");

				}
			} while (y == 0);	//Ende der do-while-Schleife//Wiederholung bei Fehlermeldung 
		}

		// Anzeigen des Array Inhaltes
		System.out.println("\tVorname\tNachname\tGME" + "\tPersonen\tHandys\tPKE");
		for (int i = 0; i < z; i++) {	// arr.length statt z bei progremmieren
			System.out.println((i + 1) + ".\t" + arr[i][0] + "\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t" + arr[i][3]
					+ "\t\t" + arr[i][4] + "\t" + arr[i][5]);	//\t sorgt für untereinander schreiben der Angaben
		}

		// Berechnung des Durchschnittes von Handys pro Familie. aus 'DurchHandyProFam'-Datei und Ausgabe
		DurchHandyProFam.allgemein(arr);

		//Berechnung von durchschnitt mit < 2500€ Monatseinkommen und Ausgabe
		 DurchHandyProFam.arm(arr);

		//Berechnung von durchschnitt mit >= 2500€ Monatseinkommen <5000 und Ausgabe
		DurchHandyProFam.mittel(arr);
		

		//Berechnung von durchschnitt mit >= 5000€ Monatseinkommen und Ausgabe
		DurchHandyProFam.reich(arr);
		

	}
}
