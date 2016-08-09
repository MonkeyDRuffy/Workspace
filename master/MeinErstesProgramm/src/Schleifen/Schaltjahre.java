package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schaltjahre {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Mit welchem Jahr soll gestartet werden?: ");
		String A = br.readLine();
		int anfang = Integer.parseInt(A.trim());
		
		System.out.println("Mit welchem Jahr soll es enden? ");
		String N = br.readLine();
		int ende = Integer.parseInt(N.trim());
		
		

	}

}
