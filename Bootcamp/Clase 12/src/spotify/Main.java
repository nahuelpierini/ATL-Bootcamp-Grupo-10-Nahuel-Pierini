package spotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Cancion> cancionList = new ArrayList<>();

    public static void main(String[] args){
        mostarMenu();
    }

    public static void mostarMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        try {
            do {
                System.out.println();
                System.out.println("(1) Agregar cancion a la PlayList: ");
                System.out.println("(2) Reproducir PlayList aleatoriamente:  ");
                System.out.println("(3) Reproducir PlayList de forma ordenada:  ");
                System.out.println("(4) Salir de Spotify");
                System.out.print("Elija una opcion: ");
                opcion = scanner.nextInt();
                System.out.println();

                switch (opcion) {

                    case 1:
                        crearPlayList();
                        break;
                    case 2:
                        reproducirPlayListAleatorio();
                        break;
                    case 3:
                        reproducirPlayListEnOrden();
                        break;
                    case 4:
                        System.out.println("Sesion cerrada con exito!");
                        break;
                    default:
                        System.out.println("Ingrese otro numero");
                }

            } while (opcion != 4);
        }catch (Exception e){
            System.out.println("Solo se aceptan numeros ");
        }

    }

    public static void reproducirPlayListEnOrden(){
        for (Cancion cancion : cancionList){
            System.out.println(cancion.toString());
        }
    }

    public static void reproducirPlayListAleatorio(){
        Collections.shuffle(cancionList);
        for (Cancion cancion : cancionList){
            System.out.println(cancion.toString());
        }
    }

    public static void crearPlayList(){
        Scanner scannerCancion = new Scanner(System.in);
        String titulo;
        String artista;
        float duracion;

        System.out.println();
        System.out.print("Ingrese nombre de la cancion: ");
        titulo = scannerCancion.nextLine();

        System.out.print("Ingrese artista de la cancion: ");
        artista = scannerCancion.nextLine();

        System.out.print("Ingrese duracion de la cancion: ");
        duracion = scannerCancion.nextFloat();

        System.out.println();

        Cancion cancion = new Cancion();
        cancion.setTitulo(titulo);
        cancion.setArtista(artista);
        cancion.setDuracion(duracion);

        cancionList.add(cancion);
    }

}
