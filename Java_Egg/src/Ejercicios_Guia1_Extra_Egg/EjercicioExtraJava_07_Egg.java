/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;

/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_07_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        //subdowhile(suma,cont);
        subwhile(cont, suma);
    }

    public static void subdowhile(int suma,int cont) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int mayor = 1;
        int menor = 10000000;
        int promedio;
        String letra;
        System.out.println("Do-While");
        do {            
            System.out.println("Ingrese numeros");
            n = teclado.nextInt();
            suma = suma + n;
            cont = cont + 1;
            
            if (mayor <= n) {
                mayor = n;
            }
            
            if (menor >= n && n != 0) {
                menor = n;
            }
            promedio = suma / cont;
            if (n == 0) {
                System.out.println("Esta seguro que desea salir del programa? (s/n)");
                letra = teclado.next();
                if (letra.toUpperCase().equals("S")) {
                    break;
                }
            }
        } while (n > 0);
        
        System.out.println("El numero mayor que ingreso fue: " + mayor);
        System.out.println("El numero menor que ingreso fue: " + menor);
        System.out.println("El promedio de los " + (cont - 1) + " numeros que ingreso fue " + promedio);
    }

    public static void subwhile(int cont, int suma) {
        Scanner teclado = new Scanner(System.in);
        int n = 1;
        int mayor = 1;
        int menor = 10000000;
        int promedio = 0;
        System.out.println("While");
        while (n > 0) {
            System.out.println("Ingrese numeros");
            n = teclado.nextInt();
            suma = suma + n;
            cont = cont + 1;

            if (mayor <= n) {
                mayor = n;
            }

            if (menor >= n && n != 0) {
                menor = n;
            }
            promedio = suma / cont;
            continue;
        }
        
        System.out.println("El numero mayor que ingreso fue: " + mayor);
        System.out.println("El numero menor que ingreso fue: " + menor);
        System.out.println("El promedio de los " + (cont - 1) + " numeros que ingreso fue " + promedio);
        
    } 
    
}