/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_21_Egg {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("De cuanto tamaño quiere que sea el vector");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int[]vector = new int[n];
        System.out.print("RELLENANDO VECTOR ");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(2000);
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);  //Rellenamos el vector con numeros aleatorios
        }
        System.out.println(" ");
        System.out.println("IMPRIMIMOS EL VECTOR");
        System.out.print("|");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + "|");      //Imprimimos el vector
        }
        System.out.println(" ");
        System.out.println("Que numero desea buscar en el vector?");
        int duda = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i] == duda) {
               System.out.println("El numero " + duda + " esta en la posicion " + i);
            }    
        }  
        
    }
}