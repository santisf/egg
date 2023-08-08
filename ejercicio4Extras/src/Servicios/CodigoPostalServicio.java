package Servicios;

import Entidades.CodigoPostal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoPostalServicio {

    private HashMap<Integer, CodigoPostal> ciudades;
    Scanner leer = new Scanner(System.in);

    public CodigoPostalServicio(){

        ciudades=new HashMap<>();

    }

    public void inicializar(){

        CodigoPostal c1=new CodigoPostal("Recoleta", 8000);
        ciudades.put(c1.getCodigo(), c1);
        CodigoPostal c2= new CodigoPostal("Cordoba", 5001);
        ciudades.put(c2.getCodigo(), c2);
        CodigoPostal c3= new CodigoPostal("Cordoba", 5004);
        ciudades.put(c3.getCodigo(), c3);
        CodigoPostal c4= new CodigoPostal("Cordoba", 5012);
        ciudades.put(c4.getCodigo(), c4);
        CodigoPostal c5= new CodigoPostal("Cordoba", 5023);
        ciudades.put(c5.getCodigo(), c5);
        CodigoPostal c6= new CodigoPostal("Cordoba", 5016);
        ciudades.put(c6.getCodigo(), c6);
        CodigoPostal c7= new CodigoPostal("Cordoba", 5123);
        ciudades.put(c7.getCodigo(), c7);
        CodigoPostal c8= new CodigoPostal("Cordoba", 5002);
        ciudades.put(c8.getCodigo(), c8);
        CodigoPostal c9= new CodigoPostal("Cordoba", 5006);
        ciudades.put(c9.getCodigo(), c9);
        CodigoPostal c10=new CodigoPostal("Cordoba", 5017);
        ciudades.put(c10.getCodigo(), c10);
        mostrarCiudades();


    }

    public void cargarCiudad(){

        boolean cargar=true;

        while(cargar) {
            CodigoPostal c1= new CodigoPostal();
            System.out.println("Ingrese codigo postal:");
            int codigo = leer.nextInt();
            c1.setCodigo(codigo);
            leer.nextLine();
            System.out.println("Ingrese nombre de la ciudad:");
            String nombre = leer.nextLine();
            c1.setCiudad(nombre);
            ciudades.put(c1.getCodigo(),c1);
            System.out.println("Desea cargar otro pais? s/n");
            cargar=leer.nextLine().equalsIgnoreCase("s");
        }
        mostrarCiudades();
    }

    public void buscarCodigo(){

        System.out.println("Ingrese el codigo postal para buscar la ciudad");
        int codigo= leer.nextInt();
        if(ciudades.containsKey(codigo)){
            System.out.println(ciudades.get(codigo));
        }else{
            System.out.println("Codigo no encontrado");
        }

    }

    public void eliminarCiudad(){

        System.out.println("Ingrese el codigo postal para eliminar la ciudad");
        int codigo= leer.nextInt();
        if(ciudades.containsKey(codigo)){
            ciudades.remove(codigo);
        }else{
            System.out.println("Codigo no encontrado");
        }

    }

    public void mostrarCiudades(){

        System.out.println("--------------ciudades-----------------");
        for (Map.Entry<Integer, CodigoPostal> entry : ciudades.entrySet()) {
            Integer clave = entry.getKey();
            CodigoPostal valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
        System.out.println("---------------------------------------");
    }

}

