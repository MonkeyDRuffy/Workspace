import java.util.Random;
import java.util.Scanner;

public class zahlenraten {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
 
        System.out.println("Geben Sie zufallszahl ein: ");
 
        int eingabezahl;
 
        do {
            eingabezahl = sc.nextInt();
            if (eingabezahl < randomInt) {
                System.out.println("Meine Zahl ist groesser!");
               
            } else if (eingabezahl > randomInt) {
                System.out.println("Meine Zahl ist kleiner!");
            }
        } while (eingabezahl != randomInt);
        System.out.println("Du bist ein richtiger RANDOM");
 
    }
 
}