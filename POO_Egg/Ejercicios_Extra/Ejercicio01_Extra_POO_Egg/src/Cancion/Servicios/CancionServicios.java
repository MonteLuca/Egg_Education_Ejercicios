package Cancion.Servicios;

import Cancion.Entidades.Cancion;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class CancionServicios {
 
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion cargarDatos() {
        
        Cancion c1 = new Cancion();
        
        System.out.println("Ingrese el nombre de la cancion:");
        c1.setTitulo(teclado.next());
        
        System.out.println("Ingrese el nombre del autor:");
        c1.setAutor(teclado.next());
        
        return c1;
        
    }
    
    public void mostrarDatos(Cancion c1){
        
        System.out.println("El nombre de la cancion es: " + c1.getTitulo());
        
        System.out.println("El nombre del autor/a es: " + c1.getAutor());
        
    }
}