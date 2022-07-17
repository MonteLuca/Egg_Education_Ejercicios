/**
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados.
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EjercicioExtraJava_11_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;   
        int cont = 0;
        System.out.println("Ingrese un numero entero positivo");
        numero = teclado.nextInt();
        while (numero >= 1) {            
            numero = numero / 10;
            cont = cont + 1;
        }  
        System.out.println("El numero tiene " + cont + " digitos");
    }
}