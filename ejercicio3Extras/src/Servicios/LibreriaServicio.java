package Servicios;

import Entidades.Libreria;
import Entidades.Libro;

import java.util.Scanner;

public class LibreriaServicio {

    Scanner leer = new Scanner(System.in);
    private Libreria libreria;

    public LibreriaServicio() {

        libreria = new Libreria();
    }


    public void cargarLibros() {


        boolean cargar = true;
        String titulo;
        String autor;
        int numeroEjemplares;
        int numeroEjemplaresPrestados;

        while (cargar) {

            Libro libro = new Libro();

            System.out.println("Ingrese titulo del libro:");
            titulo = leer.nextLine();

            System.out.println("Ingrese autor del libro:");
            autor = leer.nextLine();

            System.out.println("Ingrese numero de ejemplares:");
            numeroEjemplares = leer.nextInt();

            System.out.println("Ingrese numero de ejemplares prestados:");
            numeroEjemplaresPrestados = leer.nextInt();
            leer.nextLine();

            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNumeroEjemplares(numeroEjemplares);
            libro.setNumeroEjemplaresPrestados(numeroEjemplaresPrestados);
            libreria.setLibro(libro);

            System.out.println("Desea cargar otro libro? s/n");
            cargar = leer.nextLine().equalsIgnoreCase("s");

        }
        mostrarLibros();
    }

    public boolean prestamo() {

        String titulo;
        System.out.println("Ingrese el titulo del libro que quiere prestar");
        titulo = leer.nextLine();
        boolean prestado = false;
        boolean existe=false;
        for (Libro libro : libreria.getLibreria()) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                if (libro.getNumeroEjemplares() > 0) {
                    libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() + 1);
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
                    prestado = true;
                    existe= true;
                } else {
                    System.out.println("No hay ejemplares disponibles");
                    existe= true;
                }

            }

        }
        if(!existe){
            System.out.println("El libro no se encuentra");
        }
        mostrarLibros();
        return prestado;
    }


    public boolean devolucion() {

        String titulo;
        System.out.println("Ingrese el titulo del libro que quiere devolver");
        titulo = leer.nextLine();
        boolean devuelto = false;
        boolean existe = false;
        for (Libro libro : libreria.getLibreria()) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                if (libro.getNumeroEjemplaresPrestados() > 0) {
                    libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() - 1);
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares() + 1);
                    devuelto = true;
                    existe=true;
                } else {
                    System.out.println("Todos los ejemplares ya fueron devueltos");
                    existe=true;
                }

            }

        }
        if(!existe){
            System.out.println("El libro no se encuentra");
        }
        mostrarLibros();
        return devuelto;
    }

    public void mostrarLibros(){

        libreria.getLibreria().forEach(System.out::println);

    }

}
