package Libro.Entidades;
/**
 * @author Luca Monte
 */
public class Libro {
    
    //Atributos
    
    private String titulo;
    
    private int ISBN;
    
    private String autor;
    
    private int numerosPag;
    
    //Constructor vacio

    public Libro() {
        
    }
    
    //Constructor con atributos

    public Libro(String titulo, int ISBN, String autor, int numerosPag) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numerosPag = numerosPag;
    }
    
    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerosPag() {
        return numerosPag;
    }

    public void setNumerosPag(int numerosPag) {
        this.numerosPag = numerosPag;
    }
    
}