package KaRP_DennisArengold;

public abstract class  Gegenstand {

	protected int id;
	protected double versicherungswert;

	public Gegenstand(int id, double versicherungswert){

		this.id = id;
		this.versicherungswert = versicherungswert;

	}

	public String drucken(){


		return null;

	}

}
