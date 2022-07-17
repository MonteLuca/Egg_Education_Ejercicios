/*
Una obra social tiene tres clases de socios: 
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
   descuento en todos los tipos de tratamientos. 
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
   descuento para los mismos tratamientos que los socios del tipo A. 
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
   dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.
 */
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EjercicioExtraJava_05_Egg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a Osep");
        System.out.println("Que tipo de clase de socio es? (A,B o C)");
        String letra = teclado.next();
        switch (letra.toUpperCase()) {
            case "A":
                System.out.println("Al ser socio clase A tiene un descuento del 50%");
                System.out.println("en todos los tipos de tratamientos");
                System.out.println("Cuanto le cuesta su tratamiento");
                double precio = teclado.nextInt();
                double desc = precio * 0.5;
                double descfinal = precio - desc;
                System.out.println("El precio final de su producto");
                System.out.println("con el 50% de descuento seria: " + descfinal);
                break;
            case "B":
                System.out.println("Al ser socio clase B tiene un descuento del 35%");
                System.out.println("en todos los tipos de tratamientos");
                System.out.println("Cuanto le cuesta su tratamiento");
                precio = teclado.nextInt();
                desc = precio * 0.35;
                descfinal = precio - desc;
                System.out.println("El precio final de su producto");
                System.out.println("con el 35% de descuento seria: " + descfinal);
                break;
            case "C":
                System.out.println("Al ser socio clase C no tiene descuentos ");
                System.out.println("en ningun tipo de tratamientos");
                System.out.println("Cuanto le cuesta su tratamiento");
                precio = teclado.nextInt();
                System.out.println("El precio final de su producto seria " + precio);
                break;
            default:
                System.out.println("No ingreso una clase de socio valida");
        }
    } 
}