package Libreria.Persistencia;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
/**
 * @author Luca Monte
 */
public class DAO <T> {
    
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Ejercicio_01_PU");
    
    protected EntityManager em = EMF.createEntityManager();
    
    //Metodos
    
    protected void conectar() {
        
        if (!em.isOpen()) {           
            em = EMF.createEntityManager();         
        }
        
    }
    
    protected void desconectar() {
        
        if (em.isOpen()) {           
            em.close();
        }
        
    }
    
     protected void guardar(T objeto) {
         
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
        
    }

    protected void editar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void eliminar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
}