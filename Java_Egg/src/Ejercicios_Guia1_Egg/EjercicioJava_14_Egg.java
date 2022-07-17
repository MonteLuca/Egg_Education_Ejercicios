/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_14_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        for (int i = 0;i < 20;i++){
            
            System.out.println("Ingrese numeros positivos");
            numero = teclado.nextInt();
            if (numero == 0){
                System.out.println("Se capturo el numero cero");
                break;
            } else if (numero < 0) {
                System.out.println("Ingrese un numero negativo no se tendra en cuenta");
                continue;
            }
            
            suma += numero;
            
            System.out.println("La suma es : " + suma);
            
        } 
        System.out.println("Salio del programa");
    }
}