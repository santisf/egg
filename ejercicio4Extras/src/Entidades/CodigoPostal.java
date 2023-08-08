package Entidades;

import java.util.Objects;

public class CodigoPostal {

    private String ciudad;
    private int codigo;

    public CodigoPostal() {
    }

    public CodigoPostal(String ciudad, int codigo) {
        this.ciudad = ciudad;
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodigoPostal that = (CodigoPostal) o;
        return codigo == that.codigo && Objects.equals(ciudad, that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, codigo);
    }

    @Override
    public String toString() {
        return "CodigoPostal{" +
                "ciudad='" + ciudad + '\'' +
                ", codigo=" + codigo +
                '}';
    }

}
