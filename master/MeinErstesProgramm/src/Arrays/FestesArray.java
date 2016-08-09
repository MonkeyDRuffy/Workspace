package Arrays;

import java.io.IOException;

import Methoden.IO;

public class FestesArray {

	public static void main(String[] args) throws IOException {
		
		int arr[] = new int[5]; 
		
		System.out.println("Welche Zahl soll in das erste Feld rein?: ");
		arr[0] = IO.readInt();
		
		System.out.println("Welche Zahl soll in das zweite Feld rein?: ");
		arr[1] = IO.readInt();
		
		System.out.println("Welche Zahl soll in das dritte Feld rein?: ");
		arr[2] = IO.readInt();
		
		System.out.println("Welche Zahl soll in das vierte Feld rein?: ");
		arr[3] = IO.readInt();
		
		System.out.println("Welche Zahl soll in das fünfte Feld rein?: ");
		arr[4] = IO.readInt();
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
