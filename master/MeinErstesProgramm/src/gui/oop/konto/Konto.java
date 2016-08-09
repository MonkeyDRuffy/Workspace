package gui.oop.konto;

public abstract class Konto {

	// Deklaration der Variablen
	protected Person inhaber;
	protected double kontostand;
	protected double kreditlimit;

	public Konto (Person inhaber, double kontostand){
		this.inhaber = inhaber;
		this.kontostand = kontostand;
	}

	// getter, setter erstellen
	public double getKontostand() {
		return kontostand;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public Person getInhaber() {
		return inhaber;
	}

	public void setInhaber(Person inhaber) {
		this.inhaber = inhaber;
	}

	// einzahlen/abheben
	public void einzahlen(double betrag){
		this.kontostand = kontostand += betrag;
	}

	public void abheben(double betrag) throws KreditlimitUeberschrittenException {
		if ((kontostand - betrag) >=0 || (kreditlimit >= betrag)){
			kontostand -= betrag;
		}
		else {
			throw new KreditlimitUeberschrittenException(kontostand, kreditlimit, betrag);
		}
	}
}
