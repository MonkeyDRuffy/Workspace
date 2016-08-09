package Konto1;

public  class Girokonto extends Konto {

	public Girokonto (Person inhaber, double kreditlimit) {
		super (inhaber, 0);
	}


	public void setKreditlimit(double kreditlimit) {
		super.kreditlimit = kreditlimit;
	}


	public void überweisen(double betrag){
		super.setKontostand(getKontostand() + betrag);
	}
}
