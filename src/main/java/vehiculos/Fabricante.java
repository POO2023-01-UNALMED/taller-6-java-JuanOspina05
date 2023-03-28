package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList();
    private int cantidadVehiculos;
    
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Pais getPais(){
        return pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
    public void setCantidadVehiculos(){
        ++cantidadVehiculos;
    }
    public static Fabricante fabricaMayorVentas(){
        Fabricante max;
        if(!fabricantes.isEmpty()){
            max = fabricantes.get(0);
            for(Fabricante i : fabricantes){
                if (i.cantidadVehiculos > max.cantidadVehiculos){
                    max = i;
                }
            }
            return max;
        }
        return null;
    }
}
