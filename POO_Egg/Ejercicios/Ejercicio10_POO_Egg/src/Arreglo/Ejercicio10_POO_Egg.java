/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Arreglo;

import java.util.Arrays;
/**
 * @author Luca Monte
 */
public class Ejercicio10_POO_Egg {
    
    public static void main(String[] args) {
        
        double[] arreglo_a = new double[50];
        
        double[] arreglo_b = new double[20];
        
        for (int i = 0; i < arreglo_a.length; i++) {
            
            arreglo_a[i] = Math.round(Math.random() * 50 + 1);
            
        }
        
        Arrays.sort(arreglo_a);
        System.out.println("ARREGLO A");
        for (int i = 0; i < arreglo_a.length; i++) {
            
            System.out.println(arreglo_a[i]);
        }
        
        System.out.println("-------------");
       
        System.out.println("ARREGLO B");
        
        arreglo_b = Arrays.copyOf(arreglo_a, 20);
        
        Arrays.fill(arreglo_b, 10, 20, 0.5);
        
        for (int i = 0; i < arreglo_b.length; i++) {
            
            System.out.println(arreglo_b[i]);
            
        }
    }   
}