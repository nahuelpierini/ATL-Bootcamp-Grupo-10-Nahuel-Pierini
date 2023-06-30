import java.util.Scanner;

public class DogAgeCalculator {
    public static void main (String [] args){

        System.out.print("Enter Dog age: ");
        Scanner scanAge = new Scanner(System.in);

        int dogAge = scanAge.nextInt();

        System.out.println("Dog age is: " + dogAge*7 );
    }
}
