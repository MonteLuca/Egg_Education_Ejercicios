package Circunferencia.Entidades;
/**
 * @author Luca Monte
 */
public class Circunferencia {
    
    //Atributos
    
    private double radio;
    
    //Constructor por defecto

    public Circunferencia() {
        
    }
    
    //Constructor con parametros

    public Circunferencia(double radio) {
        
        this.radio = radio;
        
    }
    
    //Getters y Setters

    public double getRadio() {
        
        return radio;
        
    }

    public void setRadio(double radio) {
        
        this.radio = radio;
        
    } 
}