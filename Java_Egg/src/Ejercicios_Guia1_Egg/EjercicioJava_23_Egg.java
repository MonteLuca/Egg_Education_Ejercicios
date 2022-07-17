/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz.
 */
package Ejercicios_Guia1_Egg;

public class EjercicioJava_23_Egg {

    public static void main(String[] args)throws InterruptedException {
        int[][] matriz = new int [4][4];
        System.out.print("RELLENANDO MATRIZ ");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(2000);
        
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                matriz[i][p] = (int) (Math.random() * 10 + 1);  //Rellenando matriz
            }
        }
        System.out.println(" ");
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.print(" " + matriz[i][p]);       //Matriz original
            }
            System.out.println(" ");
        }
        Thread.sleep(2000);
        System.out.println("MATRIZ TRANSPUESTA");
        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + matriz[i][p]);       //Matriz transpuesta
            }
            System.out.println(" ");
        }
    }   
}