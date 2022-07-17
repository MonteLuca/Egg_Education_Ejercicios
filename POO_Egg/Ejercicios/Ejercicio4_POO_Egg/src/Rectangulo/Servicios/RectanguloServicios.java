package Rectangulo.Servicios;

import Rectangulo.Entidades.Rectangulo;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class RectanguloServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public Rectangulo pedirDatos() {
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(teclado.nextInt());
        
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(teclado.nextInt());
        
        return r1;
        
    }
    
    public double calcularSuperficie(Rectangulo r1) {
        
        double superficie = r1.getBase() * r1.getAltura();
        
        return superficie;
        
    }
    
    public double calcularPerimetro(Rectangulo r1) {
        
        double perimetro = (r1.getBase() + r1.getAltura()) * 2;
        
        return perimetro;
        
    }
    
    public void dibujarRectangulo(Rectangulo r1) {
        
       for (int i = 1; i <= r1.getAltura(); i++) {
           
            for (int j = 1; j <= r1.getBase(); j++) {

                if ((i > 1 && i < r1.getAltura()) && (j > 1 && j < r1.getBase())) {
                    
                    System.out.print(" ");
                    
                } else {
                    
                    System.out.print("*");
                    
                }
            }
            
            System.out.println("");
           
        }
    }  
}