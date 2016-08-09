package Methoden;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		boolean input2 = false;
		do {
			System.out.print("Eingabe: String, int, double, boolean: ");
			String input = IO.readString();

			if (input.equalsIgnoreCase("String")) {
				System.out.print("Bitte String eingeben: ");
				String inputS = IO.readString();
				System.out.
				println(inputS);

			} else if (input.equalsIgnoreCase("int")) {
				System.out.print("Bitte int Zahl eingeben: ");
				int inputI = IO.readInteger();
				System.out.println(inputI);

			} else if (input.equalsIgnoreCase("double")) {
				System.out.print("Bitte double Zahl eingeben: ");
				double inputD = IO.readDouble();
				System.out.println(inputD);

			} else if (input.equalsIgnoreCase("boolean")) {
				System.out.print("Bitte boolean Zahl eingeben: ");
				boolean inputB = IO.readboolean();
				System.out.println(inputB);
			}
			System.out.print("Weitere Eingabe Tätigen: ");
			input2 = IO.readboolean();
		} while (input2 == true);

	}

}