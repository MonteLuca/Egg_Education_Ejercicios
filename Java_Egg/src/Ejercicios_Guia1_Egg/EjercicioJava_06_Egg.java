/*
 Implementar un programa que dado dos números enteros determine cuál es el 
 mayor y lo muestre por pantalla
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_06_Egg {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros para saber cual es el mayor");
        System.out.print("Numero 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        int num2 = teclado.nextInt();
        
        if (num1 > num2) {
            System.out.println("El numero 1 : " + num1 + " es mayor que " + num2);
        } else {
            System.out.println("El nuemro 2 : " + num2 + " es mayor que " + num1);
        }
        
    }   
}