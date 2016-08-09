package Konto3;

public  class Girokonto extends Konto {

	public Girokonto (Person inhaber, double kreditlimit) {
		super (inhaber, 0);
	}


	public void setKreditlimit(double kreditlimit) {
		super.kreditlimit = kreditlimit;
	}


	public void ueberweisen(double betrag){
		super.setKontostand(getKontostand() + betrag);
	}
	
	
	public void auszahlen(double betrag){
		super.setKontostand(getKontostand() - betrag);
	}
}
