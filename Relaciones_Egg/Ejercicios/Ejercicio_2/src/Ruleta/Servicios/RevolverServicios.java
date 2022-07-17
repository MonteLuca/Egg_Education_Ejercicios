package Ruleta.Servicios;

import Ruleta.Entidades.Revolver;

import java.util.Objects;
/**
 * @author Luca Monte
 */
public class RevolverServicios {
    
    public void llenarRevolver(Revolver r) {

        r.setPosicionActual((int) (Math.random() * 6) + 1);
        
        r.setPosicionAgua((int) (Math.random() * 6) + 1);
        
    }
    
    public boolean mojar(Revolver r1) {
        
        return Objects.equals(r1.getPosicionActual(), r1.getPosicionAgua());
        
    }
    
    public void siguienteChorro(Revolver r1) {
        
        if (r1.getPosicionActual() > 5) {
            
            r1.setPosicionActual(1);
            
        } else {
            
            r1.setPosicionActual(r1.getPosicionActual() + 1);
  
        }
    }
    
    public String mostrarPosicion(Revolver r1) {
        
        return "La posicion del tambor es " + r1.getPosicionActual() + " y la posicion del agua es " + r1.getPosicionAgua();
                
    }
    
}