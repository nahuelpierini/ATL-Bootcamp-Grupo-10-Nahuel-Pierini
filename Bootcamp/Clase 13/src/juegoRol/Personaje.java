package juegoRol;

import java.util.Scanner;

public abstract class Personaje {
    protected  String nombre;
    protected  int nivel = 1;
    protected  int puntosDeVida;
    protected int puntosDeAtaque;
    protected boolean personajeBueno;



    public Personaje(){

    }

    public boolean isPersonajeBueno() {
        return personajeBueno;
    }

    public void setPersonajeBueno(boolean personajeBueno) {
        this.personajeBueno = personajeBueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }


    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }


    public void recibirDanio(int danio){
        puntosDeVida -= danio;
        if (puntosDeVida <= 0){
            puntosDeVida = 0;
        }
    }

    public abstract void avanzarNivel();

    public void atacar(Personaje objetivo){
        System.out.println(nombre + " ataca a " + objetivo.nombre);
        System.out.println();
    }

    public void cargarDatos(){
        Scanner scannerPersonaje = new Scanner(System.in);
        System.out.print("nombre: ");
        nombre = scannerPersonaje.nextLine();
        System.out.print("Puntos De Vida: ");
        puntosDeVida = scannerPersonaje.nextInt();
        System.out.print("puntosDeAtaque: ");
        puntosDeAtaque = scannerPersonaje.nextInt();
        System.out.println("Es personaje bueno?");
        personajeBueno = scannerPersonaje.nextBoolean();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", puntosDeAtaque=" + puntosDeAtaque +
                ", personajeBueno=" + personajeBueno +
                '}';
    }
}


