/*
 Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
 Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
 El programa debe mostrar lo siguiente:
        o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
       bomba de agua”. 
        o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una 
       bomba de gasolina”.
        o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una 
       bomba de hormigón”. 
        o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
       bomba de pasta alimenticia”.
        o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
       existe un valor válido para tipo de bomba”
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_11_Egg {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bienvenido a motores.inc");
        Thread.sleep(2000); 
        System.out.println("Que tipo de motor desea comprar");
        System.out.println("1: Bomba de agua");
        System.out.println("2: Bomba de gasolina");
        System.out.println("3: Bomba de hormigon");
        System.out.println("4: Bomba de pasta alimenticia");
        Scanner teclado = new Scanner(System.in);
        System.out.print(">");
        int tipoMotor = teclado.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("Compro una bomba de agua");
                break;
            case 2:
                System.out.println("Compro una bomba de gasolina");
                break;
            case 3:
                System.out.println("Compro una bomba de hormigon");
                break;
            case 4:
                System.out.println("Compro una bomba de pasta alimentecia");
                break;
            default:
                System.out.println("Ingreso una opcion incorrecta.");
        }
        
        System.out.println("Muchas gracias, vuelva pronto");
    } 
}