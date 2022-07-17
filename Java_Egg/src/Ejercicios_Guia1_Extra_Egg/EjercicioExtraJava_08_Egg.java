/**
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;

/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_08_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contP = 0;
        int contN = 0;
        for (int i = 0;i < 100000; i++) {
            System.out.println("Ingrese numeros");
            int n = teclado.nextInt();
            if (n % 5 == 0) {
               break;
            } else if (n % 2 != 0) {
                contN = contN + 1;
            } else {
                contP = contP + 1;
            }
        }
        
        System.out.println("Hay " + contP + " numeros pares");
        System.out.println("Hay " + contN + " numeros inpares");
    }
}