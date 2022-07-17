/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
 grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_04_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese los grados centigrados para convertirlos a Fahrenheit");
        Scanner teclado = new Scanner(System.in);
        int grados = teclado.nextInt();
        int Fahrenheit = 32 + (9 * grados / 5);
        System.out.println("Los grados centigrados : " + grados + ", convertidos a Fahrenheit son " + Fahrenheit);
    }  
}