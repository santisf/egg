package Servicio;

import Entidades.Pais;

import java.util.*;

public class PaisServicio {

    private HashSet<Pais> paises;

    public PaisServicio(){

        paises= new HashSet<>();

    }

    public void cargarPais(){

        Scanner leer = new Scanner(System.in);
        boolean cargar= true;
        String nombre;

        String respuesta;
        while(cargar){

            System.out.println("Ingrese un pais:");
            nombre= leer.nextLine();
            nombre= nombre.toLowerCase();
            Pais p= new Pais();
            p.setNombre(nombre);
            paises.add(p);

            System.out.println("Desea agregar otro pais? s/n");
            respuesta= leer.nextLine();
            cargar= respuesta.equalsIgnoreCase("s");

            if(!cargar){
                System.out.println("-----------PAISES---------------");
                paises.forEach(System.out::println);
                System.out.println("--------------------------------");

                System.out.println("-----------PAISES ORDENADOS---------------");
                ordenarPaises().forEach(System.out::println);
                System.out.println("------------------------------------------");
                eliminarPais();
            }
        }

    }

    public TreeSet<Pais> ordenarPaises(){

        TreeSet<Pais> paisesOrdenados= new TreeSet<>(new Comparator<Pais>() {
            @Override
            public int compare(Pais pais1, Pais pais2) {
                return pais1.getNombre().compareToIgnoreCase(pais2.getNombre());
            }
        });
        paisesOrdenados.addAll(paises);
        return paisesOrdenados;
    }

    public void eliminarPais(){

        Scanner leer= new Scanner(System.in);
        String respuesta;
        String paisEliminado;
        Iterator<Pais> it=  paises.iterator();
        System.out.println("Desea eliminar un pais? s/n");
        respuesta=leer.nextLine();
        boolean paisAEliminar;
        if(respuesta.equalsIgnoreCase("s")){

            System.out.println("Ingrese el pais que desea eliminar:");
            paisEliminado=leer.nextLine();
            while(it.hasNext()){

                Pais aux= it.next();
                if(aux.getNombre().equalsIgnoreCase(paisEliminado)){

                    it.remove();

                }else{

                    System.out.println("Pais no encontrado");

                }
                break;
            }

            paises.forEach(System.out::println);

        }
    }
}
