package NIF.Entidades;
/**
 * @author Luca Monte
 */
public class NIF {
    
    //Atributos
    
    private int DNI;
    
    private String letra;
    
    //Constructor vacio

    public NIF() {
    }
    
    //Constructor con parametros

    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
    //Getters and Setters

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}