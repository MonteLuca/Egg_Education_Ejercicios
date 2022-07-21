package Ejercicio_03_04.entidades;
/**
 * @author Luca Monte
 */
public class DivisionNumero {
    
    //Atributos
    
    private String num1;
    
    private String num2;
    
    //Constructor vacio

    public DivisionNumero() {
        
    }
    
    //Constructor con parametros

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Getters y Setters

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
}