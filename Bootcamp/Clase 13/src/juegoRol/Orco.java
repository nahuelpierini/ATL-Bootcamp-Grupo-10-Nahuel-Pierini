package juegoRol;

public class Orco extends Personaje{

    public boolean isPersonajeBueno() {
        return personajeBueno;
    }

    public void setPersonajeBueno(boolean personajeBueno) {
        this.personajeBueno = personajeBueno;
    }

    public void escudo(int danio){
        if (danio >=15){
            puntosDeVida = danio-5;
        }
    }

    @Override
    public void avanzarNivel() {
        nivel+=1;
        puntosDeVida+=8;
        puntosDeAtaque+=5;
    }

}
