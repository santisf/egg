/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Santi
 */
public class Baraja {

    public ArrayList<Carta> cartas = new ArrayList();
    int siguienteCarta = -1;

    public void crearBaraja() {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 4; j++) {

                Carta carta = new Carta();

                if (i >= 8) {

                    carta.setNumero(i + 2);

                } else {

                    carta.setNumero(i);

                }

                //1 : ESPADA
                //2: BASTO
                //3: ORO
                //4: COPA
                switch (j) {
                    case 1:
                        carta.setPalo("Espada");
                        break;
                    case 2:
                        carta.setPalo("Basto");
                        break;
                    case 3:
                        carta.setPalo("Oro");
                        break;
                    case 4:
                        carta.setPalo("Copa");
                        break;
                }

                cartas.add(carta);
            }

        }

        barajar();

    }

    public void verBaraja() {
        System.out.println("--------------BARAJA---------------------");
        cartas.forEach(c -> System.out.println(c.toString()));
        System.out.println("------------------------------------------");

    }

    public void barajar() {

        Collections.shuffle(cartas);

    }

    public Carta siguienteCarta() {

        siguienteCarta = siguienteCarta + 1;

        System.out.println("");
        System.out.println("valor de siguienteCarta en metodo siguienteCarta: " + siguienteCarta);
        System.out.println("");
        System.out.println("------------CARTA------------");
        System.out.println(cartas.get(siguienteCarta).toString());
        return cartas.get(siguienteCarta);

    }

    public int cartasDisponibles() {
        System.out.println("");
        System.out.println("valor de siguienteCarta en disponibles: " + siguienteCarta);
        System.out.println("");
        int disponibles = 40;
        if (siguienteCarta != -1) {

            disponibles = 40 - siguienteCarta - 1;

        }

        System.out.println("-----------CARTAS DISPONBLES------------");
        System.out.println(disponibles);

        System.out.println("-----------------------------------------");
        return disponibles;
    }

    public void darCartas(int cantidad) {

       
        if ((siguienteCarta + cantidad) > 39) {

            System.out.println("No quedan tantas cartas disponibles");

        } else {
            
            System.out.println("---------CARTAS DADAS--------------");    
            for (int i = siguienteCarta + 1; i <= cantidad + siguienteCarta; i++) {

                System.out.println(cartas.get(i).toString());

            }
            siguienteCarta = siguienteCarta + cantidad;
            System.out.println("---------------------------------");

        }

    }

    public void cartasMonton() {

        if (siguienteCarta == -1) {

            System.out.println("No hay ninguna carta en el monton");

        } else {

            System.out.println("---------CARTAS EN MONTON--------------");
            for (int i = 0; i <= siguienteCarta; i++) {

                System.out.println(cartas.get(i).toString());

            }

            System.out.println("---------------------------------");

        }

    }

    public void mostrarBaraja() {

        System.out.println("---------BARAJA SIN MONTON--------------");
        for (int i = siguienteCarta + 1; i < 40; i++) {

            System.out.println(cartas.get(i).toString());

        }

        System.out.println("---------------------------------");

    }

}
