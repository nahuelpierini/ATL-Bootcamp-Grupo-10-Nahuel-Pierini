import java.util.Scanner;

public class BuscadorDePaises {
    public static void main(String [] args){
        System.out.print("Ingrese un pais: ");
        Scanner scanner = new Scanner(System.in);
        String paisIngresado = scanner.nextLine();

        System.out.print("https://www.google.com/maps/search/" + paisIngresado);


    }
}
