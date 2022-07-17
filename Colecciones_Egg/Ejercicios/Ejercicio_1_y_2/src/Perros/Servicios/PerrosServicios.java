package Perros.Servicios;

import java.util.Scanner;

import Perros.Entidades.Perros;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;
/**
 * @author Luca Monte
 */
public class PerrosServicios {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    String opcion;

    ArrayList<String> guardarPerros = new ArrayList();

    public Perros cargarDatos() {

        Perros p = new Perros();

        System.out.println("Ingrese la raza de su perro");

        p.setRaza(teclado.next());

        guardarPerros.add(p.getRaza());

        System.out.println("Desea continuar? S para si / N para no");

        opcion = teclado.next();

        while (!opcion.toUpperCase().equals("N")) {

            System.out.println("Ingrese la raza de su perro");

            p.setRaza(teclado.next());

            guardarPerros.add(p.getRaza());

            System.out.println("Desea continuar? S para si / N para no");

            opcion = teclado.next();
            
        }

        return p;
        
    }

    public void mostrarPerros(Perros p) {

        System.out.println("Los perros que guardo son");
        
        Collections.sort(guardarPerros);

        int cont = 1;

        for (String aux : guardarPerros) {

            System.out.println("Perro N°" + cont);

            System.out.println(aux);

            cont += 1;

        }

    }
    
    public void eliminarPerror(Perros p) {
        
        Iterator <String> it = guardarPerros.iterator();
        
        int cont = 1;
        
        System.out.println("Inserte la raza del perro que desea eliminar: ");
        
        p.setEliminar(teclado.next());
        
        boolean bandera = false;
        
        while (it.hasNext()) {
            
            String aux = it.next();
            
            if (aux.equals(p.getEliminar())) {
                
                it.remove();
                
                bandera = true;
                
           }
        }
        
        if (bandera) {
            
            System.out.println("Se elimino " + p.getEliminar() + " de la lista");
            
            System.out.println("La lista quedaria de la siguiente manera: ");
            
            for (String aux : guardarPerros) {

            System.out.println("Perro N°" + cont);

            System.out.println(aux);

            cont += 1;

        }
            
        } else {
            
            System.out.println("No se elimino nada");
            
        }
    } 
}