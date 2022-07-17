/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
*/
package Paises;

import Paises.Entidades.Paises;

import Paises.Servicios.PaisesServicios;
/**
 * @author Luca Monte
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        PaisesServicios ps1 = new PaisesServicios();
        
        ps1.crearPaises(new Paises());
        
        ps1.mostrarOrden();
        
        ps1.eliminarPais();
        
    }
    
}