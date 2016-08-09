 package Rechnen;




		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Anrede {

		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Name eingeben : ");
		String Name = br.readLine();
		System.out.print("Bitte Geschlecht angeben. 1 für Mann und 2 für Frau: ");
		String Gender = br.readLine();
		double gender2 = Double.parseDouble(Gender.trim().replace(',','.'));

		if (gender2 == 1)
		{
		System.out.println("Hallo Herr ");
		}
		else if (gender2 == 2)
		{
		System.out.println("Hallo Frau ");
		}
		else
		{
		System.out.println("Moin ");
		}

		System.out.println(Name);
		}

		}	
		
		