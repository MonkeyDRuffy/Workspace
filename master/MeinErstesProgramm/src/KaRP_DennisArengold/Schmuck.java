package KaRP_DennisArengold;

public class Schmuck extends Gegenstand {

	private String typ;

	public Schmuck(int id, double versicherungswert,String typ) {

		super(id,versicherungswert);

		this.typ = typ;

	}

}
