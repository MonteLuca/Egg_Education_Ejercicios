/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P
 */
package Ejercicios_Guia1_Egg;

public class EjercicioJava_26_Egg {

    public static void main(String[] args) {
        boolean bandera = true;
        int matriz3[][] = {{22, 9, 90},
        {56, 97, 74},
        {1, 36, 5}};
        System.out.println("MATRIZ DE 3 x 3");
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.print(" " + matriz3[i][p]);
            }
            System.out.println(" ");
        }

        int matriz10[][] = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        System.out.println("MATRIZ DE 10 x 10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + matriz10[i][j]);
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz10[i][j] == matriz3[0][0]
                        && matriz10[i][j + 1] == matriz3[0][1]
                        && matriz10[i][j + 2] == matriz3[0][2]
                        && matriz10[i + 1][j] == matriz3[1][0]
                        && matriz10[i + 1][j + 1] == matriz3[1][1]
                        && matriz10[i + 1][j + 2] == matriz3[1][2]
                        && matriz10[i + 2][j] == matriz3[2][0]
                        && matriz10[i + 2][j + 1] == matriz3[2][1]
                        && matriz10[i + 2][j + 2] == matriz3[2][2]) {

                    System.out.println("El numero de la posicion " + matriz3[0][0] + " esta en la posicion " + i + "," + j);
                    System.out.println("El numero de la posicion " + matriz3[0][1] + " esta en la posicion " + i + "," + (j + 1));
                    System.out.println("El numero de la posicion " + matriz3[0][2] + " esta en la posicion " + i + "," + (j + 2));
                    System.out.println("El numero de la posicion " + matriz3[1][0] + " esta en la posicion " +(i + 1) + "," + j);
                    System.out.println("El numero de la posicion " + matriz3[1][1] + " esta en la posicion " +(i + 1) + "," + (j + 1));
                    System.out.println("El numero de la posicion " + matriz3[1][2] + " esta en la posicion " +(i + 1) + "," + (j + 2));
                    System.out.println("El numero de la posicion " + matriz3[2][0] + " esta en la posicion " +(i + 2) + "," + j);
                    System.out.println("El numero de la posicion " + matriz3[2][1] + " esta en la posicion " +(i + 2) + "," + (j + 1));
                    System.out.println("El numero de la posicion " + matriz3[2][2] + " esta en la posicion " +(i + 2) + "," + (j + 2));
                    
                } else {
                    bandera = false;
                }
            }
        }
        
        if (bandera == false) {
            System.out.println("No se encuentra la matriz de 3x3 en la matriz de 10x10");
        }
    }
    
}
