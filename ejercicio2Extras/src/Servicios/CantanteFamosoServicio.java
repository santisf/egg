package Servicios;

import Entidades.CantanteFamoso;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoServicio {

    private ArrayList<CantanteFamoso> cantantes;

    public CantanteFamosoServicio(){

        cantantes = new ArrayList<>();

    }

    public void inicializarCantantes(){

        CantanteFamoso a = new CantanteFamoso("deisy", "demoliendo macetas");
        CantanteFamoso b= new CantanteFamoso("lolo", "El placer de mear");
        CantanteFamoso c = new CantanteFamoso("fuky", "Ser feo no es crimen");
        CantanteFamoso d = new CantanteFamoso("yo", "cambalache de tomardos");
        CantanteFamoso e= new CantanteFamoso("asd","asdaasd");

        cantantes.add(a);
        cantantes.add(b);
        cantantes.add(c);
        cantantes.add(d);
        cantantes.add(e);

        mostrarCantantes();
    }

    public void menu(){

        Scanner leer = new Scanner(System.in);
        String nombre;
        String discoMasVendido;
        int opcion=0;
        boolean cargar= true;
        while(opcion!=4){

            System.out.println("----------MENU----------");
            System.out.println("1 - Cargar otro cantante");
            System.out.println("2 - Mostrar cantantes");
            System.out.println("3 - Eliminar un cantante");
            System.out.println("4 - Salir");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    cargarCantante();
                    break;

                case 2:
                    mostrarCantantes();
                    break;

                case 3:
                    eliminarCantante();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
    }
}

    private void eliminarCantante(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cantante que desea eliminar");
        String nombre= leer.nextLine();
        int size= cantantes.size();

        cantantes.removeIf(cantanteFamoso -> cantanteFamoso.getNombre().equalsIgnoreCase(nombre));

        if(size> cantantes.size()){
            System.out.println("El cantante fue eliminado exitosamente");
        }else{
            System.out.println("No se encontro el cantante");
        }

}

    private void mostrarCantantes(){

        System.out.println("------------------cantantes-----------------");
        cantantes.forEach(System.out::println);
        System.out.println("--------------------------------------------");

    }

    private void cargarCantante(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cantante:");
        String nombre= leer.nextLine();
        System.out.println("Ingrese el disco mas vendido:");
        String discoMasVendido= leer.nextLine();
        CantanteFamoso c= new CantanteFamoso(nombre,discoMasVendido);
        cantantes.add(c);

    }
}

