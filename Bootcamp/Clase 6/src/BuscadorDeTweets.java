import java.util.Scanner;

public class BuscadorDeTweets {

    public static void main(String[] args){
        System.out.print("Ingrese una palabra para buscar en Twitter: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();

        System.out.print("https://twitter.com/search?q=" + palabra);


    }
}
