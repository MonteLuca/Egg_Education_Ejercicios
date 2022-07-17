package Ruleta.Servicios;

import Ruleta.Entidades.Jugador;

import Ruleta.Entidades.Revolver;

import java.util.ArrayList;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class JugadorServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Integer> IDguardados = new ArrayList();
    
    RevolverServicios rs1 = new RevolverServicios();
    
    public static int id = 1;
    
    public Jugador crearJugador() {
        
        Jugador j1 = new Jugador();
        
        System.out.println("Ingrese el nombre del jugador ");
        
        j1.setNombre(teclado.next());
        
        IDguardados.add(id);
        
        id++;
        
        return j1;
    }
    
    public boolean disparo(Revolver r1, Jugador j1) {
        
        boolean seMojo = rs1.mojar(r1);
        
        if (seMojo) {
            
            j1.setMojado(true);
            
        }
        
        rs1.siguienteChorro(r1);
        
        return seMojo;
        
    }
    
    public boolean idsGuardados(int IDnuevo) {
        
        for (int IDusado : IDguardados) {
            
            if (IDusado == IDnuevo) {
                
                return false;
                
            }
            
        }
        
        return true;
        
    }
    
}