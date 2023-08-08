package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {

    private ArrayList<Integer> enteros;

    public ListaNumeros(){

        enteros= new ArrayList<>();

    }

    public void cargarNumeros(){

        Integer entero=0;
        Scanner scan = new Scanner(System.in);

        while(entero != (-99)) {

            System.out.println("Ingrese un numero entero:");
            System.out.println("(Si ingresa -99 finalizara)");
            entero= scan.nextInt();
            if(entero != -99){

                enteros.add(entero);

            }
        }

        mostrarLista();
        suma();
        promedio();

    }

    public void mostrarLista(){

        System.out.println("----------enteros--------------");
        enteros.forEach(entero -> System.out.println(entero));
        System.out.println("-------------------------------");
    }

    public void suma(){

        Integer suma = enteros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La suma de los enteros es: " + suma);
    }

    public void promedio(){

        double promedio=0.0;
        Integer suma=0;
        promedio = enteros.stream().mapToInt(Integer::intValue).sum()/enteros.size();
        System.out.println("La media de los numeros enteros es: "+promedio);

    }

}
