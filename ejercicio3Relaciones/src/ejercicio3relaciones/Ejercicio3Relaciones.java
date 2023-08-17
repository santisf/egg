/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3relaciones;

import Entidades.Baraja;

/**
 *
 * @author Santi
 */
public class Ejercicio3Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Baraja baraja= new Baraja();
        
        baraja.crearBaraja();
        baraja.verBaraja();
        
        baraja.siguienteCarta();
        baraja.siguienteCarta();
        
        baraja.cartasDisponibles();
        
        baraja.darCartas(39);
        
        baraja.cartasDisponibles();
        
        baraja.cartasMonton();
        
        baraja.mostrarBaraja();
       
        
    }
    
}
