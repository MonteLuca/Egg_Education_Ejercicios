package Circunferencia.Servicios;

import Circunferencia.Entidades.Circunferencia;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class CircunferenciaServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia() {
        
        //Instancio un objeto de Circunferencia
        
        System.out.println("Ingrese radio");
        
        Circunferencia c1 = new Circunferencia(teclado.nextDouble());
        
        return c1;
        
    }
    
    public void calcularArea(Circunferencia c1) {
        
        double area;
        
        area = 3.14 * Math.pow(c1.getRadio(), 2);
        
        System.out.println("El area de la circunferencia es: " + area);
        
    }
    
    public void calcularPerimetro(Circunferencia c1) {
        
        double perimetro;
        
        perimetro = (2 * 3.14) * c1.getRadio();
        
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        
    }
}