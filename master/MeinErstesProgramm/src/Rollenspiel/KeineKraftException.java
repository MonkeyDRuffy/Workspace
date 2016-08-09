package Rollenspiel;

public class KeineKraftException extends Exception {

	private Spielfigur name;
	private String aktion;
	
	public KeineKraftException(String aktion, String name) {
		
	}

	public Spielfigur getName() {
		return name;
	}

	public String getAktion() {

		return aktion;
	}
	
	@Override
	public String getMessage() {
		return name + "kann nicht mehr" + aktion;
		
	}
}

