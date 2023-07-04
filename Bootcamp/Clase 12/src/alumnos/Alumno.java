package alumnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    Float[] notas = new Float[3];
    Float promedio;

    public Alumno(){

    }

    public Alumno(int id, String nombre, String apellido, Float[] notas, Float promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float[] getNotas() {
        return notas;
    }

    public void setNotas(Float[] notas) {
        this.notas = notas;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio(){
        float suma = 0;
        for (Float nota : notas){
            suma += nota;
        }
        promedio = Math.round((suma / notas.length)*100)/100f;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", promedio=" + promedio +
                '}';
    }
}
