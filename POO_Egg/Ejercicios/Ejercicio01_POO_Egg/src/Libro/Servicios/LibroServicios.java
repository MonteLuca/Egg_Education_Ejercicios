package Libro.Servicios;

import Libro.Entidades.Libro;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class LibroServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro() {
        
        //Instanciamos un objeto de tipo Libro
        
        Libro n1 = new Libro();
        
        //Llenamos los atributos
        
        System.out.println("Ingrese el nombre del libro: ");
        n1.setTitulo(teclado.next());
        
        System.out.println("Ingrese el nombre del autor");
        n1.setAutor(teclado.next());
        
        System.out.println("Ingrese el ISBN de " + n1.getTitulo() + ": ");
        n1.setISBN(teclado.nextInt());
        
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        n1.setNumerosPag(teclado.nextInt());
        
        return n1;
        
    }
    
    public void mostrarInfo(Libro n1) {
        
        System.out.println("El nombre del libro es: " + n1.getTitulo());
        System.out.println("El nombre del autor es: " + n1.getAutor());
        System.out.println("El ISBN del libro es: " + n1.getISBN());
        System.out.println("El libro tiene paginas: " + n1.getNumerosPag());
        
    }
    
}