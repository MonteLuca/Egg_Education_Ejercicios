package com.egg.noticia.controlador;

import com.egg.noticia.exepciones.MiException;
import com.egg.noticia.servicios.noticiaServicios;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
/**
 * @author Luca Monte
 */
@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {
    
    @Autowired
    private noticiaServicios noticiaServicio;
    
    @GetMapping("/registrar")
    public String registrar() {
        
        return "noticia_form.html";
        
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo,@RequestParam String cuerpo, ModelMap modelo) {
        
        try {
            
            noticiaServicio.crearNoticia(titulo, cuerpo);
            
            modelo.put("exito", "La noticia fue cargada correctamente");
        
            return "noticia_form.html";
            
        } catch (MiException ex) {
            
            modelo.put("error", ex.getMessage());
        
            return "noticia_form.html";
            
        }  
    }   
}