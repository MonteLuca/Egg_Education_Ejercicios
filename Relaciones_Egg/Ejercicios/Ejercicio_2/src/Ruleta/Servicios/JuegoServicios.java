package Ruleta.Servicios;

import Ruleta.Entidades.Juego;

import Ruleta.Entidades.Jugador;

import Ruleta.Entidades.Revolver;

import java.util.ArrayList;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class JuegoServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    RevolverServicios rs1 = new RevolverServicios();
    
    JugadorServicios js1 = new JugadorServicios();
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r1) {
        
        System.out.println("EL JUEGO HA COMENZADO");
        
        rs1.llenarRevolver(r1);
        
        System.out.println("Desea cargar jugadores? (S/N)");
        
        String opcion = teclado.next();
        
        llenarJugadores(jugadores, opcion);
         
    }
    
    public void llenarJugadores(ArrayList<Jugador> jugadores, String opcion) {
        
        int cantidad = 6;
        
        if (opcion.trim().equalsIgnoreCase("S")) {
            
            System.out.println("Cuantos jugadores desea cargar? ");
            
            cantidad = teclado.nextInt();
            
        }
        
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Jugadores registrados " + (i + 1) + " de " + cantidad);
            
            jugadores.add(js1.crearJugador());
            
        }
    }
    
    public void resultados (ArrayList<Jugador> jugadores) {
        
        for (Jugador aux : jugadores) {
            
            String seMojo = " Se mojo";
            
            if (!aux.isMojado()) {
                
                seMojo = " no" + seMojo;
                
            }
            
            System.out.println(aux.getNombre() + seMojo);
            
        }
        
    }
    
    public boolean todosMojados (ArrayList<Jugador> jugadores) {
        
        for (Jugador aux : jugadores) {
            
            if (!aux.isMojado()) {
                
                return false;
                
            }
            
        }
        
        return true;
    }
    
    public void nextRound(Jugador jugador, Revolver r,RevolverServicios rs1) {
        
        System.out.println(rs1.mostrarPosicion(r));
        
        System.out.println("Es turno de " + jugador.getNombre());
        
        if (js1.disparo(r, jugador)) {
            
            System.out.println("Te mojaste");
            
            System.out.println("Recargando");
            
            rs1.llenarRevolver(r);
            
        } else {
            
            System.out.println("Uff, te salvaste");
            
        }
    }
    
    public void game() {
        
        Juego partida = new Juego();
        
        ArrayList<Jugador> listaJugadors = new ArrayList();
        
        Revolver revolver = new Revolver();
        
        partida.setJugadores(listaJugadors);
        
        partida.setRevolver(revolver);
        
        int numeroplayer = 1;
        
        String opc = "Y";
        
        llenarJuego(listaJugadors, revolver);
        
        Jugador jugadorActual;
        
        int cantidadJugadores = listaJugadors.size();
        
        do {            
            
            jugadorActual = listaJugadors.get(numeroplayer);
            
            numeroplayer++;
            
            if (numeroplayer >= cantidadJugadores) {
                
                numeroplayer = 0;
                
            }
            
            if (jugadorActual.isMojado()) {
                
                continue;
                
            }
            
            nextRound(jugadorActual, revolver, rs1);
            
            System.out.println("\n" + "Sigue jugando");
            
            opc = teclado.next().substring(0,1).toUpperCase();
            
        } while (!todosMojados(listaJugadors) && !opc.equals("N"));
        
        System.out.println("Resultados");
        
        resultados(listaJugadors);
        
    }
    
}