import java.util.Scanner;

public class TipsCalculator {

    public static void main(String [] args) {

        System.out.print("Enter total amount of price: ");
        Scanner priceAdded = new Scanner(System.in);
        double total = priceAdded.nextDouble();

        System.out.print("Enter porcentage of tips: ");
        Scanner porcentageAdded = new Scanner(System.in);
        double porcentageTips = porcentageAdded.nextDouble();

        System.out.print("Amount of Tips:  " + tips(total,porcentageTips));
    }

    public static double tips(double totalAmount, double tipsporcentage){
        return totalAmount*(tipsporcentage/100);
    }
}
