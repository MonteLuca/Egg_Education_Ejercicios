/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
 largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
 un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
 imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_09_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        if (frase.length() <= 8) {
            System.out.println("La palabra que ingrese tiene menos o igual a 8 caracteres");
        } else {
            System.out.println("La palabra que ingreso supero los 8 caracteres");
        }
        
    }
}