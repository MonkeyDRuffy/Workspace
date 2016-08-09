package gui.oop.konto;

public class Adresse {

	protected String strasse;
	protected String nummer;
	protected String ort;
	protected String plz;


	public Adresse (String strasse, String nummer, String ort, String plz) {
		this.strasse = strasse;
		this.nummer = nummer;
		this.ort = ort;
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;

	}
}