package Libreria.Persistencia;

import Libreria.Entidades.Libro;
import java.util.List;

/**
 * @author Luca Monte
 */
public class LibroDAO extends DAO<Libro>{
    
    //En DAO ponemos las querys
    
    //Mostrar todos los libros
    public List<Libro> obtenerTodosLosLibros(){
        
        conectar();
        
        List<Libro> listarLibros = em.createQuery("SELECT a FROM Libro a WHERE a.alta = true").getResultList();
        
        desconectar();
        
        return listarLibros;
        
    }
    
    //Obtener libro por Titulo
    public List<Libro> obtenerLibrosPorTitulo(String titulo) {
        
        conectar();
        
        List<Libro> listarLibros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getResultList();
        
        desconectar();
        
        return listarLibros;
        
    }
    
    //Obtener libro por ISBN
    public Libro obtenerLibroPorISBN(Integer ISBN) {
        
        conectar();
        
        Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.ISBN LIKE :ISBN")
                .setParameter("ISBN", ISBN).getSingleResult();
        
        
        desconectar();
        
        return libro;
        
    }
    
    //Obtener libro Por Editorial
    public List<Libro> obtenerLibrosPorEditorial(String nombre) {
        
        conectar();
        
        List<Libro> librosPorEditorial = em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        desconectar();
        
        return librosPorEditorial;
        
    }
    
    //Obtener libro por Autor
    public List<Libro> obtenerLibrosPorAutor(String nombre) {
        
        conectar();
        
        List<Libro> listarLibrosPorAutor = em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        desconectar();
        
        return listarLibrosPorAutor;
        
    }
    
    //Borrar libro por ISBN
    public void eliminarLibro(Integer isbn) throws Exception {
        
        Libro libroPorBorrar = obtenerLibroPorISBN(isbn);
        
        eliminar(libroPorBorrar);
        
    }
    
    //Alta y Baja
    public void darAltaLibro(String nombre) throws Exception {
        
        try {
            
            Libro libro = (Libro) obtenerLibrosPorTitulo(nombre);
            
            if (libro == null) {
                
                throw new Exception("El libro no se encontro");
                
            }
            
            if (libro.getAlta() == true) {
                
                throw new Exception("El libro ya esta dado de alta");
                
            } else {
                
                System.out.println("Libro dado de alta");
                
            }
            
            libro.setAlta(Boolean.TRUE);
            super.editar(libro);
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
        }
        
    }
    
    public void darBajaLibro(String nombre) throws Exception {
        
        try {
            
            Libro libro = (Libro) obtenerLibrosPorTitulo(nombre);
            
            if (libro == null) {
                
                throw new Exception("El libro no se encontro");
                
            }
            
            if (libro.getAlta() == false) {
                
                throw new Exception("El libro ya esta dado de baja");
                
            } else {
                
                System.out.println("Libro dado de baja");
                
            }
            
            libro.setAlta(Boolean.FALSE);
            super.editar(libro);
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
        }
        
    }
    
    @Override
    public void guardar(Libro libro) {
        
        super.guardar(libro);
        
    }
    
    @Override
    public void editar(Libro libro) {
        
        super.editar(libro);
        
    }
}