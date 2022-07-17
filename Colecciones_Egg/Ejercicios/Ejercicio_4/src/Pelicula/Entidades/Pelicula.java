package Pelicula.Entidades;
/**
 * @author Luca Monte
 */
public class Pelicula {
    
    //Atributos
    
    private String titulo;
    
    private String director;
    
    private Double horas;
    
    //Constructor por defecto

    public Pelicula() {
        
    }
    
    //Constructor parametrizado

    public Pelicula(String titulo, String director, Double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }
    
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }
}   