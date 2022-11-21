package com.egg.noticia.controlador;

import com.egg.noticia.servicios.noticiaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Luca Monte
 */
@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private noticiaServicios noticiaservicios;
    
    @GetMapping("/")
    public String index(ModelMap modelo) {
        
        modelo.put("noticias", noticiaservicios.listarNoticias());
        
        return "index.html";
        
    }
    
}