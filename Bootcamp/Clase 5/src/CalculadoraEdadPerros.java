import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main (String [] args){

        System.out.print("Ingrese edad del perro: ");
        Scanner scanEdad = new Scanner(System.in);

        int edadPerro = scanEdad.nextInt();

        System.out.println("La edad del perro en años humano es: " + edadPerro*7 );
    }
}
