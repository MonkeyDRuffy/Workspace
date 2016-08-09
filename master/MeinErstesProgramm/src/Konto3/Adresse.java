package Konto3;

public class Adresse {

	private String strasse;
	private String hr;
	private String ort;
	private String plz;

	public Adresse(String straﬂe,String hr,String ort, String plz){

		this.strasse=strasse;
		this.hr=hr;
		this.ort=ort;
		this.plz=plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
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