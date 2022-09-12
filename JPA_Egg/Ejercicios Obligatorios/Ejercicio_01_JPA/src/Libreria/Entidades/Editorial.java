package Libreria.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Luca Monte
 */
@Entity
@Table(name = "EDITORIAL")
public class Editorial implements Serializable {
    
    //Atributos
    
    @Id
    @Column(name = "ID_EDITORIAL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "ALTA")
    private Boolean alta;
    
    //Contructor sin parametros

    public Editorial() {
    }
    
    //Constructor con parametros

    public Editorial(Integer id, String nombre, Boolean alta) {
        
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
        
    }
    
    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "ID = " + this.id + " | NOMBRE = " + this.nombre + " | ALTA = " + this.alta;
    }
  
}