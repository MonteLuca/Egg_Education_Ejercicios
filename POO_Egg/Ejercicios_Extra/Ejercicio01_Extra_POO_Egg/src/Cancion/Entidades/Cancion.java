package Cancion.Entidades;
/**
 * @author Luca Monte
 */
public class Cancion {
    
    //Atributos
    
    private String titulo;
    
    private String autor;
    
    //Constructor por defecto

    public Cancion() {
    }
    
    //Constructor con parametros

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }   
}