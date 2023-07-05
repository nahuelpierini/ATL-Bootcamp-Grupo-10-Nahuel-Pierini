package figuras;

import java.util.Scanner;

public class Cuadrado extends Figura{

    @Override
    public double obtenerArea() {
        return (base * altura);
    }

    @Override
    public double obtenerPerimetro() {
        return (2*base+2*altura);
    }

    @Override
    public void obtenerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Base: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese Altura: ");
        altura = scanner.nextDouble();
    }
}