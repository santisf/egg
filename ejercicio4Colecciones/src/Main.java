import Servicios.PeliculaServicio;

public class Main {





    public static void main(String[] args) {
        PeliculaServicio ps= new PeliculaServicio();
        ps.altaPelicula();
        ps.mostrarPeliculas();
        ps.mayorUnaHora();
        ps.segunDuracionMayor();
        ps.segunDuracionMenor();
        ps.ordenarTitulo();
        ps.ordenarDirector();
    }
}