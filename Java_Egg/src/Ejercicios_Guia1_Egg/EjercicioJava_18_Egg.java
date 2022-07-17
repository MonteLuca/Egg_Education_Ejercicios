/*

Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_18_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        for (int i = 0; i < 4; i++) { 
            do {       
                System.out.println("Ingrese un numero");
                numero = teclado.nextInt();  
            } while (numero < 1 || numero > 20);
            int cont = numero;
            System.out.print(numero);
            for (int p = 0; p < cont ; p++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
}