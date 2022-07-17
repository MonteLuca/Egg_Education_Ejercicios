/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla
*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_02_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        System.out.print(">");
        String nombre = teclado.nextLine();
        System.out.println("¡¡Que tal " + nombre + "!! Bienvenido a Java");
    }
}