/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_22_Egg {
    
    public static void main(String[] args) throws InterruptedException {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.println("De cuanto quiere que sea el vector?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int[] vector = new int[n];
        System.out.print("RELLENANDO VECTOR ");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(1000); 
        System.out.print(".");
        Thread.sleep(2000);
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999); //Rellenando el vector[n] de numeros aleatorios;
        }
        
        System.out.println(" ");
        System.out.println("IMPRIMIMOS EL VECTOR");
        System.out.print("|");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + "|");      //Imprimimos el vector
        }
        System.out.println(" ");
        
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 0 && vector[i] <= 9) {
                cont1 += 1;
            } else if (vector[i] >= 10 && vector[i] <= 99) {
                cont2 += 1;
            } else if (vector[i] >= 100 && vector[i] <= 999) {
                cont3 += 1;
            } else if (vector[i] >= 1000 && vector[i] <= 9999){
                cont4 += 1;
            } else if (vector[i] >= 10000 && vector[i] <= 99999) {
                cont5 += 1;
            }
        }
        
        System.out.println("Hay " + cont1 + " numero de 1 solo digito");
        System.out.println("Hay " + cont2 + " numero de 2 digitos");
        System.out.println("Hay " + cont3 + " numero de 3 digitos");
        System.out.println("Hay " + cont4 + " numero de 4 digitos");
        System.out.println("Hay " + cont5 + " numero de 5 digitos");     
    }   
}