package Rollenspiel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String name;
		String aktion;
		int laufen;
		
		System.out.println("wie soll ihre Figur hei�en?");
		name = br.readLine();
		
		Spielfigur a = new Spielfigur (name,100);
		
		System.out.println("Ihre Figur: " + a.getName());
		System.out.println("welche aktion m�chten sie ausf�hren?");
		aktion = br.readLine();
		
		if(aktion.equals("laufen")){
			lauf = ;
			
			
			
		}
		
	}

}
