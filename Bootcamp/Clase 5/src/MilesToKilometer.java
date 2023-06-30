import java.util.Scanner;

public class MilesToKilometer {

    public static void main(String [] args){

        System.out.print("Enter distance in Miles: ");

        Scanner milesScan = new Scanner(System.in);
        double milesAdded = milesScan.nextDouble();


        System.out.print("Distance in Kilometer is: " + kilometer(milesAdded) );

    }

    public static double kilometer(double distanceMiles){

        return distanceMiles*1.60934;
    }
}
