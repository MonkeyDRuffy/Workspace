package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

public static void main(String[] args) throws IOException {
//Deklarieren und Intialisieren des BufferedReader.
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
String text;

System.out.println("Bitte geben sie ihr Geschlecht an?");
String text2 = br.readLine();

System.out.println("Wie groﬂ sind sie? Grˆﬂe in cm angeben.");
text = br.readLine();
double groesse = Double.parseDouble(text.trim().replace(',','.'));

System.out.println("Bitte geben sie ihr Gewicht in kg an");
text = br.readLine();
double gewicht = Double.parseDouble(text.trim().replace(',','.'));

//BMI berechnen (Gewicht/Grˆﬂe)
double groeﬂe2 = groesse*groesse;
double bmi = gewicht/groeﬂe2;
double bmi2 = Math.round(10.0 * bmi) / 10.0;


//Untergewicht
if ((text2.equals("w") && (bmi<19)) || (text2.equals("m") && (bmi<20)))
{
System.out.println("BMI: " +bmi2);
System.out.println("Untergewicht");
}

//Normalgewicht
if ((text2.equals("w") && (bmi>=19 && bmi<24)) || (text2.equals("m") && (bmi>=20 && bmi<25)))
{
System.out.println("BMI: " +bmi2);
System.out.println("Normalgewicht");
}

//¸bergewicht
if ((text2.equals("w") && (bmi>=25 && bmi<30)) || (text2.equals("m") && (bmi>=26 && bmi<30)))
{
System.out.println("BMI: " +bmi2);
System.out.println("¸bergewicht");
}

//Adipositas
if ((text2.equals("w") && (bmi>=31 && bmi<40)) || (text2.equals("m") && (bmi>=31 && bmi<40)))
{
System.out.println("BMI: " +bmi2);
System.out.println("Adipositas");
}

//starke Adipositas
if ((text2.equals("w") && (bmi>40)) || (text2.equals("m") && (bmi>40)))
{
System.out.println("BMI: " +bmi2);
System.out.println("starke Adipositas");
}

}
}