package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> paises = new ArrayList();
    private int cantidadVehiculos;
    
    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);   
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidadVehiculos(){
        ++cantidadVehiculos;
    }
    public static Pais paisMasVendedor(){
        Pais max;
        if(!paises.isEmpty()){
            max = paises.get(0);
            for(Pais i : paises){
                if (i.cantidadVehiculos > max.cantidadVehiculos){
                    max = i;
                }
            }
            return max;
        }
        return null;
    }
}
