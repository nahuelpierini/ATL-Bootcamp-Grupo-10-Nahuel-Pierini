package figuras;

import java.util.Scanner;

public class Circulo extends  Figura{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return (Math.PI*radio*radio);
    }

    @Override
    public double obtenerPerimetro() {
        return (2*Math.PI*radio);
    }

    @Override
    public void obtenerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese radio: ");
        radio = scanner.nextDouble();
    }
}