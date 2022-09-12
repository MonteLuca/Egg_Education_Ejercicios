package Libreria.Servicios;

import Libreria.Entidades.Autor;
import Libreria.Entidades.Editorial;
import Libreria.Entidades.Libro;
import Libreria.Persistencia.AutorDAO;

import Libreria.Persistencia.EditorialDAO;

import Libreria.Persistencia.LibroDAO;
import java.util.List;

import java.util.Scanner;

/**
 * @author Luca Monte
 */
public class LibroServicios {

    private final Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    private final LibroDAO DAO = new LibroDAO();

    private final AutorDAO autorDAO = new AutorDAO();

    private final EditorialDAO editorialDAO = new EditorialDAO();

    private final AutorServicios as = new AutorServicios();

    //Creamos el Libro
    public void crearLibro() throws Exception {

        try {

            System.out.println("Ingrese el ISBN");

            Integer isbn = teclado.nextInt();

            System.out.println("Ingrese el titulo");

            String titulo = teclado.next();

            System.out.println("Ingrese el año de lanzamiento");

            Integer anio = teclado.nextInt();

            System.out.println("Ingrese la cantidad de ejemplares");

            Integer ejemplares = teclado.nextInt();

            System.out.println(guardarLibro(isbn, titulo, anio, ejemplares));

        } catch (Exception e) {

            throw e;

        }

    }

    public String guardarLibro(Integer isbn, String titulo, Integer anio, Integer ejemplares) throws Exception {

        Libro nuevoLibro = new Libro();

        try {

            nuevoLibro.setISBN(isbn);

            nuevoLibro.setTitulo(titulo);

            nuevoLibro.setAnio(anio);

            nuevoLibro.setEjemplares(ejemplares);

            nuevoLibro.setEjemplaresRestantes(ejemplares);

            nuevoLibro.setEjemplaresPrestados(0);

            nuevoLibro.setAutor(pedirAutor());

            nuevoLibro.setEditorial(pedirEditorial());

            nuevoLibro.setAlta(Boolean.TRUE);

            DAO.guardar(nuevoLibro);

            return "El libro se guardo Correctamente";

        } catch (Exception e) {

            throw e;

        }
    }

    //Pedir autor
    public Autor pedirAutor() throws Exception {

        Autor autor;

        String nombre;

        do {

            System.out.println("Ingrese el nombre del autor");

            nombre = teclado.next();

            autor = autorDAO.obtenerAutorPorNombre(nombre);

            if (autor == null) {

                autor = as.crearAutor(nombre);

                autorDAO.guardar(autor);

            }

        } while (autor == null);

        return autor;

    }

    //Pedir editorial
    public Editorial pedirEditorial() throws Exception {

        Editorial editorial;

        String nombre;

        try {

            do {

                System.out.println("Ingrese el nombre de la editorial");

                nombre = teclado.next();

                editorial = editorialDAO.obtenerEditorialPorNombre(nombre);

                if (editorial == null) {

                    throw new Exception("Editorial no encontrada");

                }

            } while (editorial == null);

            return editorial;

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Mostrar todos los libros
    public void obtenerTodosLosLibros() throws Exception {

        List<Libro> listarLibros = DAO.obtenerTodosLosLibros();

        try {

            for (Libro listarLibro : listarLibros) {

                System.out.println(listarLibro);

            }

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Obtener libro por ISBN
    public void obtenerLibroPorISBN() throws Exception {

        try {

            System.out.println("Ingrese el ISBN del libro que esta buscando");

            Integer isbn = teclado.nextInt();

            Libro libro = DAO.obtenerLibroPorISBN(isbn);

            if (libro == null) {

                throw new Exception("El libro no existe");

            }

            System.out.println(libro);

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Obtener libro por titulo
    public void obtenerLibroPorTitulo() throws Exception {

        try {

            System.out.println("Ingrese el nombre del libro");

            String titulo = teclado.next();

            if (titulo == null || titulo.trim().isEmpty()) {

                throw new Exception("ERROR");

            }

            Libro libro = (Libro) DAO.obtenerLibrosPorTitulo(titulo);

            if (libro == null) {

                throw new Exception("ERROR");

            }

            System.out.println(libro);

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Obtener libro por Autor
    public void obtenerLibroPorAutor() throws Exception {

        try {

            System.out.println("Ingrese el nombre del autor del libro");

            String nombre = teclado.next();

            if (nombre == null || nombre.trim().isEmpty()) {

                throw new Exception("El nombre es invalido");

            }

            List<Libro> libroPorAutor = DAO.obtenerLibrosPorAutor(nombre);

            for (Libro libro : libroPorAutor) {

                System.out.println(libro);

            }

        } catch (Exception e) {

            throw new Exception("ERROR");

        }
    }

    //Obtener libro por Editorial
    public void obtenerLibroPorEditorial() throws Exception {

        try {

            System.out.println("Ingrese el nombre de la editorial del libro");

            String nombre = teclado.next();

            if (nombre == null || nombre.trim().isEmpty()) {

                throw new Exception("El nombre es invalido");

            }

            List<Libro> libroPorEditorial = DAO.obtenerLibrosPorEditorial(nombre);

            for (Libro libro : libroPorEditorial) {

                System.out.println(libro);

            }

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Alta de libro
    public void darAltaLibro() throws Exception {

        try {

            System.out.println("Ingrese el libro que quiere dar de alta");

            String titulo = teclado.next();

            if (titulo == null || titulo.trim().isEmpty()) {

                throw new Exception("El nombre es invalido");

            }

            DAO.darAltaLibro(titulo);

        } catch (Exception e) {

            throw new Exception("ERROR");

        }

    }

    //Baja de libro
    public void darBajaLibro() throws Exception {

        try {

            System.out.println("Ingrese el libro que quiere dar de baja");

            String titulo = teclado.next();

            if (titulo == null || titulo.trim().isEmpty()) {

                throw new Exception("El nombre es invalido");

            }

            DAO.darBajaLibro(titulo);

        } catch (Exception e) {

            throw new Exception("ERROR");

        }
    }
}
