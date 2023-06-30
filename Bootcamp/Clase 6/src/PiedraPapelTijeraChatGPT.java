import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeraChatGPT  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras");
        System.out.println("Ingrese su elección: piedra, papel o tijeras");
        String eleccionUsuario = scanner.nextLine();

        int eleccionComputadora = random.nextInt(3);  // Genera un número aleatorio entre 0 y 2

        String eleccionComputadoraTexto = "";
        switch (eleccionComputadora) {
            case 0:
                eleccionComputadoraTexto = "piedra";
                break;
            case 1:
                eleccionComputadoraTexto = "papel";
                break;
            case 2:
                eleccionComputadoraTexto = "tijeras";
                break;
        }

        System.out.println("La computadora eligió: " + eleccionComputadoraTexto);

        String resultado = determinarGanador(eleccionUsuario, eleccionComputadoraTexto);
        System.out.println(resultado);
    }

    public static String determinarGanador(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            return "¡Es un empate!";
        } else if ((eleccionUsuario.equalsIgnoreCase("piedra") && eleccionComputadora.equals("tijeras"))
                || (eleccionUsuario.equalsIgnoreCase("papel") && eleccionComputadora.equals("piedra"))
                || (eleccionUsuario.equalsIgnoreCase("tijeras") && eleccionComputadora.equals("papel"))) {
            return "¡Felicidades! ¡Has ganado!";
        } else {
            return "Lo siento, has perdido. Inténtalo de nuevo.";
        }
    }
}