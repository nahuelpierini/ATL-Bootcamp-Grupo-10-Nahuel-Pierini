import java.util.Scanner;

public class CalculadoraPropina {

    public static void main(String [] args) {

        System.out.print("Ingrese total de la cuenta: ");
        Scanner precioIngresado = new Scanner(System.in);
        double totalCuenta = precioIngresado.nextDouble();

        System.out.print("Ingrese porcentaje de propina a dejar: ");
        Scanner porcentajeIngresado = new Scanner(System.in);
        double porcentajePropina = porcentajeIngresado.nextDouble();

        System.out.print("Monto a dejar de propina es:  " + propina(totalCuenta,porcentajePropina));
    }

    public static double propina(double totalCuenta, double porcentajePropina){
        return totalCuenta*(porcentajePropina/100);
    }
}
