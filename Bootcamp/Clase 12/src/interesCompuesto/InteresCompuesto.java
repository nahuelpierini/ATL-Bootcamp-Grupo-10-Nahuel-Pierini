package interesCompuesto;

import java.util.Scanner;

public class InteresCompuesto {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese capital inicial: ");
        double capitalInicial = scanner.nextFloat();

        System.out.print("Ingrese tasa de interes: ");
        double tasaDeInteres = scanner.nextFloat();

        System.out.print("Ingrese tiempo en años que tendra invertido el dinero: ");
        int aniosInvertidos = scanner.nextInt();

        formulaInteresCompuesto(capitalInicial, tasaDeInteres, aniosInvertidos);

    }

    private static void formulaInteresCompuesto(double capitalInicial, double tasaDeInteres, int aniosInvertidos) {
        double capitalFinal;
        double porcentajeTasaInteres = (tasaDeInteres/100);

        capitalFinal = capitalInicial * (Math.pow((1+porcentajeTasaInteres),aniosInvertidos));
        System.out.printf("El capital final es: %.2f", capitalFinal);
    }
}
