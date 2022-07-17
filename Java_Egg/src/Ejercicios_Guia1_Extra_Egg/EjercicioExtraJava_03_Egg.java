/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String. 
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_03_Egg {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = teclado.next();
        if (letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
            System.out.println(letra.toUpperCase() + " es una vocal");
        } else {
            System.out.println("No es vocal");
        }
    }   
}