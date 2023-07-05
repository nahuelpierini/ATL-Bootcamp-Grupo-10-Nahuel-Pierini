package juegoRol;

public class Arquero extends Personaje{

    public boolean isPersonajeBueno() {
        return personajeBueno;
    }

    public void setPersonajeBueno(boolean personajeBueno) {
        this.personajeBueno = personajeBueno;
    }

    @Override
    public void avanzarNivel() {
        nivel+=1;
        puntosDeVida+=10;
        puntosDeAtaque+=5;

    }

}
