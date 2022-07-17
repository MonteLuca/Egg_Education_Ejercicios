/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_25_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumaD1 = 0;
        int sumaD2 = 0;
        boolean bandera = true;
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.println("Ingrese las filas");
        int f = teclado.nextInt();
        System.out.println("Ingrese las columnas");
        int c = teclado.nextInt();
        if (f == c) {
            int [][] matriz = new int [f][c];
            
            int[]vectorC = new int [c];
            int[]vectorF = new int [f];
            
            for (int i = 0; i < f;i++) {
                for(int j = 0; j < c;j++) {
                    matriz[i][j] = teclado.nextInt(); 
                }     
            }
            System.out.println("--------------");
            for (int i = 0; i < f;i++) {
                for(int j = 0; j < c;j++) {
                    System.out.print(" " + matriz[i][j]); 
                }
                System.out.println(" ");
            }
            System.out.println("--------------");
            
            for (int j = 0; j < f;j++) {
                for(int i = 0; i < c;i++) {
                    vectorC[j] += matriz[i][j];
                    System.out.println(vectorC[j] + " pos " + j);
                }
            }
            
            for (int i = 0; i < f;i++) {
                for(int j = 0; j < c;j++) {
                    vectorF[i] += matriz[i][j];
                    System.out.println(vectorF[i] + " pos " + i);
                }
            }
            
            for (int i = 0;i < c; i++) {
                sumaD1 += matriz[i][i];
            }
            
            int po = c - 1;
            for (int i = 0; i < c; i++) {
                sumaD2 += matriz[i][po];
                po--;
            }
            
            for (int i = 0; i < c; i++) {
               if (vectorF[i] != vectorC[i]){
                   bandera = false;
               }
            }
            if (bandera = true && sumaD1 == sumaD2) {
                System.out.println("La matriz es magica");
            } else {
                System.out.println("La matriz no es magica");
            }
        } else {
            System.out.println("La matriz no es cuadrada");
        }
    }  
}