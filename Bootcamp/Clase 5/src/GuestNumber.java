import java.util.Scanner;

public class GuestNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random()*100);
        System.out.println(number);
        System.out.print("Guest the number: ");

        Scanner numScan = new Scanner(System.in);
        int  addedNumber = numScan.nextInt();

     if (number == addedNumber){
         System.out.print("The number is correct");
     }else{
         System.out.print("The number is different");
     }


    }



}
