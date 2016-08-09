package Konto3;

public class Sparkonto extends Konto {

	public Sparkonto( Person inhaber) {

		super(inhaber,0);

	}
	public void auszahlen(double betrag){
		super.setKontostand(getKontostand() - betrag);
	}
}