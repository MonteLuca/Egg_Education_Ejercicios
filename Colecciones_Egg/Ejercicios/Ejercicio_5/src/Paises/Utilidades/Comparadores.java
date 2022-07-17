package Paises.Utilidades;

import Paises.Entidades.Paises;

import java.util.Comparator;
/**
 * @author Luca Monte
 */
public class Comparadores {
    
    public static Comparator <Paises> ordenarPaises = new Comparator<Paises>() {
        
        @Override
        
        public int compare(Paises t, Paises t1) {
            
            return t.getNombrePais().compareTo(t1.getNombrePais());
            
        }
    };      
 
}