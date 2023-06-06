import java.util.Scanner;

public class CalculadoraDescuento {

    public static void main(String [] args) {

        System.out.print("Ingrese precio original de un producto: ");
        Scanner precioIngresado = new Scanner(System.in);
        double precioOriginal = precioIngresado.nextDouble();

        System.out.print("Ingrese porcentaje de descuento: ");
        Scanner descuentoIngresado = new Scanner(System.in);
        double descuento = descuentoIngresado.nextDouble();

        System.out.print("El precio Final con descuento es: " + precioFinal(precioOriginal,descuento));

    }

    public static double precioFinal(double precioOriginal,double descuento){
        return precioOriginal-(precioOriginal*descuento/100);
    }
}
