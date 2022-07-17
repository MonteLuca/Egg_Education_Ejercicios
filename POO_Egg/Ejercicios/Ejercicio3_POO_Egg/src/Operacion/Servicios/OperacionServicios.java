package Operacion.Servicios;

import Operacion.Entidades.Operaciones;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class OperacionServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public Operaciones crearOperaciones() {
    
        Operaciones o1 = new Operaciones();
        
        System.out.println("Ingrese el valor del numero 1: ");
        o1.setNumero1(teclado.nextInt());
        
        System.out.println("Ingrese el valor del numero 2: ");
        o1.setNumero2(teclado.nextInt());
        
        return o1;
        
    }
    
    public int sumar(Operaciones o1) {
        
        int suma = o1.getNumero1() + o1.getNumero2();
        
        return suma;
        
    }
    
    public int restar(Operaciones o1){
        
        int resta = o1.getNumero1() - o1.getNumero2();
        
        return resta;
        
    }
    
    public int multiplicar(Operaciones o1) {
        
        int multiplicacion = o1.getNumero1() * o1.getNumero2();
        
        return multiplicacion;
        
    }
    
    public double dividir(Operaciones o1) {
        
        double dividir = o1.getNumero1() / o1.getNumero2();
        
        return dividir;
        
    }
}