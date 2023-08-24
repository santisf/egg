package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Voto {

    private Alumno alumno;
    private HashSet<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                ", votados=" + votados +
                '}';
    }
}
