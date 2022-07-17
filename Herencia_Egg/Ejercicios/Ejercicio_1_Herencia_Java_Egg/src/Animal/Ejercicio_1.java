/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import Animal.Entidades.Animal;

import Animal.Entidades.Caballo;

import Animal.Entidades.Gato;

import Animal.Entidades.Perro;
import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        Animal perro = new Perro();
        
        Animal gato = new Gato();
        
        Animal caballo = new Caballo();
        
        int opc = 0;
        
        do {
            
        System.out.println("Elige una opcion: ");
        System.out.println("1.Cargar Perro");
        System.out.println("2.Cargar Gato");
        System.out.println("3.Cargar Caballo");
        System.out.println("4.Salir");
        
        opc = teclado.nextInt();
        
            switch(opc) {
                
                case 1:
                    
                    System.out.println("Ingrese el nombre del perro");
                    
                    perro.setNombre(teclado.next());
                    
                    System.out.println("Que come " + perro.getNombre());
                    
                    perro.setAlimento(teclado.next());
                    
                    System.out.println("Cuantos años tiene " + perro.getNombre());
                    
                    perro.setEdad(teclado.nextInt());
                    
                    System.out.println("De que raza es " + perro.getNombre());
                    
                    perro.setRaza(teclado.next());
                    
                    System.out.println(perro);
                    
                    perro.Alimentos();
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese el nombre del gato");
                    
                    gato.setNombre(teclado.next());
                    
                    System.out.println("Que come " + gato.getNombre());
                    
                    gato.setAlimento(teclado.next());
                    
                    System.out.println("Cuantos años tiene " + gato.getNombre());
                    
                    gato.setEdad(teclado.nextInt());
                    
                    System.out.println("De que raza es " + gato.getNombre());
                    
                    gato.setRaza(teclado.next());
                    
                    System.out.println(gato);
                    
                    gato.Alimentos();
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el nombre del caballo");
                    
                    caballo.setNombre(teclado.next());
                    
                    System.out.println("Que come " + caballo.getNombre());
                    
                    caballo.setAlimento(teclado.next());
                    
                    System.out.println("Cuantos años tiene " + caballo.getNombre());
                    
                    caballo.setEdad(teclado.nextInt());
                    
                    System.out.println("De que raza es " + caballo.getNombre());
                    
                    caballo.setRaza(teclado.next());
                    
                    System.out.println(caballo);
                    
                    caballo.Alimentos();
                    
                    break;
                    
                case 4:
                       
                    System.out.println("Muchas gracias");
                    
                    break;
                    
                    default:
                        
                        System.out.println("Opcion erronea");
                
            }

        } while (opc != 4);       
    }  
    
}