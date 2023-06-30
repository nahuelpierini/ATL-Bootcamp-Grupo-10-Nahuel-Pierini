import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String [] args) {
        System.out.print("Elija un numero:  (1) Piedra  (2) Papel o  (3) Tijera: ");
        Scanner scanner = new Scanner(System.in);
        int jugador = scanner.nextInt();
        System.out.println();

        int computadora = (int) (Math.random() * 3 + 1);

        eleccionComputadora(computadora);

        ganador(jugador,computadora);
    }

    public static void ganador(int jugador, int computadora){
        if (jugador == 1 && computadora == 1) {
            System.out.print("Empate, ambos eligieron Piedra");
        } else if (jugador == 2 && computadora == 2) {
            System.out.print("Empate, ambos eligieron Papel");
        } else if (jugador == 3 && computadora == 3) {
            System.out.print("empate, ambos eligieron Tijera");
        } else if(jugador == 1 && computadora == 2){
            System.out.print("Gana Computadora, Papel mata Piedra");
        } else if(jugador == 1 && computadora == 3) {
            System.out.print("Gana Jugador, Piedra mata Tijeras");
        } else if(jugador == 2 && computadora == 1) {
            System.out.print("Gana Jugador, Papel mata Piedra");
        } else if(jugador == 2 && computadora == 3) {
            System.out.print("Gana Computadora, Tijera mata Papel");
        } else if(jugador == 3 && computadora == 1) {
            System.out.print("Gana Computadora, Piedra mata Tijera");
        } else if(jugador == 3 && computadora == 2) {
            System.out.print("Gana Jugador, Tijera mata Papel");
        };
    }

    public static void eleccionComputadora(int computadora){
        if (computadora == 1) {
            System.out.println("Computadora elige: Piedra");
        } else if (computadora == 2){
            System.out.println("Computadora elige: Papel");
        } else if (computadora == 3){
            System.out.println("Computadora elige: Tijera");
        }
    }
}
