/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
 investigar la función equals() en Java
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_08_Egg {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Su palabra coincidio con la palabra eureka");
        } else {
            System.out.println("No coincidio su palabra con la palabra eureka");
        }  
    } 
}