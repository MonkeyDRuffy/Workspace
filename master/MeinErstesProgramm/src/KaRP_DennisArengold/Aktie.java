package KaRP_DennisArengold;

public class Aktie extends Gegenstand {

	private String unternehmen;
	private int nennwert;

	public Aktie(int id, double versicherungswert, String unternehmen, int nennwert){

		super(id,versicherungswert);

		this.unternehmen = unternehmen;
		this.nennwert = nennwert;

		return;

	}

	public String getUnternehmen() {
		return unternehmen;
	}

	public void setUnternehmen(String unternehmen) {
		this.unternehmen = unternehmen;
	}

	public int getNennwert() {
		return nennwert;
	}

	public void setNennwert(int nennwert) {
		this.nennwert = nennwert;
	}
}
