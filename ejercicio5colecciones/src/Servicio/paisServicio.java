package Servicio;

import Entidades.pais;

import java.util.*;

public class paisServicio {

    private HashSet<pais> paises;

    public paisServicio() {

        paises = new HashSet<>();


    }

    public void cargarPaises(){

        boolean salir=false;

        String nombre="";
        Scanner leer= new Scanner(System.in);
        while(!salir){

            System.out.println("Ingrese el nombre del pais:");
            nombre= leer.nextLine();
            pais p = new pais();
            p.setNombre(nombre);
            paises.add(p);
            System.out.println("Desea cargar otro pais? s/n");
            String respuesta= leer.nextLine();

            salir=!(respuesta.equalsIgnoreCase("s"));
            if(salir){
                System.out.println("-----------PAISES------------");
                paises.forEach(System.out::println);
                System.out.println("-----------------------------");
                System.out.println("-----------PAISES ORDENADOS------------");
                ordenarPaises().forEach(System.out::println);
                System.out.println("--------------------------------------");
                eliminarPais();
            }

        }


    }

    public TreeSet<pais> ordenarPaises(){

        TreeSet<pais> paisesOrdenados= new TreeSet<>(new Comparator<pais>() {
            @Override
            public int compare(pais pais1, pais pais2) {
                return pais1.getNombre().compareToIgnoreCase(pais2.getNombre());
            }
        });
        paisesOrdenados.addAll(paises);
        return paisesOrdenados;

    }

    public void eliminarPais(){

        Scanner leer=new Scanner(System.in);
        String respuesta;
        String paisElminado;
        Iterator<pais> it= paises.iterator();

        System.out.println("Desea eliminar un pais? s/n");
        respuesta=leer.nextLine();
        if(respuesta.equalsIgnoreCase("s")){

            System.out.println("Que país desea eliminar?");
            paisElminado=leer.nextLine();
            boolean noEncontroPais=true;
            while(it.hasNext()){

                pais aux= it.next();
                if(aux.getNombre().equalsIgnoreCase(paisElminado)){

                    it.remove();
                    noEncontroPais=false;

                }

            }

            System.out.println(noEncontroPais ? "Ese pais no se encuentra en el conjunto" : "");

        }
        System.out.println("-----------PAISES------------");
        paises.forEach(System.out::println);
        System.out.println("-----------------------------");

    }



}
