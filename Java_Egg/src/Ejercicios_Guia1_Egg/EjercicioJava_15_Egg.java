/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
 muestre por pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_15_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        int operacion;
        String letra = "";
        do {            
            System.out.println("Ingrese 2 numeros enteros");
            System.out.println("NUMERO 1");
            System.out.print(">");
            num1 = teclado.nextInt();
            System.out.println("NUMERO 2");
            System.out.print(">");
            num2 = teclado.nextInt();
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("  MENU  ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    operacion = num1 + num2;
                    System.out.println("La suma es: " + operacion);
                    break;
                case 2:
                    operacion = num1 - num2;
                    System.out.println("La resta es: " + operacion);
                    break;
                case 3:
                    operacion = num1 * num2;
                    System.out.println("La multiplicacion es: " + operacion);
                    break;
                case 4:
                    operacion = num1 / num2;
                    System.out.println("La division es: " + operacion);
                    break;
                default:
                    System.out.println("Desea salir del programa? (s/n)");
                    letra = teclado.next();
            }
            
            if (letra.toUpperCase().equals("S")) {
                System.out.println("Salio del programa");
                break;
            }
            
        } while ("S" != letra);
    } 
}