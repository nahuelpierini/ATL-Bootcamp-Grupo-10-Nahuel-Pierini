
import java.util.Scanner;

public class Activities {
    public static void main(String [] args){
        System.out.print("Make a program that allows the user to enter 5 numbers and display them.\n");
        System.out.println("Enter 5 numbers: ");

        int[] numbers = new int[5];

        numbersAdded(numbers);
        majorAndMinor(numbers);
        average(numbers);
    }

    public static void numbersAdded(int[] numbers){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers added are: ");
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void majorAndMinor(int[] numbers){
        int major = numbers[0];
        int minor = numbers[0];

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > major){
                major = numbers[i];
            }
            if (numbers[i] < minor){
                minor = numbers[i];
            }
        }

        System.out.println("The major number is: " + major + "\nThe minor number is: " + minor );
    }

    public static void average(int [] numbers){

        int summation = 0;

        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            summation += num;
        }

        float average = summation/ numbers.length;


        System.out.printf("The average of the 5 numbers is: %.2f\n ", average );
    }


}
