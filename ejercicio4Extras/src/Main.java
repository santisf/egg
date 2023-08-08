import Servicios.CodigoPostalServicio;

public class Main {
    public static void main(String[] args) {
        CodigoPostalServicio cPS= new CodigoPostalServicio();
        cPS.inicializar();
        cPS.cargarCiudad();
        cPS.buscarCodigo();
        cPS.eliminarCiudad();
        cPS.eliminarCiudad();
        cPS.eliminarCiudad();
        cPS.eliminarCiudad();
        cPS.mostrarCiudades();
    }
}