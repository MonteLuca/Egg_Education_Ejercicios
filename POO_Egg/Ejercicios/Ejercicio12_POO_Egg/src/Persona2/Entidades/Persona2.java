package Persona2.Entidades;

import java.util.Date;
/**
 * @author Luca Monte
 */
public class Persona2 {
    
    //Atributos
    
    private String nombre;
    
    private Date fechaNacimiento;
    
    private int edad;
    
    //Constructor vacio

    public Persona2() {
        
    }
    
    //Constructor parametrizado

    public Persona2(String nombre, Date fechaNacimiento, int edad) {
        
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  
    
    //ToString

    @Override
    public String toString() {
        return "Persona2{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }
    
}