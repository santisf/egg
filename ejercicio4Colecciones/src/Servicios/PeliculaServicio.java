package Servicios;

import Entidades.Pelicula;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> peliculasArrayList;

    public PeliculaServicio() {

        peliculasArrayList= new ArrayList<>();

    }

    public void altaPelicula(){



        Scanner leer = new Scanner(System.in);
        boolean cargar= true;
        while(cargar) {
            System.out.println("Ingrese titulo de la pelicula:");
            String titulo = leer.nextLine();
            System.out.println("ingrese el director de la pelicula:");
            String director = leer.nextLine();
            System.out.println("ingrese duracion de la pelicula:");
            double duracion = leer.nextDouble();

            Pelicula peli = new Pelicula(titulo, director, duracion);

            peliculasArrayList.add(peli);
            System.out.println("Pelicula agreagada correactamente");
            leer.nextLine();
            System.out.println("Desea cargar otra pelicula? s/n");
            String respuesta=leer.nextLine();
            cargar=respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Carga finalizada");

    }

    public void mostrarPeliculas(){

        System.out.println("--------------CATALOGO-----------------");
        peliculasArrayList.forEach(pelicula -> System.out.println(pelicula.toString()));
        System.out.println("---------------------------------------");
    }

    public void mayorUnaHora(){
        System.out.println("--------------PELICULAS DE MAS DE UNA HORA----------------------");
        peliculasArrayList.stream().filter((pelicula -> pelicula.getDuracion() > 1)).forEach(System.out::println);
        System.out.println("---------------------------------------");
    }

    public void segunDuracionMayor(){
        System.out.println("-------------------PELICULAS ORDENADAS POR DURACION MAYOR A MENOR--------------------");
        peliculasArrayList.sort((peli1, peli2)-> Double.compare(peli2.getDuracion(),peli1.getDuracion()));
        peliculasArrayList.forEach(pelicula -> System.out.println(pelicula.toString()));
        System.out.println("---------------------------------------");
    }

    public void segunDuracionMenor(){
        System.out.println("-------------------PELICULAS ORDENADAS POR DURACION--------------------");
        peliculasArrayList.sort((peli1, peli2)-> Double.compare(peli1.getDuracion(),peli2.getDuracion()));
        peliculasArrayList.forEach(pelicula -> System.out.println(pelicula.toString()));
        System.out.println("---------------------------------------");
    }

    public void ordenarTitulo(){

        System.out.println("------------Peliculas ordenadas alfabeticamente por titulo-------------");
        peliculasArrayList.sort((peli1, peli2)-> peli1.getTitulo().compareToIgnoreCase(peli2.getTitulo()) );
        peliculasArrayList.forEach(pelicula -> System.out.println(pelicula.toString()));
        System.out.println("---------------------------------------");
    }

    public void ordenarDirector(){

        System.out.println("------------Peliculas ordenadas alfabeticamente por director-------------");
        peliculasArrayList.sort((peli1, peli2)-> peli1.getDirector().compareToIgnoreCase(peli2.getDirector()) );
        peliculasArrayList.forEach(pelicula -> System.out.println(pelicula.toString()));
        System.out.println("---------------------------------------");
    }


}
