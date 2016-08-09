package KaRP_DennisArengold;

import java.io.IOException;

import Methoden.IO;

public class TestenTresor {


	public static void main(String[] args) throws IOException {
	
		int a;
		String ring = null;
		String kette = null;
		String he = null;
		String ho = null;
	
		Tresor Tresor = new Tresor();
		
		Schmuck schmuck1 = new Schmuck(1,149.99,ring);
		Schmuck	schmuck2 = new Schmuck(2,99.99,kette);
		Aktie aktie1 = new Aktie(3,1000.0,he,1);
		Aktie aktie2 = new Aktie(4,2000.0,ho,2);
		
		Tresor.addGegenstand(schmuck1);
		Tresor.addGegenstand(schmuck2);
		Tresor.addGegenstand(aktie1);
		Tresor.addGegenstand(aktie2);
		
		Tresor.druckeListe();
		Tresor.nimmGegenstand(4);
		
		System.out.println("Gib eine falsche ID ein:");
		a = IO.readInt();
		GegenstandNichtGefundenException.getMessage();
		
		
	}

}
