package Rectangulo.Entidades;
/**
 * @author Luca Monte
 */
public class Rectangulo {
    
    //Atributos
    
    private int base;
    
    private int altura;
    
    //Contructor por defecto

    public Rectangulo() {
        
    }
    
    //Contructor por parametros

    public Rectangulo(int base, int altura) {
        
        this.base = base;
        this.altura = altura;
        
    }
    
    //Getters and Setters

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}