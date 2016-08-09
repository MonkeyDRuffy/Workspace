package gui.oop.konto;

public class Girokonto extends Konto {

	//Konstruktor
	public Girokonto (Person inhaber, double kreditlimit) {
		super (inhaber , 0);
	}

	//Setter Kreditlimit
	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}

	//Überweisen
	public void ueberweisen(double betrag) {
		if (((kontostand + kreditlimit) - betrag) >= 0) {
			super.kontostand = super.kontostand - betrag;
		}
		else {
			System.out.println("Betrag konnte nicht überwiesen werden. ");
		}
	}
}