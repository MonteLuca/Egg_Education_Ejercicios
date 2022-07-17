package Persona2.Servicios;

import Persona2.Entidades.Persona2;
import java.util.Date;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Persona2Servicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Persona2 crearPersona() {
        
        Persona2 persona = new Persona2();
        
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(teclado.next());
        
        System.out.println("Ingrese una fecha de nacimiento: ");
        System.out.println("DIA: ");
        System.out.print(">");
        int dia = teclado.nextInt();
        
        System.out.println("MES: ");
        System.out.print(">");
        int mes = teclado.nextInt();
        
        System.out.println("AÑO: ");
        System.out.print(">");
        int anio = teclado.nextInt();
        
        persona.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia)) ;
        
        return persona;
        
    }
    
    public void calcularEdad(Persona2 persona) {
        
        Date fechaActual = new Date();

        int diferencia = Math.abs((persona.getFechaNacimiento().getYear()) - (fechaActual.getYear()));
        
        if (fechaActual.getMonth() < persona.getFechaNacimiento().getMonth()) {
            
            diferencia -= 1;
            
        }
        
        persona.setEdad(diferencia);
        
        System.out.println(persona.getNombre() + " tiene " + diferencia + " años");
        
    }
    
    public boolean menorQue (Persona2 persona) {
        
        System.out.println("Ingrese la edad de una persona: ");
        int edad = teclado.nextInt();
        
        if (edad < persona.getEdad()) {
            
            System.out.println("La persona es mas joven que " + persona.getNombre());
            return true;
            
        } else {
            
            System.out.println("La persona es mas vieja que " + persona.getNombre());
            return false;
            
        }
        
    }
    
    public void mostrarPersona(Persona2 persona) {
        
        System.out.println("Persona2{" + "Nombre = " + persona.getNombre() + ", FechaNacimiento = " + persona.getFechaNacimiento() + ", Edad = " + persona.getEdad() + '}');
        
    }   
}