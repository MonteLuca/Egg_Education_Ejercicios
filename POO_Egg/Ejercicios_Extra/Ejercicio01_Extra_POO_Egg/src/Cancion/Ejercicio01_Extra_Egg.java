/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes
 */
package Cancion;

import Cancion.Entidades.Cancion;
import Cancion.Servicios.CancionServicios;

/**
 * @author Luca Monte
 */
public class Ejercicio01_Extra_Egg {

    public static void main(String[] args) {
        
        CancionServicios cs1 = new CancionServicios();
        
        Cancion c1 = cs1.cargarDatos();
        
        cs1.mostrarDatos(c1);
        
    }   
}