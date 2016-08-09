package Rollenspiel;

public class Spielfigur {

	private String name;
	private int staerkepunkte;

	public Spielfigur (String name, int starkepunkte) throws Exception {



	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaerkepunkte() {
		return staerkepunkte;
	}

	public void setStaerkepunkte(int staerkepunkte) {
		this.staerkepunkte = staerkepunkte;
	}


	public void laufen (int staerkepunkte) throws KeineKraftException {
		if(staerkepunkte >= 2){
			this.staerkepunkte = staerkepunkte -2;
			System.out.println(name + "laeuft");
		}
		else{
			throw new KeineKraftException ("laufen" , name);
		}
	}

	public void klettern (int staerkepunkte) throws KeineKraftException {
		if(staerkepunkte >= 4){
			this.staerkepunkte = staerkepunkte -4;
			System.out.println(name + "klettert");
		}
		else{
			throw new KeineKraftException ("klettern" , name);
		}
	}

	public void kämpfen (int staerkepunkte) throws KeineKraftException {
		if(staerkepunkte >=5){
			this.staerkepunkte = staerkepunkte -5;
			System.out.println(name + "kaempft");
		}
		else{
			throw new KeineKraftException ("kämpfen" , name);
		}
	}
}
