package Entidades;

import java.util.Objects;

public class pais {

    private String nombre;

    public pais(String nombre) {
        this.nombre = nombre;
    }

    public pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pais pais = (pais) o;
        return nombre.equalsIgnoreCase(pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toUpperCase());
    }

    @Override
    public String toString() {
        return "pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
