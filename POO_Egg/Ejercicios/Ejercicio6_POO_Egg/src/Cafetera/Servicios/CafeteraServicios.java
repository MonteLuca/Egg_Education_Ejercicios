package Cafetera.Servicios;

import Cafetera.Entidades.Cafetera;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class CafeteraServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public Cafetera llenarCafetera() {
        
        Cafetera c1 = new Cafetera();
        
        System.out.println("Cuanto cafe tiene actualmente la cafetera");
        c1.setCantidadActual(teclado.nextInt());
        
        c1.setCapacidadMaxima(c1.getCantidadActual());
        
        return c1;
        
    }
    
    public void servirTaza(Cafetera c1){
        
        System.out.println("Cuanto cafe se quiere servir?");
        int cafeservir = teclado.nextInt();
        
        if (cafeservir > c1.getCantidadActual()) {
                      
            System.out.println("No se lleno completamente la taza, le faltaron " + (cafeservir - c1.getCantidadActual()));
            
            c1.setCantidadActual(0);
            
        } else {
            
            System.out.println("Se lleno completamente la taza, quedaron " + (c1.getCantidadActual() - cafeservir) + " en la cafetera");
            
            c1.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera c1) {
        
        c1.setCantidadActual(0);
        
    }
    
    public void agregarCafe(Cafetera c1) {
        
        System.out.println("Cuanto cafe quiere agregar");
        c1.setCantidadActual(teclado.nextInt());
        
    }
    
}