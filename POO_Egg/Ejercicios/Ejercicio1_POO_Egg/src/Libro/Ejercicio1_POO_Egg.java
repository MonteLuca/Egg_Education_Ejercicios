/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/
package Libro;

import Libro.Entidades.Libro;

import Libro.Servicios.LibroServicios;
/**
 * @author Luca Monte
 */
public class Ejercicio1_POO_Egg {

    public static void main(String[] args) {
        
        LibroServicios ls = new LibroServicios();
        
        Libro n1 = ls.cargarLibro();
        
        ls.mostrarInfo(n1);
    }
}