/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla 
 el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
 Math.sqrt().
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_05_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero para averiguar su doble, su triple y su raiz cuadrada");
        Scanner teclado = new Scanner(System.in);
        int entero = teclado.nextInt();
        int doble = entero * 2;
        int triple = entero * 3;
        double raizC = Math.sqrt(entero);
        System.out.println("El doble de el numero " + entero + " es: " + doble);
        System.out.println("El triple de el numero " + entero + " es: " + triple);
        System.out.println("La raiz cuadrada de el numero " + entero + "es: " + raizC);
        
    }    
}