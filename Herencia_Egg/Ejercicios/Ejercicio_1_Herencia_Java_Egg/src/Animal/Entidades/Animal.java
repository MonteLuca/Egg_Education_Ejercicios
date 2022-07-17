package Animal.Entidades;
/**
 * @author Luca Monte
 */
public class Animal {
    
    //Atributos
    
    protected String nombre;
    
    protected String alimento;
    
    protected Integer edad;
    
    protected String raza;
    
    //Constructor sin parametros

    public Animal() {
        
    }
    
    //Constructor con parametros

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //Metodo
    
    public void Alimentos() {
        
        System.out.println(nombre + " se alimenta de " + alimento);
        
    }
    
    //ToString

    @Override
    public String toString() {
        
        return "El animal se llama " + nombre + " ,tiene " + edad + " años y es de raza " + raza;
        
    }   
}