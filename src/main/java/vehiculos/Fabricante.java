package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    protected String nombre;
    protected Pais pais;
    public int canVentas;
    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.pais = pais;
        this.nombre = nombre;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
        int iniciador = 0;
        Fabricante fabricanteMayorVentas = null;
        for (Fabricante fabricante : fabricantes) {
            if (fabricante.canVentas > iniciador) {
                iniciador = fabricante.canVentas;
                fabricanteMayorVentas = fabricante;
            }
        }
        return fabricanteMayorVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
