package Libreria.Persistencia;

import Libreria.Entidades.Autor;

import java.util.List;

/**
 * @author Luca Monte
 */
public class AutorDAO extends DAO<Autor> {

    //En autorDAO estan las querys
    //Mostrar todos los autores   
    public List<Autor> mostrarTodosLosAutores() {

        conectar();

        List<Autor> listaAutores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = true").getResultList();

        desconectar();

        return listaAutores;

    }

    //Obtener autor por nombre
    public Autor obtenerAutorPorNombre(String nombre) throws Exception {

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new Exception("Nombre invalido");

        }

        conectar();

        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();

        desconectar();

        return autor;

    }

    //Obtener autor por ID
    public Autor obtenerAutorPoriD(Integer id) throws Exception {

        if (id == null) {

            throw new Exception("ID ingresado invalido");

        }

        conectar();

        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();

        desconectar();

        return autor;

    }

    //Alta baja de autor
    public String darDeBajaAutor(Integer id) throws Exception {

        if (id == null) {

            throw new Exception("ID ingresado invalido");

        }

        Autor autorDeBaja = obtenerAutorPoriD(id);

        if (autorDeBaja == null || autorDeBaja.getAlta() == false) {

            throw new Exception("El autor ya fue dado de baja");

        }

        autorDeBaja.setAlta(Boolean.FALSE);

        super.editar(autorDeBaja);

        return "El autor fue dado de baja con exito";

    }

    public String darDeAltaAutor(Integer id) throws Exception {

        if (id == null) {

            throw new Exception("ID ingresado invalido");

        }

        Autor autorDeAlta = obtenerAutorPoriD(id);

        if (autorDeAlta == null || autorDeAlta.getAlta() == true) {

            throw new Exception("El autor ya fue dado de alta");

        }

        autorDeAlta.setAlta(Boolean.TRUE);

        super.editar(autorDeAlta);

        return "El autor fue dado de alta";

    }

    @Override
    public void guardar(Autor autor) {

        super.guardar(autor);

    }

    @Override
    public void editar(Autor autor) {

        super.editar(autor);

    }

    @Override
    public void eliminar(Autor autor) {

        super.eliminar(autor);

    }

}
