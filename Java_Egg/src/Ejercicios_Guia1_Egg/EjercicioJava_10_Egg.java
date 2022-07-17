/*
  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
  frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
  pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
  “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_10_Egg {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.next();
        if ("A".equals(frase.toUpperCase().substring(0,1))){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRETO");
        }
    } 
}