/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03_04;

import Ejercicio_03_04.entidades.DivisionNumero;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class main {

    public static void main(String[] args) {
        
        int n1 = 0;
        
        int n2 = 0;
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        DivisionNumero dv = new DivisionNumero();
        
        System.out.println("Ingrese dividendo");
        
        dv.setNum1(teclado.next());
        
        System.out.println("Ingrese divisor");
        
        dv.setNum2(teclado.next());
        
        System.out.println("Convirtiendo numeros");
        
        System.out.println(" ");
        
        try {
            
            n1 = Integer.parseInt(dv.getNum1());
        
            n2 = Integer.parseInt(dv.getNum2());
            
            System.out.println("El resultado es: " + (n1/n2));
            
        } catch (NumberFormatException NumberFormatException) {
            
            System.out.println("No se puede convertir una letra a numero");
            
        } catch (Exception ArithmeticException) {
            
            System.out.println("No se puede dividir por cero");
            
        }
        
    }
    
}