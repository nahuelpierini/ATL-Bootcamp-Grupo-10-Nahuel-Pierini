package juegoRol;

public class Enano extends Personaje{

    public boolean isPersonajeBueno() {
        return personajeBueno;
    }

    public void setPersonajeBueno(boolean personajeBueno) {
        this.personajeBueno = personajeBueno;
    }

    /*
    public void ataqueHacha(Personaje objeto){
        int ataqueEspecial = atacar()*2;
    }

     */

    @Override
    public void avanzarNivel() {
        nivel+=1;
        puntosDeVida+=2;
        puntosDeAtaque+=15;
    }

}
