import Servicios.CantanteFamosoServicio;

public class Main {
    public static void main(String[] args) {
        CantanteFamosoServicio cFS= new CantanteFamosoServicio();
        cFS.inicializarCantantes();
        cFS.menu();
    }
}