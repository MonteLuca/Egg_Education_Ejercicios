/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_05;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Juego de Adinanza");
        
        int numeroRamdom = ((int)(Math.random() * 500 + 1));
        
        int opc = 0;
        
        int cont = 0;
            
        boolean banderita = false;
        
        System.out.println(numeroRamdom);
        
        do {            
            
            System.out.println("Adivina el numero");
                
            try {
                          
                opc = teclado.nextInt();
                
                if (numeroRamdom < opc) {
                
                    System.out.println("El numero es menor");
                    
                    cont++;
                
                } else if (numeroRamdom > opc){
                
                    System.out.println("El numero es mayor");
                    
                    cont++;
                
                } else {
                    
                    banderita = true;
                    
                    break;
                    
                }
   
            } catch (Exception InputMismatchException) {
                
                System.out.println("ERROR: Ingreso una letra");
                
                teclado.next();
                
                cont++;
                 
            }
 
        } while (!banderita);
        
        System.out.println("El numero era " + numeroRamdom + " y te costo adivinarlo " + cont + " veces ");
        
    }
    
}