package Cafetera.Entidades;
/**
 * @author Luca Monte
 */
public class Cafetera {
    
    //Atributos
    
    private int capacidadMaxima;
    
    private int cantidadActual;
    
    //Constructor por defecto

    public Cafetera() {
        
    }
    
    //Constructor con parametros

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Getters and Setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}