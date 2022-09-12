package Libreria.Servicios;

import Libreria.Entidades.Autor;

import Libreria.Persistencia.AutorDAO;

import java.util.List;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class AutorServicios {

    private final Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    private final AutorDAO DAO = new AutorDAO();

    //Crear y Guardar un autor
    public Autor crearAutor(String nombre) throws Exception {

        Autor autor = new Autor();

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new Exception("Nombre invalido");

        }

        autor.setNombre(nombre);

        autor.setAlta(pedirAltaAutor());

        return autor;

    }

    public String guardarAutor() throws Exception {

        DAO.guardar(crearAutor(teclado.next()));

        return "Autor creado con exito";

    }

    //Preguntar alta autor
    public Boolean pedirAltaAutor() {

        System.out.println("El autor esta disponible (S/N)");

        String opc = teclado.next().substring(0, 1);
        //Operador ternario (basicamente un if en una linea (? = if) y (: = else))
        return opc.equalsIgnoreCase("S") ? Boolean.TRUE : Boolean.FALSE;

    }

    //Dar de baja autor
    public String darDeBajaAutor(Integer id) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }

            DAO.darDeBajaAutor(id);

            return "El autor ha sido dado de baja";

        } catch (Exception e) {

            throw new Exception("No se pudo dar de baja el autor");

        }

    }

    //Dar de alta autor
    public String darDeAltaAutor(Integer id) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }

            DAO.darDeAltaAutor(id);

            return "El autor ha sido dado de alta";

        } catch (Exception e) {

            throw new Exception("No se pudo dar de alta el autor");

        }

    }

    //Modificar autor por ID
    public String modificarAutorPorID(Integer id, String nombre) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }
            
            if (nombre == null || nombre.trim().isEmpty()) {
                
                throw new Exception("Nombre invalido");
                
            }

            Autor autor = DAO.obtenerAutorPoriD(id);
            
            if (autor == null) {

                throw new Exception("ERROR");

            }

            autor.setNombre(nombre);
            
            autor.setAlta(pedirAltaAutor());
            
            DAO.editar(autor);

            return "El autor ha sido modificado con exito";

        } catch (Exception e) {

            throw new Exception("No se pudo modificar el autor por ID");

        }

    }

    //Mostrar todos los autores
    public List<Autor> mostrarTodosLosAutores() {

        return DAO.mostrarTodosLosAutores();

    }

    //Mostrar autor por nombre
    public Autor mostrarAutorPorNombre(String nombre)throws Exception {
        
        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                
                throw new Exception("Nombre invalido");
                
            }
            
            Autor autor = DAO.obtenerAutorPorNombre(nombre);
           
            return autor;
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo mostrar el autor por nombre");
            
        }
        
    }
    
    //Mostrar autor por ID
    public Autor mostrarAutorPorID(Integer id) throws Exception {
        
        try {
            
            if (id == null) {
                
                throw new Exception("ID invalido");
                
            }
            
            return DAO.obtenerAutorPoriD(id);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo mostrar el autor por ID");
            
        }
        
    }  
}