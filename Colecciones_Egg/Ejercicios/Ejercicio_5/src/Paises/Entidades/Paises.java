package Paises.Entidades;

import java.util.Objects;
/**
 * @author Luca Monte
 */
public class Paises implements Comparable <Paises> {
    
    //Atributos
    
    private String nombrePais;
    
    //Constructores

    public Paises() {
    }

    public Paises(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    //Getters and Setters

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    //Equals y Hashcode

    @Override
    public int hashCode() {
        
        int hash = 3;
        
        hash = 71 * hash + Objects.hashCode(this.nombrePais);
        
        return hash;
 
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

    //Comparador
    
    @Override
    public int compareTo(Paises p1) {
        
        return this.getNombrePais().compareTo(p1.getNombrePais());
        
    }   
    
    //ToString

    @Override
    public String toString() {
  
        return "Pais " + nombrePais;
        
    }   
}