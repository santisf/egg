import Servicios.LibreriaServicio;

public class Main {
    public static void main(String[] args) {
        LibreriaServicio lS= new LibreriaServicio();
        lS.cargarLibros();
        lS.prestamo();

}