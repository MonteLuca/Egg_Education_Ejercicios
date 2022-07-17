package Operacion.Entidades;
/**
 * @author Luca Monte
 */
public class Operaciones {
    
    //Atributos
    
    private int numero1;
    
    private int numero2;
    
    //Constructor por defecto

    public Operaciones() {
        
    }
    
    //Constructor por parametros

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Getters y Setters

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
}