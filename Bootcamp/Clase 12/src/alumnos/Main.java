package alumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static final List<Alumno> alumnoList = new ArrayList<>();

    public static void main(String [] args){

        agregarAlumnos();
        mostrarAlumnos();
    }

    private static void agregarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        System.out.println();

        for (int i=0; i<cantidadAlumnos;i++){
            Scanner scannerAlumno = new Scanner(System.in);
            String nombre;
            String apellido;
            Float[] notas = new Float[3];

            System.out.print("Ingrese nombre del alumno[" + (i+1) +"]: ");
            nombre = scannerAlumno.nextLine();

            System.out.print("Ingrese apellido del alumno[" + (i+1) +"]: ");
            apellido = scannerAlumno.nextLine();

            System.out.println("Ingrese las notas de los 3 trimestres del alumno[" + (i+1) +"]: ");
            for (int j=0; j< notas.length; j++){
                System.out.print("    Nota del trimistre[" + (j+1) +"]: ");
                notas[j] = scannerAlumno.nextFloat();
            }
            System.out.println();

            Alumno alumno = new Alumno();
            alumno.setId(i+1);
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.setNotas(notas);
            alumno.calcularPromedio();

            alumnoList.add(alumno);
        }
    }

    private static void mostrarAlumnos() {
        for (Alumno al : alumnoList){
            System.out.println(al.toString());
        }
    }
}
