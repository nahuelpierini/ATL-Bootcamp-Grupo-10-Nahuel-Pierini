import java.util.Scanner;

public class DiscoutCalculator {

    public static void main(String [] args) {

        System.out.print("Ingrese precio original de un producto: ");
        Scanner addedPrice = new Scanner(System.in);
        double originalPrice = addedPrice.nextDouble();

        System.out.print("Ingrese porcentaje de descuento: ");
        Scanner addedDiscount = new Scanner(System.in);
        double discount = addedDiscount.nextDouble();

        System.out.print("The final Price is: " + finalPrice(originalPrice,discount));

    }

    public static double finalPrice(double originalPrice, double discount){
        return originalPrice-(originalPrice*discount/100);
    }
}