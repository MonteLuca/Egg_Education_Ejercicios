package Perros.Entidades;
/**
 * @author Luca Monte
 */
public class Perros {
    
    //Atributos
    
    private String raza;
    
    private String eliminar;
    
    //Constructor vacio y por parametros

    public Perros() {
        
    }

    public Perros(String raza) {
        this.raza = raza;
    }
    
    //Getters and setters

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEliminar() {
        return eliminar;
    }

    public void setEliminar(String eliminar) {
        this.eliminar = eliminar;
    }
 
    //ToString

    @Override
    public String toString() {
        
        return raza;
        
    }
    
}