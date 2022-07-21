package Ejercicio_02;

import java.util.ArrayList;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class main {

    public static void main(String[] args) {
        
        ArrayList <String> palabrasGuardadas = new ArrayList();
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Ingrese un palabra al Arraylist");
            
            palabrasGuardadas.add(teclado.next());
            
        }
        
        System.out.println("Las palabras guardadas fueron: ");
        
        for (int i = 0; i < palabrasGuardadas.size(); i++) {
            
            System.out.println("Posicion " + i);
            
            System.out.println(palabrasGuardadas.get(i));
            
        }
        
        System.out.println("Que posicion desea consultar");
        
        int num = teclado.nextInt();
        
        try {
            
            System.out.println(palabrasGuardadas.get(num));
            
        } catch (Exception IndexOutOfBoundsException) {
            
            System.out.println("Esa posicion no existe");
            
        }
  
    }  
}