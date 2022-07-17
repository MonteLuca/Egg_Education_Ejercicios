/* 
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_01_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros para realizar una suma");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero 1: ");
        int a = teclado.nextInt();
        System.out.print("Ingrese el numero 2: ");
        int b = teclado.nextInt();
        
        int resultado = a + b;
        System.out.println("El resultado de " + a + " + " + b + " = " + resultado);
    }
}