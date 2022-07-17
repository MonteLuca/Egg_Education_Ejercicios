package Ruleta.Entidades;
/**
 * @author Luca Monte
 */
public class Revolver {
    
    //Atributos
    
    private Integer posicionActual;
    
    private Integer posicionAgua;
    
    //Constructor sin parametros

    public Revolver() {
        
    }
    
    //Constructor con parametros

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    //Getters and setters

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        
        this.posicionActual = posicionActual;
        
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    
        
}