package Entidades;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private int dni;

    private int cantidadVotos=0;

    public Alumno() {
    }

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public void aumetarVotos(){

        this.cantidadVotos=this.cantidadVotos+1;

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", cantidadVotos=" + cantidadVotos +
                '}';
    }
}
