/*

Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €

 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_19_Egg {

    public static void main(String[] args) {
        System.out.println("INGRESE LOS EUROS QUE TIENE");
        Scanner teclado = new Scanner(System.in);
        double euros = teclado.nextDouble();
        cambioDivisas(euros);
    }

    public static void cambioDivisas(double euros) {
        double cambio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("A que moneda desea convertir?");
        System.out.println("Libras");
        System.out.println("Dolar");
        System.out.println("Yenes");
        String decision = teclado.next();
        switch (decision.toLowerCase()) {
            case "libras":
                cambio = 0.86 * euros / 1;
                System.out.println("Convirtio " + euros + "€ a " + cambio + "£");
                break;
            case "dolar":
                cambio = 1.28611 * euros / 1;
                System.out.println("Convirtio " + euros + "€ a " + cambio + "$");
                break;
            case "yenes":
                cambio = 129.852 * euros / 1;
                System.out.println("Convirtio " + euros + "€ a " + cambio + "¥");
                break;
            default:
                System.out.println("No ingreso una moneda valida");
        }
    }
}