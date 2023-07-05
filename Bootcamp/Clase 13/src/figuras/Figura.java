package figuras;

public abstract class Figura {
    protected double base;
    protected  double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double obtenerArea();

    public abstract double obtenerPerimetro();

    public abstract void obtenerDatos();


}