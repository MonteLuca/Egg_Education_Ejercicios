package Paises.Servicios;

import Paises.Entidades.Paises;

import java.util.Iterator;

import java.util.Scanner;

import java.util.TreeSet;
/**
 * @author Luca Monte
 */
public class PaisesServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    TreeSet <Paises> guardarPaises = new TreeSet();
    
    public Paises cargarPaises () {
        
        Paises p1 = new Paises();
        
        System.out.println("Ingrese el nombre del pais");
        
        p1.setNombrePais(teclado.next());
        
        return p1;
        
    }
    
    public void crearPaises (Paises p1) {
        
        String opc;
        
        int cont = 1;
        
        do {            
            
            guardarPaises.add(cargarPaises());
            
            System.out.println("Desea guardar otro pais? (si/no) ");
            
            opc = teclado.next();
            
            
        } while (!opc.toUpperCase().equals("NO") && !opc.toUpperCase().equals("N"));
          
    }
    
    public void mostrarOrden () {
        
        int cont = 1;
        
        System.out.println("Paises ordenados alfabeticamente");
 
        for (Paises aux : guardarPaises) {
            
            System.out.println("Pelicula N°" + cont);
            
            System.out.println(aux);
            
            cont++;
            
        }     
    }
    
    public void eliminarPais() {
        
        Iterator <Paises> it = guardarPaises.iterator();
        
        int cont = 1;

        System.out.println("Que pais desea eliminar?");
        
        String decision = teclado.next();
        
        boolean bandera = false;
        
        while (it.hasNext()) {
            
            Paises next = it.next();
            
            if (decision.equals(next.getNombrePais())) {
                
                it.remove();
                
                bandera = true;
                
            }
            
        }
        
        if (bandera) {
            
            System.out.println("Se elimino a " + decision + " de la lista");
            
            for (Paises guardarPaise : guardarPaises) {
                
                System.out.println(guardarPaise);
                
            }
            
        } else {
            
            System.out.println("No se elimino a nadie");
            
        }
        
    }
    
}
