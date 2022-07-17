/**
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EjercicioExtraJava_10_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = (int)(Math.random() * 10 + 1);
        int b = (int)(Math.random() * 10 + 1);
        int c = a * b;
        System.out.println(a + "*" + b + "=" + c);
        System.out.println("Se han multiplicado 2 numeros aleatoriamente");
        System.out.println("Ingrese el resultado (Tiene 3 intentos)");
        int intentos = 3;
        int cont = 0;
        do {            
            System.out.println("Intento N°" + (cont+1));
            int n = teclado.nextInt();
            if (n == c) {
                System.out.println("Adivino el numero");
                break;
            } else {
                System.out.println("Intento otra vez");
                intentos-- ;
                cont++ ;
            }
            
        } while (intentos > 0);
        
        if (intentos == 0) {
            System.out.println("No pudo adivinar el numero");
        }
    }
}