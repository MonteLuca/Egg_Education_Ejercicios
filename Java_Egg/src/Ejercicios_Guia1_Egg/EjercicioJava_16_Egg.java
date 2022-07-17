/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios_Guia1_Egg;

import java.util.Scanner;

public class EjercicioJava_16_Egg {

    public static void main(String[] args) {
        
        System.out.println("Funcionamiento de un dispositivo RS232");
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        int contC = 0; 
        int contI = 0;
        while (!frase.equals("&&&&&")) {            
            System.out.println("Ingrese cadena");
            frase = teclado.next();
            if (!frase.equals("&&&&&")){
                if (frase.length() == 5 && frase.substring(0,1).toUpperCase().equals("X") && frase.substring(4,5).toUpperCase().equals("O")) {
                    System.out.println("CORRECTO");
                    contC++;
                } else {
                    System.out.println("INCORRECTO");
                    contI++;
                }
            }
        }
        System.out.println("Usted ingreso la cadena corretamente " + contC + " veces");
        System.out.println("Usted ingreso la cadena incorretamente " + contI + " veces");
    }  
}