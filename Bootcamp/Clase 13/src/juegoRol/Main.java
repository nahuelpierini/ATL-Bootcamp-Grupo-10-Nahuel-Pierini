package juegoRol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static List<Personaje> personajeList = new ArrayList<>();

    public static void main(String [] args){
        mostrarMenu();
    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean mostrarMenu = true;

        do {
            System.out.println("*********MENU*********");
            System.out.println("Elegir un Guerrero y un Monstruo, darle atributos y simular batalla");
            System.out.println("(1) Crear Guerrero");
            System.out.println("(2) Crear Monstruo");
            System.out.println("(3) Simular Batalla");
            System.out.println("(4) Mostrar Personajes");
            System.out.println("(0) Salir");
            System.out.print("Elegir opcion: ");
            opcion = scanner.nextInt();
            System.out.println();

            switch (opcion){
                case 1 -> {
                    crearGuerrero();
                }
                case 2 -> {
                    crearMonstruo();
                }
                case 3 -> {
                    simularBatalla();
                }
                case 4 -> {
                    mostrarPersonajes();
                }
                case 0 -> {
                    mostrarMenu = false;
                }
            }
        }while (mostrarMenu);

    }

    private static void crearGuerrero() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("*****ELEGIR PERSONAJE*****");
        System.out.println("(1) Crear Enano");
        System.out.println("(2) Crear Mago");
        System.out.println("(3) Crear Arquero");
        System.out.print("Ingrese opcion: ");
        opcion = scanner.nextInt();
        System.out.println();

        if (opcion == 1){
            System.out.println("********ENANO********");
            Enano enano = new Enano();
            enano.cargarDatos();

            personajeList.add(enano);

        }
        if (opcion == 2){
            System.out.println("********MAGO********");
            Mago mago = new Mago();
            mago.cargarDatos();

            personajeList.add(mago);

        }
        if(opcion == 3){
            System.out.println("********ARQUERO********");
            Arquero arquero = new Arquero();
            arquero.cargarDatos();

            personajeList.add(arquero);
        }
    }

    private static void crearMonstruo() {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("*****ELEGIR PERSONAJE*****");
        System.out.println("(1) Crear Orco");
        System.out.println("(2) Crear Goblin");
        System.out.print("Ingrese opcion: ");
        opcion = scanner.nextInt();
        System.out.println();

        if (opcion == 1){
            System.out.println("********ORCO********");
            Orco orco = new Orco();
            orco.cargarDatos();

            personajeList.add(orco);

        }
        if (opcion == 2){
            System.out.println("********GOBLIN********");
            Goblin goblin = new Goblin();
            goblin.cargarDatos();

            personajeList.add(goblin);

        }

    }

    private static void mostrarPersonajes() {
        for (Personaje personaje : personajeList){
            System.out.println(personaje.toString());
        }
        System.out.println();
    }

    private static void simularBatalla() {

    List<Personaje> buenPersonaje = new ArrayList<>();
    List<Personaje> malPersonaje = new ArrayList<>();

        for (Personaje personaje : personajeList){
           if (personaje.isPersonajeBueno()){
               buenPersonaje.add(personaje);
           } else {
               malPersonaje.add(personaje);
           }
        }

    System.out.println("*****BATALLA*****");
        System.out.println();
        mostrarPersonajes();

            for (int i=0; i<3;i++) {
                if (malPersonaje.get(0).puntosDeVida <= 0){
                    System.out.println("Ha ganado: " + buenPersonaje.get(0).nombre);
                    System.out.println();
                    break;
                }
                buenPersonaje.get(0).atacar(malPersonaje.get(0));
                malPersonaje.get(0).recibirDanio(buenPersonaje.get(0).puntosDeAtaque);
            }
            for (int i=0; i<3;i++) {
                if (buenPersonaje.get(0).puntosDeVida <= 0){
                    System.out.println("Ha ganado: " + malPersonaje.get(0).nombre);
                    System.out.println();
                    break;
                }
                malPersonaje.get(0).atacar(buenPersonaje.get(0));
                buenPersonaje.get(0).recibirDanio(malPersonaje.get(0).puntosDeAtaque);
            }
        System.out.println("La batalla ha terminado, el resultado es : ");
        mostrarPersonajes();
    }
}
