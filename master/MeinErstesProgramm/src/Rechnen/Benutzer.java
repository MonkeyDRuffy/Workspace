package Rechnen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
System.out.print(" Mathenote eingeben : ");
String Fach1 = br.readLine();
System.out.print(" Deutschnote eingeben : ");
String Fach2 = br.readLine();
System.out.print(" Englischnote eingeben : ");
String Fach3 = br.readLine();
System.out.print(" Politiknote eingeben : ");
String Fach4 = br.readLine();
System.out.print(" Informatiknote eingeben : ");
String Fach5 = br.readLine();
System.out.print(" Sportnote eingeben : ");
String Fach6 = br.readLine();
double zahl1 = Double.parseDouble(Fach1.trim().replace(',','.'));
double zahl2 = Double.parseDouble(Fach2.trim().replace(',','.'));
double zahl3 = Double.parseDouble(Fach3.trim().replace(',','.'));
double zahl4 = Double.parseDouble(Fach4.trim().replace(',','.'));
double zahl5 = Double.parseDouble(Fach5.trim().replace(',','.'));
double zahl6 = Double.parseDouble(Fach6.trim().replace(',','.'));
System.out.println("Notendurchschnitt: "+ ((zahl1 + zahl2 + zahl3 + zahl4 + zahl5 + zahl6) /6));

}

}

	
