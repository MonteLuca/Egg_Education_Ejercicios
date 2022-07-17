/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_03_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.next();
        String fraseMin = frase.toLowerCase();
        String fraseMay = frase.toUpperCase();
     
        System.out.println("La frase en mayusculas seria: " + fraseMin);
        System.out.println("La frase en minisculas seria: " + fraseMay);
    }
}