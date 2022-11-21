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
import org.springframework.web.multipart.MultipartFile;
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
    public String registro(@RequestParam String titulo,@RequestParam String cuerpo,@RequestParam("file") MultipartFile imagen, ModelMap modelo) {
        
        try {
            
            noticiaServicio.crearNoticia(titulo, cuerpo,imagen);
            
            modelo.put("exito", "La noticia fue cargada correctamente");
        
            return "noticia_form.html";
            
        } catch (Exception ex) {
            
            modelo.put("error", ex.getMessage());
        
            return "noticia_form.html";
            
        }  
    }   
}