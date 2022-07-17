/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa).
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_24_Egg {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int A[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};    //Se crea la matriz
        int AT[][] = new int[3][3];
        boolean band2 = true;    //Se crea una variable bandera 2

        System.out.println("Ingrese valores a la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Ingrese un numero el la posicion"+"[ "+i+"]"+"[ "+j+"]"+" = ");

                A[i][j] = leer.nextInt();

            }
        }

        //Imprimir la matriz
        System.out.println("La matriz es:");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");

        //Determinar si es antisimetrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[j][i] = (-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
                if (AT[i][j] != A[i][j]) {
                    band2 = false;
                    i = 3;
                    break;
                }
            }
        }

        //Mostrar si es antisimetrica o no
        if (band2) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
}