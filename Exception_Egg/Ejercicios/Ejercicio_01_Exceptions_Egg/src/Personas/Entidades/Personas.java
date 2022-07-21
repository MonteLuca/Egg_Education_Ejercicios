package Personas.Entidades;
/**
 * @author Luca Monte
 */
public class Personas {
    
    //Atributos
    
    private String nombre;
    
    private int edad;
    
    private String sexo;
    
    private double peso;
    
    private double altura;
    
    private int imc;
    
    private boolean mayorEdad;
    
    //Constructor por defecto

    public Personas() {
        
    }
    
    //Constructor por parametros

    public Personas(String nombre, int edad, String sexo, double peso, double altura, int imc, boolean mayorEdad) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.mayorEdad = mayorEdad;
        
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }   

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public boolean getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
 
}