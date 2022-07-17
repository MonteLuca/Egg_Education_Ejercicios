package Personas.Servicios;

import Personas.Entidades.Personas;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class PersonasServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Personas crearPersonas() {
        String validacion;
        Personas persona = new Personas();
        boolean bandera = true;
        
        System.out.println("Ingrese su nombre");
        persona.setNombre(teclado.next());
        
        System.out.println("Ingrese su edad");
        persona.setEdad(teclado.nextInt());
        
        teclado.nextLine();
        
        do {
            System.out.println("Ingrese su sexo");
            validacion = teclado.next();
            
            if (validacion.toUpperCase().equals("H") || validacion.toUpperCase().equals("M") || validacion.toUpperCase().equals("O")) {
                
                bandera = false;
                
                persona.setSexo(validacion);
                
            } else {
                
                System.out.println("El sexo ingresado no es valido debe ser H,M, u O");
                
            }
            
        } while (bandera);
        
        System.out.println("Ingrese su altura en metros");
        persona.setAltura(teclado.nextDouble());
        
        System.out.println("Ingrese su peso en kg");
        persona.setPeso(teclado.nextDouble());
        
        persona.setImc(calcularIMC(persona));
        
        persona.setMayorEdad(esMayorDeEdad(persona));
        
        return persona;
        
    }
    
    public int calcularIMC(Personas persona) {
        
        int numero = 0;
        
        double imc = (persona.getPeso() / Math.pow(persona.getAltura(), 2));
        System.out.println(imc);
        if (imc < 20) {
            
            numero = -1; //Menos que su peso ideal
            
        } else if (imc >= 20 && imc <= 25) {
            
            numero = 0; //En su peso ideal
            
        } else if (imc > 25) {
            
            numero = 1;  //Mas que su peso ideal
            
        }
        
        return numero;
        
    }
    
    public boolean esMayorDeEdad(Personas persona) {
        
        return persona.getEdad() > 18;
        
    }   
    
}