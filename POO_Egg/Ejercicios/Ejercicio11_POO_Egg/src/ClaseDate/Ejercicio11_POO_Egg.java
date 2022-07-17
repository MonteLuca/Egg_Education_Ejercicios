/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ClaseDate;

import java.util.Date;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Ejercicio11_POO_Egg {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese dia: ");
        System.out.print(">");
        
        int dia = teclado.nextInt();
        
                System.out.println("Ingrese mes: ");
        System.out.print(">");
        
        int mes = teclado.nextInt();
        
                System.out.println("Ingrese año: ");
        System.out.print(">");
        
        int anio = teclado.nextInt();
        
        Date fecha = new Date(anio - 1900,mes - 1,dia);
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha ingresada es: " + fecha);
        
        System.out.println("La fecha actual es: " + fechaActual);
    
        int diferencia = Math.abs((fecha.getYear()) - (fechaActual.getYear()));
        
        if(fechaActual.getMonth() < fecha.getMonth()) {
            
            diferencia -= 1;
            
        }
        
        System.out.println("La diferencia de años entre ambas fechas es de: " + diferencia);
    }
}