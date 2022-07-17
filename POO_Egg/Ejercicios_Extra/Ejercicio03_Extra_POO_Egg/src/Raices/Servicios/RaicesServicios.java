package Raices.Servicios;

import Raices.Entidades.Raices;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class RaicesServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public Raices cargarDatos(){
        
        Raices r1 = new Raices();
        
        System.out.println("Ingrese el termino a: ");
        r1.setA(teclado.nextInt());
        
        System.out.println("Ingrese el termino b: ");
        r1.setB(teclado.nextInt());
        
        System.out.println("Ingrese el termino c: ");
        r1.setC(teclado.nextInt());
        
        return r1;
        
    }
    
    public double getDiscriminante(Raices r1){
        
        r1.setDiscri(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC());
        
        return r1.getDiscri();
        
    }
    
    public boolean tieneRaices(Raices r1) {
        
        boolean logic;
        
        if (r1.getDiscri() >= 0) {
            
            logic = true;
            
        } else {
            
            logic = false;
        }
        
        return logic;
        
    }
    
    public boolean tieneRaiz(Raices r1) {
        
        boolean logic;
        
        if (r1.getDiscri() == 0) {
            
            logic = true;
            
        } else {
            
            logic = false;
            
        }
        
        return logic;
              
    }
    
    public String obtenerRaices(Raices r1) {
        
        double x1;
        
        double x2;
        
        String mensaje = null;
        
        if (tieneRaices(r1) == true) {
            
            x1 = (-r1.getB()+Math.sqrt(Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
            x2 = (-r1.getB()-Math.sqrt(Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
            
            mensaje = "Las 2 soluciones son: " + x1 + " y " + x2;

        } else {
            
            mensaje = "Solo existe una solucion";
        }
        
        return mensaje;
        
    }
    
    public String obtenerRaiz(Raices r1) {
        
        double raiz;
        
        String mensaje = null;
        
        if (tieneRaiz(r1) == true) {
            
            raiz = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
            
            mensaje = "La raiz de la ecuacion es: " + raiz;
            
        } else {
            
            mensaje = "La ecuacion no tiene solucion unica";
     
        }
        
        return mensaje;
        
    }
    
    public void calcular(Raices r1){
        
        String mensaje = null;
        
        if (tieneRaices(r1) == true) {
            
            System.out.println(obtenerRaices(r1));
            
        } else if (tieneRaiz(r1) == true) {
            
            System.out.println(obtenerRaiz(r1));
            
        } else {
            
            mensaje = "No tiene solucion";
        }
        
    }
    
}