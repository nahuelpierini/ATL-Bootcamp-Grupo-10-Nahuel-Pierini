package figuras;

import java.util.Scanner;

public class Triangulo extends Figura{

    private double lado1;
    private  double lado2;

    public Triangulo(){

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea() {
        return (base*altura)/2;
    }

    @Override
    public double obtenerPerimetro() {
        return lado1 + lado2 + base;
    }

    @Override
    public void obtenerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Base: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese Altura: ");
        altura = scanner.nextDouble();
        System.out.print("Ingrese lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Ingrese lado 2: ");
        lado2 = scanner.nextDouble();

    }

}