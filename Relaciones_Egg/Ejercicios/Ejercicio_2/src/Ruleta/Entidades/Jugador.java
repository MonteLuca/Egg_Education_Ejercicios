package Ruleta.Entidades;
/**
 * @author Luca Monte
 */
public class Jugador {
    
    //Atributos
    
    private Integer ID;
    
    private String nombre;
    
    private boolean mojado;
    
    //Constructor sin parametros

    public Jugador() {
        
    }
    
    //Constructor con parametros

    public Jugador(Integer ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    //Getters and Setters

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }   
}