package Rechnen;

public class Dreieck2 {

	public static void main(String[] args) {
		
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