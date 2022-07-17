package PerroPersona.Atributos;
/**
 * @author Luca Monte
 */
public class Persona {
    
    //Atributos
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    private String Dni;
    
    private Perro perro;
    
    //Constructor sin parametros

    public Persona() {
        
    }
    
    //Constructor con parametros

    public Persona(String nombre, String apellido, int edad, String Dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Dni = Dni;
        this.perro = perro;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    //ToString

    @Override
    public String toString() {
        
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", Dni=" + Dni + ", perro=" + perro + '}';
        
    }
 
}