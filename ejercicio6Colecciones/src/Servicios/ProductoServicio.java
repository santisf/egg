package Servicios;

import Entidades.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private HashMap<String, Double> productos;
    Scanner scan= new Scanner(System.in);

    public ProductoServicio(){

        productos= new HashMap<>();

    }

    public void cargarProducto(){


        Producto p;
        boolean cargar= true;

        while(cargar){

            p= new Producto();
            System.out.println("Ingrese nombre del producto:");
            p.setNombre(scan.nextLine().toLowerCase());
            System.out.println("Ingrese el precio del producto:");
            p.setPrecio(scan.nextDouble());
            productos.put(p.getNombre(),p.getPrecio());
            scan.nextLine();
            System.out.println("Desea agregar otro producto? s/n");
            cargar=scan.nextLine().equalsIgnoreCase("s");

        }
        mostrarProductos();

    }

    public void mostrarProductos(){

        System.out.println("----------------productos------------------");
        for(Map.Entry<String, Double> producto: productos.entrySet()){

            String key= producto.getKey();
            Double value= producto.getValue();
            System.out.println("key: "+key+", value: "+value);

        }
        System.out.println("--------------------------------------------");
    }

    public void modificarPrecio(){

        String nombre;
        Double precioNuevo;
        System.out.println("Escriba el nombre del producto a modificar precio");
        nombre=scan.nextLine();
        boolean modificado= false;
        for(Map.Entry<String, Double> producto: productos.entrySet()){

            String key= producto.getKey();

            if(key.equalsIgnoreCase(nombre)){

                System.out.println("Ingrese el precio nuevo:");
                precioNuevo= scan.nextDouble();
                producto.setValue(precioNuevo);
                modificado=true;
                System.out.println("El precio se modifico exitosamente");
                mostrarProductos();
                scan.nextLine();

            }

        }
        if(!modificado){

            System.out.println("No se encontro el producto");

        }

    }

    public void eliminarProducto(){

        String nombre;
        boolean eliminado= false;
        System.out.println("Escriba el nombre del producto que desea eliminar");
        nombre=scan.nextLine().toLowerCase();
        for(Map.Entry<String, Double> producto: productos.entrySet()){

            String key= producto.getKey();

            if(key.equalsIgnoreCase(nombre)){

                productos.remove(key);
                System.out.println("El producto se elimino exitosamente");
                mostrarProductos();

            }

        }
        if(!eliminado){

            System.out.println("No se encontro el producto");

        }
    }
}
