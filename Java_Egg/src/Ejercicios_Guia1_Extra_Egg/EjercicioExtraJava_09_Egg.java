/**
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
Dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EjercicioExtraJava_09_Egg {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese el dividendo");
        int dividendo = teclado.nextInt();
        System.out.println("Por cuanto lo quiere dividir?");
        int divisor = teclado.nextInt();
        while (dividendo >= divisor) {            
            dividendo = dividendo - divisor;
            cont++;
        }
        
        System.out.println("El resulado es " + cont + " y el residuo es: " + dividendo);
    }
}