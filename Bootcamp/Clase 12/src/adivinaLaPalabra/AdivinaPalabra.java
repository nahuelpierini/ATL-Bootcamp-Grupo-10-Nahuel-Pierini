package adivinaLaPalabra;

import java.util.Scanner;

public class AdivinaPalabra {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese palabra a adivinar: ");
        String palabraIncognita = scanner.nextLine();

        System.out.print("Ingrese descripcion: ");
        String descripcion = scanner.nextLine();

        adivinarPalabra(scanner, palabraIncognita, descripcion);
    }

    private static void adivinarPalabra(Scanner scanner, String palabraIncognita, String descripcion) {
        String respuesta;
        do {
            System.out.println(descripcion);
            System.out.print("Respuesta: ");
            respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase(palabraIncognita)){
                System.out.println("Intentelo nuevamente...");
            }

        }while(!respuesta.equalsIgnoreCase(palabraIncognita));
        System.out.println("Felicidades, ha adivinado la palabra: " + respuesta );
    }

}
