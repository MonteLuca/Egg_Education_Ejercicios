/*

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_17_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Por favor ingrese el tamaño del cuadrado: ");
        int n = teclado.nextInt();
       
        if(n >= 0 && n<=50) {
           
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Error. El dato a ingresar de estar entre 0 y 50");
        }
        System.out.println(" ");
    }
}