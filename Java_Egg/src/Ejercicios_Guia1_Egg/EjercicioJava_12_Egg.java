/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
 la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_12_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {            
            System.out.println("Ingrese un numero entre 0 y 10");
            numero = teclado.nextInt();
        } while (numero < 0 || numero > 10);
        System.out.println("Usted encargo " + numero + " trajes de furros");
    }    
}