/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EjercicioExtraJava_13_Egg {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese de cuanto quiere que sea la escalera");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}