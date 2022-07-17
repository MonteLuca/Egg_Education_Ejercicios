/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_06_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contm = 0;
        int contg = 0;
        int conte = 0;
        double sumam = 0;
        double sumag = 0;
        double sumae = 0;
        System.out.println("Cuantas personas desea promediar");
        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona N°" + (i + 1));
            double altura = teclado.nextDouble();
            if (altura <= 1.60) {
                contm = contm + 1;
                sumam = sumam + altura;
            } else if (altura >= 1.90) {
                conte = conte + 1;
                sumae = sumae + altura;
            } else {
                contg = contg + 1;
                sumag = sumag + altura;
            }
        }
        
        double promem = sumam / contm;
        double promeg = sumag / contg;
        double promee = sumae / conte;
        
        System.out.println("El promedio de estaturas de personas menores a 1.60m es " + promem + "m");
        System.out.println("El promedio de estaturas de personas entre 1.60m y 1.90m es " + promeg + "m");
        System.out.println("El promedio de estaturas de personas mayores a 1.90m es " + promee + "m");
    }   
}