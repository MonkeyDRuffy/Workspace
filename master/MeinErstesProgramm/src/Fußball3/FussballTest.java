package Fuﬂball3;

public class FussballTest {

	public static void main(String[] args) {

		Trainer gustav = new Trainer("Florian", 23, 7);
		Spieler martin = new Spieler("Dennis", 17, 10, 16, 4, 10);
		Torwart Fabian = new Torwart("Fabian",19, 10, 4, 10);

		System.out.println("Trainer " + gustav.toString());
		System.out.println("-------");
		System.out.println("Spieler " + martin.toString());
		System.out.println("-------");
		System.out.println("Torwart " + Fabian.toString());
	}

}