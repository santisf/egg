package Entidades;

import Entidades.Libro;

import java.util.HashSet;

public class Libreria {

    private HashSet<Libro> libreria = new HashSet<>();

    public Libreria() {
    }

    public HashSet<Libro> getLibreria() {
        return libreria;
    }

    public void setLibreria(HashSet<Libro> libreria) {
        this.libreria = libreria;
    }

    public void setLibro(Libro libro){

        libreria.add(libro);


    }


}
