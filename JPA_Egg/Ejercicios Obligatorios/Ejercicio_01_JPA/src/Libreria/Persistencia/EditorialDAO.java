package Libreria.Persistencia;

import Libreria.Entidades.Editorial;
import java.util.List;
/**
 * @author Luca Monte
 */
public class EditorialDAO extends DAO<Editorial>{
    
    //En Editorial DAO realizamos las querys
    
    //Mostrar todas las editoriales
    public List<Editorial> mostrarTodasLasEditoriales(){
        
        conectar();
        
        List<Editorial> listarEditoriales = em.createQuery("SELECT a FROM Editorial a WHERE a.alta = true").getResultList();
        
        desconectar();
        
        return listarEditoriales;
        
    }
    
    //Obtener Editorial por nombre
    public Editorial obtenerEditorialPorNombre(String nombre) throws Exception {
        
        conectar();
        
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        
        desconectar();
        
        return editorial;
                
    }
    
    //Obtener Editorial por ID
    public Editorial obtenerEditorialPorID(Integer id) throws Exception {
        
        conectar();
        
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        
        desconectar();
        
        return editorial;
        
    }
    
    //Alta baja de Editorial
    public String darDeBajaEditorial(Integer id) throws Exception {
        
        if (id == null) {
            
            throw new Exception("ID ingresado invalido");
            
        }
        
        Editorial editorialDeBaja = obtenerEditorialPorID(id);
        
        if (editorialDeBaja == null || editorialDeBaja.getAlta() == false) {
            
            throw new Exception("El autor ya fue dado de baja");
            
        }
        
        editorialDeBaja.setAlta(Boolean.FALSE);
        
        super.editar(editorialDeBaja);
        
        return "El autor fue dado de baja con exito";
        
    }
    
    public String darDeAltaEditorial(Integer id) throws Exception {
        
        if (id == null) {
            
            throw new Exception("ID invalido");
            
        }
        
        Editorial editorialDeAlta = obtenerEditorialPorID(id);
        
        if (editorialDeAlta == null || editorialDeAlta.getAlta() == true) {
            
            throw new Exception("El autor ya fue dado de alta");
            
        }
        
        editorialDeAlta.setAlta(Boolean.TRUE);
        
        super.editar(editorialDeAlta);
        
        return "El autor fue dado de alta con exito";
        
    }
    
    @Override
    public void guardar(Editorial editorial) {
        
        super.guardar(editorial);
        
    }
    
    @Override
    public void editar(Editorial editorial) {
        
        super.editar(editorial);
        
    }
    
}