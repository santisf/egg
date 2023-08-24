package Servicio;

import Entidades.Alumno;
import Entidades.Voto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Simulador {

    public ArrayList<String> generarListado(int cantidad) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Luis");
        nombres.add("Juli");
        nombres.add("Santiago");
        nombres.add("Fuky");
        nombres.add("Deisy");

        List<String> apellidos = new ArrayList<>();
        apellidos.add("Podadera");
        apellidos.add("Foti");
        apellidos.add("Mentesana");
        apellidos.add("Monstruo feo");
        apellidos.add("Sinpatas");
        apellidos.add("Simpson");
        apellidos.add("Okazaki");

        ArrayList<String> nombresCompletos = new ArrayList<>();

        ArrayList<Alumno> listaAlumnosAleatorios = new ArrayList<>();
        int totalAlumnos = nombres.size();
        String nombre;
        String apellido;
        String nombreCompleto;
        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = (int) (Math.random() * totalAlumnos);
            nombre = nombres.get(indiceAleatorio);
            apellido = apellidos.get(indiceAleatorio);
            nombreCompleto = nombre + " " + apellido;
            nombresCompletos.add(nombreCompleto);

        }

        return nombresCompletos;


    }

    public ArrayList<Integer> generarDni(ArrayList<String> nombres) {

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        int max = 99999999;
        int min = 10000000;


        nombres.forEach(alumno -> {

            int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
            while (numerosAleatorios.contains(numeroAleatorio)) {

                numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;

            }
            numerosAleatorios.add(numeroAleatorio);


        });

        return numerosAleatorios;

    }

    public ArrayList<Alumno> generarAlumnos() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos que quiere generar");
        int cantidad = scan.nextInt();
        ArrayList<String> nombres = generarListado(cantidad);
        ArrayList<Integer> dnis = generarDni(nombres);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {

            Alumno alumno = new Alumno(nombres.get(i), dnis.get(i));
            alumnos.add(alumno);

        }
        System.out.println("--------------------------ALUMNOS");
        alumnos.forEach(alumno -> System.out.println(alumno.toString()));
        System.out.println("--------------------------------");
        return alumnos;

    }

    public ArrayList<Voto> votos(ArrayList<Alumno> alumnos) {

        ArrayList<Voto> votos = new ArrayList<>();

        for (int i = 0; i < alumnos.size(); i++) {
            HashSet<Alumno> votados = new HashSet<Alumno>();

            while (votados.size() < 3) {

                int aleatorio = (int) (Math.random() * (alumnos.size()));
                if (aleatorio != i) {
                    votados.add(alumnos.get(aleatorio));

                }

            }

            votados.forEach(votado -> votado.aumetarVotos());


            Voto voto = new Voto(alumnos.get(i), votados);

            votos.add(voto);
        }
        ;

        return votos;

       /* ArrayList<Voto> votos = new ArrayList<>();

        alumnos.forEach(alumno -> {
            HashSet<Alumno> votados = new HashSet<Alumno>();

            for (int i = 0; i < 3; i++) {
                Alumno votado;
                do {
                    int indiceVotado = (int) (Math.random() * alumnos.size());
                    votado = alumnos.get(indiceVotado);
                } while (alumno == votado || votados.contains(votado));
                votados.add(votado);
                alumno.aumetarVotos();
            }

            Voto voto = new Voto(alumno, votados);
            votos.add(voto);
        });

        return votos;*/


    }

    public void mostrarVotos() {

        ArrayList<Voto> votos = new ArrayList<>();
        votos = votos(generarAlumnos());
        votos.forEach(voto -> {

            System.out.println("--------Alumno:");
            System.out.println(voto.getAlumno().toString());
            System.out.println("--------Votos:");
            voto.getVotados().forEach(votado -> {

                        System.out.print(votado.getNombre());
                        System.out.print(": "+ votado.getDni());
                        System.out.print(", ");

                    }

            );
            System.out.println();
            System.out.println("----------------------------");

        });

    }

}




