package Matematica.Servicios;

import Matematica.Entidades.Matematica;
/**
 * @author Luca Monte
 */
public class MatematicaServicios {
    
    public Matematica cargarDatos() {
        
        Matematica m1 = new Matematica();
        
        m1.setNum1(Math.random() * 10);
        
        m1.setNum2(Math.random() * 10);
        
        return m1;
        
    }
    
    public void mostrarRamdom(Matematica m1) {
        
        System.out.println("El numero 1 es: " + m1.getNum1());
        
        System.out.println("El numero 2 es: " + m1.getNum2());
        
    }
    
    public double devolverMayor(Matematica m1) {
        
        double mayor = Math.max(m1.getNum1(), m1.getNum2());
        
        return mayor;
        
    }
    
    public int calcularPotencia(Matematica m1) {
        
        int num1 = (int) Math.round(m1.getNum1());
        
        int num2 = (int) Math.round(m1.getNum2());
        
        int potencia;
        
        if (num1 > num2) {
            
            int mayor = num1;
            int menor = num2;
            potencia = (int) Math.pow(num1, num2);
             
        } else {
            
            int mayor = num2;
            int menor = num1;
            potencia = (int) Math.pow(num2, num1);
        }
        
        return potencia;
    }
    
    public int calculaRaiz(Matematica m1) {
        
        int num1 = (int) Math.abs(m1.getNum1());
        
        int num2 = (int) Math.abs(m1.getNum2());
        
        int raiz;
        
        if (num1 > num2) {
            
            int mayor = num1;
            int menor = num2;
            raiz = (int) Math.sqrt(menor);
             
        } else {
            
            int mayor = num2;
            int menor = num1;
            raiz = (int) Math.sqrt(menor);
        }
        
        return raiz;        
    }
}