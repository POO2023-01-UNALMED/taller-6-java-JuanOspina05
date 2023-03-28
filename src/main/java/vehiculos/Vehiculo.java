package vehiculos;
public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static int cantidadVehiculos;
    
    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
        fabricante.getPais().setCantidadVehiculos();
        fabricante.setCantidadVehiculos();
        ++cantidadVehiculos;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public String getTraccion(){
        return traccion;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public Fabricante getFabricante(){
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    public static int getCantidadVehiculos(){
        return cantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos){
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }
    public static String vehiculosPorTipo(){
        String result = "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getcantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
        return result;
    }
}
