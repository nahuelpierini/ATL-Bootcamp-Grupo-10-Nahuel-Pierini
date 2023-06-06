import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        int numero = (int) (Math.random()*100);
        System.out.println(numero);
        System.out.print("Adivine el numero: ");

        Scanner numScan = new Scanner(System.in);
        int  numeroIngresado = numScan.nextInt();

     if (numero == numeroIngresado){
         System.out.print("El numero es el correcto");
     }else{
         System.out.print("El numero no es el mismo");
     }


    }



}
