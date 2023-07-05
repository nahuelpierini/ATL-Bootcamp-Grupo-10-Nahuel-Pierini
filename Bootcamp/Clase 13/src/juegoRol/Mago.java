package juegoRol;

public class Mago extends Personaje{

    public boolean isPersonajeBueno() {
        return personajeBueno;
    }

    public void setPersonajeBueno(boolean personajeBueno) {
        this.personajeBueno = personajeBueno;
    }

    /*
    public int ataqueMagico(){
        return atacar()*3;
    }

     */

    @Override
    public void avanzarNivel() {
        nivel+=1;
        puntosDeVida+=10;
        puntosDeAtaque+=2;

    }

}
