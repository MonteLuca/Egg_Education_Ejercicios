/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
package PerroPersona;

import PerroPersona.Atributos.Perro;
import PerroPersona.Atributos.Persona;
import java.util.Scanner;

/**
 * @author Luca Monte
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cuantas personas desea cargar? ");
        
        int opc = teclado.nextInt();
        
        int cont = 1;
        
        do {
         
            Perro perrito = new Perro();
            
            Persona personita = new Persona();

            System.out.println("Cual es el nombre de la persona");
            
            personita.setNombre(teclado.next());
            
            System.out.println("Cual es el apellido de " + personita.getNombre() );
            
            personita.setApellido(teclado.next());
            
            System.out.println("Cuantos años tiene " + personita.getNombre());
            
            personita.setEdad(teclado.nextInt());
            
            System.out.println("Cual es el DNI de " + personita.getNombre());
            
            personita.setDni(teclado.next());
            
            System.out.println("Ingrese el nombre de la mascota de " + personita.getNombre());
            
            perrito.setNombre(teclado.next());
            
            System.out.println("Ingrese la raza de " + perrito.getNombre());
            
            perrito.setRaza(teclado.next());
            
            System.out.println("Ingrese la edad de " + perrito.getNombre());
            
            perrito.setEdad(teclado.nextInt());
            
            System.out.println("Ingrese el tamaño de " + perrito.getNombre());
            
            perrito.setTamano(teclado.next());
            
            cont++;
            
            personita.setPerro(perrito);
            
            System.out.println(personita);
            
        } while (cont == opc);
        
    }
    
}