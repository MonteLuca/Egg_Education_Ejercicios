/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_04_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero para obtener su equivalente en numeros romanos");
        int numero = teclado.nextInt();
        switch (numero) {
            case 1:
                System.out.println(numero + " su equivalente en romano es I");
                break;
            case 2:
                System.out.println(numero + " su equivalente en romano es II");
                break;
            case 3:
                System.out.println(numero + " su equivalente en romano es III");
                break;
            case 4:
                System.out.println(numero + " su equivalente en romano es IV");
                break;
            case 5:
                System.out.println(numero + " su equivalente en romano es V");
                break;
            case 6:
                System.out.println(numero + " su equivalente en romano es VI");
                break;
            case 7:
                System.out.println(numero + " su equivalente en romano es VII");
                break;
            case 8:
                System.out.println(numero + " su equivalente en romano es VIII");
                break;
            case 9:
                System.out.println(numero + " su equivalente en romano es IX");
                break;
            case 10:
                System.out.println(numero + " su equivalente en romano es X");
                break;
            default:
                System.out.println("No se configuro ese numero");
        }
    }
}