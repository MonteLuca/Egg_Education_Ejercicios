/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

import Pelicula.Entidades.Pelicula;

import Pelicula.Servicios.PeliServicios;

/**
 * @author Luca Monte
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        PeliServicios ps1 = new PeliServicios();
        
        ps1.guardarPelicula(new Pelicula());
        
        //ps1.mostrarPelis();
        
        //ps1.pelis1Hora();
        
        //ps1.duracionMinMay();
        
        //ps1.duracionMayMin();
        
        ps1.ordenDirectores();
        
        ps1.ordenTitulos();
    }   
}