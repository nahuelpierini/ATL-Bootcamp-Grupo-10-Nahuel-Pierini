package figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figura = new ArrayList<>();

    public static void main(String[] args){

        mostrarMenu();
    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean mostrarMenu = true;
        int opcion;

        do {
            System.out.println();
            System.out.println("**********Menu**********");
            System.out.println("(1) Crear Triangulo");
            System.out.println("(2) Crear Circulo");
            System.out.println("(3) Crear Cuadrado");
            System.out.println("(4) Mostrar suma de areas");
            System.out.println("(5) Mostrar suma de perimetros");
            System.out.println("(0) Salir");
            System.out.println();
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    crearAreaYPerimetroTriangulo();
                }
                case 2 -> {
                    crearAreaYPerimetroCirculo();
                }
                case 3 -> {
                    crerAreaYPerimetroCuadrado();
                }
                case 4 -> {
                    calcularAreaTotal();
                }
                case 5 -> {
                    calcularPerimetroTotal();
                }
                case 0 -> {
                    mostrarMenu = false;
                    System.out.println("Sesion Cerrada Exitosamente");
                }
            }
        }while (mostrarMenu);
    }

    private static void calcularAreaTotal() {
        double sumatoriaAreas = 0;
        for (Figura area : figura){
            sumatoriaAreas += area.obtenerArea();
            System.out.println("La suma de area total es: " + sumatoriaAreas);
        }
    }

    private static void calcularPerimetroTotal() {
        double sumatoriaPerimetro = 0;
        for (Figura perimetro : figura){
            sumatoriaPerimetro += perimetro.obtenerPerimetro();
            System.out.println("La suma de perimetro total es: " + sumatoriaPerimetro);
        }
    }

    private static void crerAreaYPerimetroCuadrado() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.obtenerDatos();
        figura.add(cuadrado);
    }

    private static void crearAreaYPerimetroCirculo() {
        Circulo circulo = new Circulo();
        circulo.obtenerDatos();
        figura.add(circulo);
    }

    private static void crearAreaYPerimetroTriangulo() {
        Triangulo triangulo = new Triangulo();
        triangulo.obtenerDatos();
        figura.add(triangulo);
    }
}
