import java.util.Scanner;

public class ConversorMillasKilometros {

    public static void main(String [] args){

        System.out.print("Ingrese distancia en millas: ");

        Scanner millasScan = new Scanner(System.in);
        double millasIngresadas = millasScan.nextDouble();


        System.out.print("La distancia en kilometros es " + kilometros(millasIngresadas) );

    }

    public static double kilometros( double distanciaMillas){

        return distanciaMillas*1.60934;
    }
}
