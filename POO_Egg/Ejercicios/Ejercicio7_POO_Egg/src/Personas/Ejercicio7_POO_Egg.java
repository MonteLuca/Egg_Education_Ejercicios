/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
*/
package Personas;

import Personas.Entidades.Personas;

import Personas.Servicios.PersonasServicios;

import java.util.ArrayList;
/**
 * @author Luca Monte
 */
public class Ejercicio7_POO_Egg {

    public static void main(String[] args) {
        
        int contMayor = 0, contMenor = 0, contIdeal = 0,contFalta = 0, contSobra = 0;
        
        PersonasServicios c1 = new PersonasServicios();
        
        ArrayList<Personas>listaPersonas = new ArrayList();
        /*
        [{}, ]
        */
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Persona N°" + (i + 1));
            
            listaPersonas.add(c1.crearPersonas());
            
            if (listaPersonas.get(i).getImc() == -1) { //Agregar o reemplazar Switch
                
                contFalta++;
                
            } else if (listaPersonas.get(i).getImc() == 0) {
                
                contIdeal++;
                
            } else {
                
                contSobra++;
                
            }
            
            if (listaPersonas.get(i).getMayorEdad()) {
                
                contMayor++;
                        
            } else {
                
                contMenor++;
                
            }
            
        }
        
        
        System.out.println("El porcentaje de menores de edad es: " + (contMenor * 100) / 4 + "%" );
        
        System.out.println("El porcentaje de mayores de edad es: " + (contMayor * 100) / 4 + "%" );
        
        System.out.println("El porcentaje de personas con IMC bajo: " + (contFalta * 100) / 4 + "%" );
        
        System.out.println("El porcentaje de personas con IMC ideal: " + (contIdeal * 100) / 4 + "%" );
        
        System.out.println("El porcentaje de personas con IMC alto: " + (contSobra * 100) / 4 + "%" );
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(listaPersonas.get(i).toString());
            
        }
        
    }  
}