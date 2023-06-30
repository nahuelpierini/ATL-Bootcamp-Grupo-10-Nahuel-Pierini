import java.util.Scanner;

public class NumeroPromedio {
    public static void main(String[] args){
        System.out.print("Ingrese numero 1: ");
        Scanner scanner = new Scanner(System.in);
        float numero1 = scanner.nextFloat();

        System.out.print("Ingrese numero 2: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Ingrese numero 3: ");
        float numero3 = scanner.nextFloat();

        float promedio = ((numero1 + numero3 + numero2) / 3);

        System.out.printf("El promedio de los 3 numeros ingresados es: %.2f\n ", promedio );
    }

    public static void ingreseTresNumeros(){

    }
}
