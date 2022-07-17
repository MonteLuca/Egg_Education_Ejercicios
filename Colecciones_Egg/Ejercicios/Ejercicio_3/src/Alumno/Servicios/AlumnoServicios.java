package Alumno.Servicios;

import Alumno.Entidades.Alumno;

import java.util.ArrayList;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class AlumnoServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList <Alumno> guardarAlumno = new ArrayList();
    
    public Alumno cargarAlumno() {
        
        ArrayList <Integer> notas = new ArrayList();
        
        Alumno alumno = new Alumno();
        
        System.out.println("Ingrese el nombre del alumno: ");
        
        alumno.setNombre(teclado.next());

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese la nota N°" + (i + 1));
            
            notas.add(teclado.nextInt());
            
        }
        
        alumno.setNotas(notas);
        
        return alumno;
        
    }
    
    public double notalFinal(ArrayList <Integer> notas) {
        
        System.out.println("Las notas que obtuvo son: ");
        
        double notaFinal = 0;
        
        int cont = 1;
        
        for (Integer aux : notas) {
            
            System.out.println("Nota N°" + cont );
            
            System.out.println(aux);
            
            cont++;
            
            notaFinal += aux;
            
        }
        
        return notaFinal / 3;
        
    }
    
    public void crearAlumno(Alumno alumno) {
        
        String opc = "";
        
        do {            
            
            guardarAlumno.add(cargarAlumno());
            
            System.out.println("Desea cargar otro alumno? (si/no)");
            
            opc = teclado.next();
            
        } while (!opc.toUpperCase().equals("NO"));
        
    }
    
    public void encontrarAlumno() {
        
        String nombre = "";
        
        System.out.println("De que alumno desea sacar la nota, ingrese su nombre: ");
        
        nombre = teclado.next();
        
        boolean bandera = false;
        
        for (Alumno aux : guardarAlumno) {
            
            if (aux.getNombre().equals(nombre)) {
                
                System.out.println("La nota final del alumno " + aux.getNombre() + " es: " + notalFinal(aux.getNotas()) );
                
                bandera = true;
                
            } 
            
        }
        
        if (bandera == false) {

            System.out.println("No se encontro el alumno");
            
        }
        
    }
}