package Libreria.Servicios;

import Libreria.Entidades.Editorial;
import Libreria.Persistencia.EditorialDAO;
import java.util.List;
import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class EditorialServicios {

    private final Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    private final EditorialDAO DAO = new EditorialDAO();

    //Crear y guardar un Editorial --
    public Editorial crearEditorial(String nombre) throws Exception {

        Editorial editorial = new Editorial();

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new Exception("Nombre invalido");

        }

        editorial.setNombre(nombre);

        editorial.setAlta(preguntarAlta());

        return editorial;

    }

    public String guardarEditorial() throws Exception {

        DAO.guardar(crearEditorial(teclado.next()));

        return "Editorial guardada";

    }

    public Boolean preguntarAlta() {

        System.out.println("La editorial esta en funcionamiento? (S/N)");

        String opc = teclado.next().substring(0, 1);

        return opc.equalsIgnoreCase("S") ? Boolean.TRUE : Boolean.FALSE;

    }

    //Dar de baja Editorial --
    public String darDeBajaEditorial(Integer id) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }

            DAO.darDeBajaEditorial(id);

            return "La editorial ha sido dada de baja";

        } catch (Exception e) {

            throw new Exception("No se pudo dar de baja la editorial");

        }

    }

    //Dar de alta Editorial --
    public String darDeAltaEditorial(Integer id) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }

            DAO.darDeAltaEditorial(id);

            return "La editorial ha sido dada de alta";

        } catch (Exception e) {

            throw new Exception("No se pudo dar de alta la editorial");

        }
    }

    //Modificar editorial por ID --
    public String modificarEditorialPorID(Integer id, String nombre) throws Exception {

        try {

            if (id == null) {

                throw new Exception("ID invalido");

            }

            if (nombre == null || nombre.trim().isEmpty()) {

                throw new Exception("Nombre invalido");

            }

            Editorial editorial = DAO.obtenerEditorialPorID(id);

            if (editorial == null) {

                throw new Exception("ERROR");

            }

            editorial.setNombre(nombre);
            
            editorial.setAlta(preguntarAlta());
            
            DAO.editar(editorial);

            return "La editorial ha sido modificada con exito";

        } catch (Exception e) {

            throw new Exception("La editorial no pudo ser modificada");

        }

    }

    //Mostrar todas las Editoriales --
    public List<Editorial> mostrarTodasLasEditoriales() {

        return DAO.mostrarTodasLasEditoriales();

    }

    //Mostrar editorial por nombre --
    public Editorial mostrarEditorialPorNombre(String nombre) throws Exception {

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new Exception("Nombre invalido");

        }

        return DAO.obtenerEditorialPorNombre(nombre);

    }

    //Mostrar editorial por ID
    public Editorial mostrarEditorialPorID(Integer id) throws Exception {

        if (id == null) {

            throw new Exception("ID invalido");

        }
        
        return DAO.obtenerEditorialPorID(id);

    }
    
}