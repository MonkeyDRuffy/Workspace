package Konto3;

public class Konto {

	private Person inhaber;
	protected double kontostand;
	protected double kreditlimit;

	public Konto(Person inhaber,double kreditlimit){

		this.inhaber=inhaber;
		this.kontostand=0;
		this.kreditlimit=kreditlimit;
	}
	
	public Person getInhaber() {
		return inhaber;
	}
	public void setInhaber(Person inhaber) {
		this.inhaber = inhaber;
	}
	public double getKontostand(){
		return kontostand;
	}
	public double getKreditlimit(){
		return kreditlimit;
	}
	public void setKontostand(double Kontostand){
		this.kontostand=Kontostand;
	}
	public void setKreditlimit(double Kreditlimit){
		this.kreditlimit=Kreditlimit;
	}
	public void einzahlen(double betrag){
		this.kontostand = kontostand + betrag;
	}
	public void abheben(double betrag){
		if(betrag <= this.kontostand + kreditlimit) {
			this.kontostand = this.kontostand - betrag;}
	}

}
