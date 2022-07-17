/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
*/
package Ejercicios_Guia1_Egg;

public class EjercicioJava_20_Egg {

    public static void main(String[] args) {
        System.out.println("VECTOR CON 100 NUMEROS ENTERO");
        int[]vector = new int[101];
        for (int i = 0 ; i < vector.length ; i++) {
            vector[i] = i;
        }
        
        for (int i = vector.length - 1; i >= 0 ; i--){
            System.out.println("Posicion "+ i + " valor: " + vector[i]);
        }
    } 
}