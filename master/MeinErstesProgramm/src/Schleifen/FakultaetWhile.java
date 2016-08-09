package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte Zahl eingeben: ");
		int n = Integer.parseInt(br.readLine().trim().replace(',','.'));
		int i = 0;
		int fakultaet = 1;
		while(i<n){
			i++;
			fakultaet=fakultaet*i;
		}
		System.out.println(fakultaet);
	}

}