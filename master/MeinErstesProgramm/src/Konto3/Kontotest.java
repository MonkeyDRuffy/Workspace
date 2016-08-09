package Konto3;

public class Kontotest {

	public static void main(String[] args) {
		Adresse adresse1 = new Adresse ("testweg","2", "bremen", "28279");
		Person person1 = new Person("Dennis", "Arengold", adresse1);

		System.out.println("sparkonto:	");
		Sparkonto sparkonto = new Sparkonto(person1);
		System.out.println("Neuer Kontostand:" +sparkonto.getKontostand());
		sparkonto.einzahlen(5100);
		System.out.println("Neuer Kontostand:" + sparkonto.getKontostand());
		sparkonto.auszahlen(100);
		System.out.println("Neuer Kontostand:"+ sparkonto.getKontostand());



		System.out.println("Girokonto	");
		Girokonto girokonto = new Girokonto(person1,1000);
		girokonto.auszahlen(4000);
		System.out.println("Neuer Kontostand:"+ girokonto.getKontostand());
		girokonto.ueberweisen(5000);
		System.out.println("Neuer Kontostand:" + girokonto.getKontostand());



	}

}
