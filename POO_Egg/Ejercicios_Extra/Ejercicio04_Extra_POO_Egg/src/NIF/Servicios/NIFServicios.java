package NIF.Servicios;

import NIF.Entidades.NIF;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class NIFServicios {
    
    Scanner teclado = new Scanner(System.in);
    
    public NIF crearNif() {
        
        NIF n1 = new NIF();
        
        do {            
            
            System.out.println("Ingrese su DNI");
            n1.setDNI(teclado.nextInt());
            
        } while (n1.getDNI() > 0 && n1.getDNI() < 1000000);  
        
        return n1;
        
    }
    
    public void mostrar(NIF n1) {
        
        int resto = n1.getDNI() % 23;
        
        String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.println("El NIF seria " + n1.getDNI() + " - " + vector[resto]);
        
    }
    
}