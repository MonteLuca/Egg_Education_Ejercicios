/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/*
 * @author Luca Monte
*/
public class EjercicioExtraJava_01_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Conversion de minutos a horas y dias");
        System.out.println("Ingrese los minutos: ");
        System.out.print(">");
        int minutos = teclado.nextInt();
        int horas = (minutos * 1) / 60;
        int dias = (minutos * 1) / 1440;
        System.out.println("Los " + minutos + " minutos serian " + horas + " horas");
        System.out.println("Los " + minutos + " minutos serian " + dias + " dias");
    }   
    
}