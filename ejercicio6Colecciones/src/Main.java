import Servicios.ProductoServicio;

public class Main {

    public static void main(String[] args) {

        ProductoServicio pS = new ProductoServicio();
        pS.cargarProducto();
        pS.modificarPrecio();
        pS.eliminarProducto();
    }
}