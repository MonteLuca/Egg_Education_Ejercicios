package com.egg.noticia.repositorios;

import com.egg.noticia.entidades.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Luca Monte
 */
@Repository
public interface noticiaRepositorio extends JpaRepository<Noticia, Long> {
    
    @Query("SELECT n FROM Noticia N WHERE n.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    
    @Query("SELECT * FROM Noticia")
    public List<Noticia> listarNoticias();
    
}