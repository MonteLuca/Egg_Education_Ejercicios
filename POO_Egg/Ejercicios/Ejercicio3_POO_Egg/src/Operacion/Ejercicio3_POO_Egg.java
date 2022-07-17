/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:

a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Operacion;

import Operacion.Entidades.Operaciones;

import Operacion.Servicios.OperacionServicios;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Ejercicio3_POO_Egg {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        OperacionServicios os1 = new OperacionServicios();
        
        System.out.println("Que operacion desea realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                
                Operaciones o1 = os1.crearOperaciones();
                
                System.out.println("El resultado de la suma es: " + os1.sumar(o1));
                break;
                
            case 2:
                
                o1 = os1.crearOperaciones();
                
                System.out.println("El resultado de la suma es: " + os1.restar(o1));
                break;
                
            case 3:
                
                o1 = os1.crearOperaciones();
                
                if (o1.getNumero2() == 0) {
                    
                    System.out.println("¡¡ERROR!! No se puede multiplicar por 0");
                    System.out.println("El resultado de la multiplicacion es: 0");
                    
                } else {
                    
                    System.out.println("El resultado de la multiplicacion es: " + os1.multiplicar(o1));
                    
                }
                break;
                
            case 4:
                
                o1 = os1.crearOperaciones();
                
                if (o1.getNumero2() == 0) {
                    
                    System.out.println("¡¡ERROR!! No se puede dividir por 0");
                    System.out.println("El resultado de la division es: 0");
                    
                } else {
                    
                    System.out.println("El resultado de la multiplicacion es: " + os1.multiplicar(o1));
                    
                }
                break;
            
                default:
                    
                    System.out.println("No ingreso una opcion valida");
        }       
    }  
}