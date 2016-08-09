package gui.oop.konto;


public class Person {
	protected String vorname;
	protected String nachname;
	protected Adresse adresse;

	public Person(String vorname, String nachname, Adresse adresse){
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString(){
		String text = "\nVorname: " + this.vorname;
		text = text + "\nNachname: " + this.nachname;
		text = text + "\nStrasse: " + adresse.getStrasse();
		text = text + "\nHausnummer: " + adresse.getNummer();
		text = text + "\nPostleitzahl: " + adresse.getPlz();
		text = text + "\nOrt: " + adresse.getOrt();
		return text;
	}
}