package Rechnen;

public class Dreiecksungleichung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int a = 3;
			int b = 4;
			int c = 5;

			if (((a < b + c) && (c < a + b)) && (b < a + c))
			{
				System.out.println("Es liegt ein Dreieck vor");
			}
			else
			{
				System.out.println("Es liegt KEIN Dreieck vor");
			} 
		}
		
	}
	
}


