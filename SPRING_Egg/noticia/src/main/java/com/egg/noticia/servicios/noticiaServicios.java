package com.egg.noticia.servicios;

import com.egg.noticia.entidades.Noticia;
import com.egg.noticia.exepciones.MiException;
import com.egg.noticia.repositorios.noticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author Luca Monte
 */
@Service
public class noticiaServicios {
    
    @Autowired
    private noticiaRepositorio noticiaRepositorio;
    
    @Transactional //Es establecer que si el metodo se ejecuta sin hacer excepciones guarda una noticia en la base de datos, de caso contrario no.
    public void crearNoticia(String titulo, String cuerpo) throws MiException {
        
        validar(titulo, cuerpo);
        
        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        
        noticia.setCuerpo(cuerpo);
        
        noticia.setAlta(new Date());
        
        noticiaRepositorio.save(noticia);
        
    }
    
    public List<Noticia> listarNoticias() {
        
        List<Noticia> noticias = new ArrayList();
        
        noticias = noticiaRepositorio.findAll();
        
        return noticias;
        
    }
    
    /*
    public void modificarNoticia(Long id,String titulo, String cuerpo) {
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        //Es un objeto contenedor que puede o no contener un valor no nulo, si es el valor esta presente devuelve true, en caso contrario false
        
        if (respuesta.isPresent()) {
            
            Noticia noticia = respuesta.get();
            
            noticia.setTitulo(titulo);
            
            noticia.setCuerpo(cuerpo);
            
            noticia.setAlta(new Date());
            
            noticiaRepositorio.save(noticia);
            
        }
        
    }
    */
    
    public void validar(String titulo, String cuerpo) throws MiException {
        
        if (titulo.isEmpty() || titulo == null) {
            
            throw new MiException("El titulo no puede estar vacio o ser nulo");
            
        }
        
        if(cuerpo.isEmpty() || cuerpo == null) {
            
            throw new MiException("El cuerpo no puede estar vacio o ser nulo");
            
        }     
    } 
    
}