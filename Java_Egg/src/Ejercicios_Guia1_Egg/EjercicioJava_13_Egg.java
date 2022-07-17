/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial
*/
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_13_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {            
            System.out.println("Ingrese un numero entero positivo");
            System.out.print(">");
            numero = teclado.nextInt();
        } while (numero <= 0);
        int suma = 0;
        int datos;
        do {
            System.out.println("Ingrese numeros hasta superar el limite");
            datos = teclado.nextInt();
            suma += datos;
            System.out.println("La suma es: " + suma);
        } while (suma < numero);
        
        System.out.println("Supero el limite");
        
    }   
}