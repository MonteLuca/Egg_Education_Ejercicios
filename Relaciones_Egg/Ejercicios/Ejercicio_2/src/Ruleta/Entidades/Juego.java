package Ruleta.Entidades;

import java.util.ArrayList;

/**
 * @author Luca Monte
 */
public class Juego {
    
    //Atributos
    
    private ArrayList <Jugador> jugadores;
    
    private Revolver revolver;
    
    //Constructor sin parametros

    public Juego() {
        
    }
    
    //Constructor con parametros

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    //Getters and Setters

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
}