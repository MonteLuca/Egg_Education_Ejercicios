package com.egg.noticia.servicios;

import com.egg.noticia.entidades.Noticia;
import com.egg.noticia.exepciones.MiException;
import com.egg.noticia.repositorios.noticiaRepositorio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Luca Monte
 */
@Service
public class noticiaServicios {
    
    @Autowired
    private noticiaRepositorio noticiaRepositorio;
    
    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException {
        
        validar(titulo, cuerpo);
        
        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        
        noticia.setCuerpo(cuerpo);
        
        noticiaRepositorio.save(noticia);
        
    }
    
    public void validar(String titulo, String cuerpo) throws MiException {
        
        if (titulo.isEmpty() || titulo == null) {
            
            throw new MiException("El titulo no puede estar vacio o ser nulo");
            
        }
        
        if(cuerpo.isEmpty() || cuerpo == null) {
            
            throw new MiException("El cuerpo no puede estar vacio o ser nulo");
            
        }
        
    }
    
    
}