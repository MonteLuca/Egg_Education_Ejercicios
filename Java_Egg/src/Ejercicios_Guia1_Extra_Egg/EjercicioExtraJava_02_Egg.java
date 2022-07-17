/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar.
*/
package Ejercicios_Guia1_Extra_Egg;

import java.util.Scanner;
/*
 * @author Luca Monte
 */
public class EjercicioExtraJava_02_Egg {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor para la variable A");
        int a = teclado.nextInt();
        System.out.println("Ingrese el valor para la variable B");
        int b = teclado.nextInt();
        System.out.println("Ingrese el valor para la variable C");
        int c = teclado.nextInt();
        System.out.println("Ingrese el valor para la variable D");
        int d = teclado.nextInt();
        
        System.out.println("Los valores iniciales de las variables son: ");
        System.out.println("A vale: " + a);
        System.out.println("B vale: " + b);
        System.out.println("C vale: " + c);
        System.out.println("D vale: " + d);
        
        cambiodevalor(a,b,c,d);
    }

    public static void cambiodevalor(int a,int b,int c,int d){
        int aux;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("Los valores finales son los siguientes: ");
        System.out.println("A vale: " + a);
        System.out.println("B vale: " + b);
        System.out.println("C vale: " + c);
        System.out.println("D vale: " + d);
    }
}