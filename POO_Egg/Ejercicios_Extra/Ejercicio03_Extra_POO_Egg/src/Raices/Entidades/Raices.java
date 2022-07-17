package Raices.Entidades;
/**
 * @author Luca Monte
 */
public class Raices {
    
    //Atributos
    
    private int a;
    
    private int b;
    
    private int c;
    
    private double discri;
    
    //Constructor por defecto

    public Raices() {
    }
    
    //Constructor parametrizado

    public Raices(int a, int b, int c, double discri) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discri = discri;
    }

    //Getters and Setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscri() {
        return discri;
    }

    public void setDiscri(double discri) {
        this.discri = discri;
    }
}