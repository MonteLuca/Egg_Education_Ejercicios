package Alumno.Entidades;

import java.util.ArrayList;
/**
 * @author Luca Monte
 */
public class Alumno {
    
    //Atributos
    
    private String nombre;

    private ArrayList <Integer> notas;
    
    //Constructor por defecto

    public Alumno() {
        
    }
    
    //Constructor por parametros

    public Alumno(String nombre, ArrayList<Integer> notas) {
        
        this.nombre = nombre;
        this.notas = notas;
        
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
}