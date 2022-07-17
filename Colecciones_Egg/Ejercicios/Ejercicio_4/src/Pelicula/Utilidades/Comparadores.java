package Pelicula.Utilidades;

import Pelicula.Entidades.Pelicula;

import java.util.Comparator;
/**
 * @author Luca Monte
 */
public class Comparadores {
    
    public static Comparator <Pelicula> ordenarDuracionMayMin = new Comparator<Pelicula> () {
        
        @Override
        
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getHoras().compareTo(t.getHoras());
            
        }
    };
    
    public static Comparator <Pelicula> ordenarDuracionMinMay = new Comparator<Pelicula>() {
        @Override
        
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getHoras().compareTo(t1.getHoras());
            
        }
    };
    
    public static Comparator <Pelicula> ordenarTituloMinMay = new Comparator<Pelicula>() {
        @Override
        
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    };
    
    public static Comparator <Pelicula> ordenarDirectorMinMay = new Comparator<Pelicula>() {
        @Override
        
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
            
        }
    };
    
}