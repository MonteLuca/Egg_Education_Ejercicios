package Puntos.Servicios;

import Puntos.Entidades.Puntos;
import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class PuntosServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public Puntos cargarDatos(){
        
        Puntos p1 = new Puntos();
        
        System.out.println("Ingrese X1: ");
        System.out.print(">");
        
        p1.setX1(teclado.nextDouble());
        
        System.out.println("Ingrese Y1: ");
        System.out.print(">");
        
        p1.setY1(teclado.nextDouble());
        
        System.out.println("Ingrese X2: ");
        System.out.print(">");
        
        p1.setX2(teclado.nextDouble());
        
        System.out.println("Ingrese Y2: ");
        System.out.print(">");
        
        p1.setY2(teclado.nextDouble());
        
        return p1;
        
    }
    
    public void calcularDistancia(Puntos p1) {
        
        double distancia = Math.sqrt((p1.getX2() - p1.getX1()) + (p1.getY2() - p1.getY1()));
        
        System.out.println("La distancia que hay entre el P1 y el P2 es: " + distancia);
        
    }
    
}