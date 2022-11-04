package com.egg.noticia.repositorios;

import com.egg.noticia.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Luca Monte
 */
@Repository
public interface noticiaRepositorio extends JpaRepository<Noticia, Long> {
    
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    
}