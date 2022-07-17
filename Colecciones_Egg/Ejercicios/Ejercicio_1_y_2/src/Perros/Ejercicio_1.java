package Perros;

import Perros.Entidades.Perros;

import Perros.Servicios.PerrosServicios;
/**
 * @author Luca Monte
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        PerrosServicios ps = new PerrosServicios();
        
        Perros p = ps.cargarDatos();
        
        ps.mostrarPerros(p);
        
        ps.eliminarPerror(p);
        
    }   
}