package gui.oop.konto;

public class KreditlimitUeberschrittenException extends Exception{

	private double kreditlimit;
	private double betrag;
	private double kontostand;

	public KreditlimitUeberschrittenException (double kreditlimit, double betrag, double kontostand) {
		this.kreditlimit = kreditlimit;
		this.betrag = betrag;
		this.kontostand = kontostand;
	}

	public double getKreditlimit() {
		return kreditlimit;
	}

	public double getKontostand() {
		return kontostand;
	}

	public double getBetrag() {
		return betrag;
	}

	@Override
	public String getMessage() {
		String text = "Ihr Kreditlimit wurde überschritten!";
		return text;
	}
}