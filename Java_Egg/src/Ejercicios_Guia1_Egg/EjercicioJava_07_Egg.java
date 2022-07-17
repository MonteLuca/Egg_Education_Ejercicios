/*
  Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_07_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero para averiguar si es par o no");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
     
        if (num1 % 2 == 0){
            System.out.println("El numero " + num1 + " es par");
        } else {
            System.out.println("El numero " + num1 + " es impar");
        }
    }
    
}