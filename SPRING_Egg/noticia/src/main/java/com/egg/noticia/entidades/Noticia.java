package com.egg.noticia.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author Luca Monte
 */
@Entity
public class Noticia {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
    private String cuerpo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    
    //Constructor vacio

    public Noticia() {
        
    }
    
    //Constructor con parametros

    public Noticia(Long id, String titulo, String cuerpo, Date alta) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.alta = alta;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }
    
    
    
}