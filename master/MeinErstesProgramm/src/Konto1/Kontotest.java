package Konto1;

public class Kontotest {


	public static void main(String[] args) {
		Girokonto konto1 = new Girokonto("Dennis", "Arengold", 6);

		System.out.println("Kontostand: " +  konto1.getKontostand());

		konto1.einzahlen(1300);

		System.out.println("Kontostand: " + konto1.getKontostand());
		konto1.abheben(199.45);
		System.out.println("Kontostand: " + konto1.getKontostand());
	}




}
