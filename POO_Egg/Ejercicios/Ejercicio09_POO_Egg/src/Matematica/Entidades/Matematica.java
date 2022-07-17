package Matematica.Entidades;
/**
 * @author Luca Monte
 */
public class Matematica {
    
    //Atributos
    
    private double num1;
    
    private double num2;
    
    //Constructor por defecto

    public Matematica() {
        
    }
    
    //Constructor por parametros

    public Matematica(double num1, double num2) {
        
        this.num1 = num1;
        this.num2 = num2;
        
    }
    
    //Getters and Setters

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}