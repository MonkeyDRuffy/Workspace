package Fussball1;

public class FussballTest {

	public static void main(String[] args) {

		Trainer gustav = new Trainer("Florian", 23, 7);
		Spieler martin = new Spieler("Dennis", 17, 10, 16, 4, 10);

		System.out.println("Trainer: " + gustav.toString());
		System.out.println("Spieler: " + martin.toString());

	}

}