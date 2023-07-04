package amigosInvisibles;

import java.util.*;

public class AmigoInvisible {
    private static final List<String> participantes = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner nombre = new Scanner(System.in);
        int opciones;

        try {
            do {
                opciones = mostrarMenu(scanner);

                switch (opciones) {
                    case 1: {
                        IngreseParticipantes(nombre);
                        break;
                    }
                    case 2: {
                        reparticionDeRegalos();
                        break;
                    }
                    case 3: {
                        System.out.println("Hasta luego");
                        break;
                    }
                    default: {
                        System.out.println();
                        System.out.println("Ingrese numero entre 1 y 3");
                    }
                }
            } while (opciones != 3);
        }catch (Exception exc){
            System.out.println("Ha ocurrido un error de tipeo");
        }
    }


    private static void IngreseParticipantes(Scanner nombre) {
        System.out.println();
        System.out.println("Ingrese nombre del participante:");
        participantes.add(nombre.nextLine());
    }

    private static int mostrarMenu(Scanner scanner) {
        int opciones;
        System.out.println();
        System.out.println("MENU");
        System.out.println("(1) Ingresar nombres");
        System.out.println("(2)Entregar regalos");
        System.out.println("(0) Salir");
        System.out.print("Elija una opcion: ");
        opciones = scanner.nextInt();
        return opciones;
    }

    private static void reparticionDeRegalos() {
        System.out.println();
        System.out.println("Reparticion de regalos:");
        Collections.shuffle(participantes);

        for (int i = 0; i < participantes.size(); i++) {
            String participanteActual = participantes.get(i);
            String amigoInvisible;
            if (i == participantes.size() - 1) {
                amigoInvisible = participantes.get(0);
            } else {
                amigoInvisible = participantes.get(i + 1);
            }
            System.out.println(participanteActual + " -> " + amigoInvisible);
        }
    }
}