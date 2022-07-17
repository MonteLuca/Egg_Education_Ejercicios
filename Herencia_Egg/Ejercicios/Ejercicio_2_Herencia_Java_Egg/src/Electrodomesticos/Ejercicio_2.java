package Electrodomesticos;

import Electrodomesticos.Atributos.Electrodomesticos;

import Electrodomesticos.Atributos.Lavadora;

import Electrodomesticos.Atributos.Televisor;

import java.util.ArrayList;
/**
 * @author Luca Monte
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        ArrayList<Electrodomesticos> guardarAparatos = new ArrayList();

        int total = 0;
        
        for (int i = 0; i < 2; i++) {
            
           Lavadora l1 = new Lavadora();
            
           l1.crearLavadora();
           
           l1.precioFinal();

           guardarAparatos.add(l1);
            
        }

        for (int i = 0; i < 2; i++) {
            
           Televisor t1 = new Televisor();
           
           t1.crearTelevisor();
           
           t1.precioFinal();
        
           guardarAparatos.add(t1);
        
        }
        
        for (Electrodomesticos aux : guardarAparatos) {
            
            aux.precioFinal();
            
            System.out.println(aux.getPrecio());
            
            total += aux.getPrecio();
            
        }
        
        System.out.println("El total de todos los productos es: " + total);
            
    }
}