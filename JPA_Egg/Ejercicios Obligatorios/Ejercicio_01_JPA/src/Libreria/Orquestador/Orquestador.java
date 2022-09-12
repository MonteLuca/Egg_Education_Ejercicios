package Libreria.Orquestador;

import Libreria.Servicios.AutorServicios;
import Libreria.Servicios.EditorialServicios;
import Libreria.Servicios.LibroServicios;
import java.util.Scanner;

/**
 * @author Luca Monte
 */
public class Orquestador {

    private final static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    private final static AutorServicios as = new AutorServicios();

    private final static LibroServicios ls = new LibroServicios();

    private final static EditorialServicios es = new EditorialServicios();

    public static void menuPrin() {
        System.out.println("MENU"
                + "\n1. MENU DE AUTOR"
                + "\n2. MENU DE EDITORIAL"
                + "\n3. MENU DE LIBRO"
                + "\n4. SALIR");
    }

    public static void menuLib() {
        System.out.println("MENU"
                + "\n1. CREAR LIBRO"
            //    + "\n2. MOSTRAR LIBROS"
            //    + "\n3. BUSCAR LIBRO POR AUTOR"
            //    + "\n4  BUSCAR LIBRO POR EDITORIAL"
            //    + "\n5. BUSCAR LIBRO POR ISBN"
            //    + "\n6. BUSCAR LIBRO POR TITULO"
            //    + "\n7. DAR DE BAJA UN LIBRO"
            //    + "\n8. DAR DE ALTA UN LIBRO"
                + "\n9.  MENU PRINCIPAL");
    }

    public static void menuAut() {
        System.out.println("MENU"
                + "\n1. CREAR AUTOR"
                + "\n2. MOSTRAR AUTORES"
                + "\n3. DAR DE BAJA UN AUTOR"
                + "\n4. DAR DE ALTA UN AUTOR"
                + "\n5. MODIFICAR AUTOR POR ID"
                + "\n6. MOSTRAR AUTOR POR ID"
                + "\n7. MOSTRAR AUTOR POR NOMBRE"
                + "\n8. MENU PRINCIPAL");
    }

    public static void menuEdi() {
        System.out.println("MENU"
                + "\n1. CREAR EDITORIAL"
                + "\n2. MOSTRAR EDITORIALES"
                + "\n3. DAR DE BAJA UNA EDITORIAL"
                + "\n4. DAR DE ALTA UNA EDITORIAL"
                + "\n5. MODIFICAR EDITORIAL POR ID"
                + "\n6. MOSTRAR EDITORIAL POR NOMBRE"
                + "\n7. MOSTRAR EDITORIAL POR ID"
                + "\n8. VOLVER AL MENU PRINCIPAL");
    }

    public static void menuPrincipal() throws Exception {

        int opc;

        menuPrin();

        do {

            opc = teclado.nextInt();

            switch (opc) {

                case 1:

                    menuAutor();
                    break;

                case 2:

                    menuEditorial();
                    break;

                case 3:

                    menuLibro();
                    break;

                case 4:

                    System.out.println("SALIO DE LA LIBRERIA VIRTUAL");
                    break;

            }

        } while (opc != 4);

    }

    public static void menuAutor() throws Exception {

        int opc;

        Integer id;

        do {

            menuAut();

            opc = teclado.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("Ingrese el nombre del autor");
                    System.out.println(as.guardarAutor());
                    break;

                case 2:

                    as.mostrarTodosLosAutores().stream().forEach(System.out::println);
                    break;

                case 3:

                    System.out.println("Ingrese el ID para dar de baja");

                    id = teclado.nextInt();

                    as.darDeBajaAutor(id);
                    break;

                case 4:

                    System.out.println("Ingrese el ID para dar de alta");

                    id = teclado.nextInt();

                    as.darDeAltaAutor(id);
                    break;

                case 5:

                    System.out.println("Ingrese el id");

                    id = teclado.nextInt();

                    System.out.println("Ingrese el nombre nuevo");

                    String nombre = teclado.next();

                    as.modificarAutorPorID(id, nombre);
                    break;

                case 6:

                    System.out.println("Ingrese la ID del autor que desea ver");

                    id = teclado.nextInt();

                    System.out.println(as.mostrarAutorPorID(id));

                    break;

                case 7:

                    System.out.println("Ingrese el nombre del autor que desea ver");

                    System.out.println(as.mostrarAutorPorNombre(teclado.next()));

                    break;

                case 8:

                    menuPrincipal();

                    break;

            }

        } while (opc != 9);

    }

    public static void menuEditorial() throws Exception {

        int opc;

        Integer id;

        do {

            menuEdi();

            opc = teclado.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("Ingrese el nombre de la editorial");

                    System.out.println(es.guardarEditorial());
                    
                    break;
                    
                case 2:
                    
                    es.mostrarTodasLasEditoriales().stream().forEach(System.out::println);
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese la ID de la editorial para dar de baja");
                    
                    System.out.println(es.darDeBajaEditorial(teclado.nextInt()));
                    
                case 4:
                    
                    System.out.println("Ingrese la ID de la editorial para dar de alta");
                    
                    System.out.println(es.darDeAltaEditorial(teclado.nextInt()));
                    
                case 5:
                    
                    System.out.println("Ingrese el ID de la editorial a modificar");
                    
                    id = teclado.nextInt();
                    
                    System.out.println("Ingrese el nuevo nombre para la editorial");
                    
                    String nombre = teclado.next();
                    
                    System.out.println(es.modificarEditorialPorID(id, nombre));
                    
                case 6:
                    
                    System.out.println("Ingrese el nombre de la editorial");
                    
                    System.out.println(es.mostrarEditorialPorNombre(teclado.next()));
                    
                case 7:
                    
                    System.out.println("Ingrese el ID de la editorial");
                    
                    System.out.println(es.mostrarEditorialPorID(teclado.nextInt()));
                    
                case 8:
                        
                    menuPrincipal();
                        
            }

        } while (opc != 8);

    }
    
    public static void menuLibro() throws Exception {
        
        int opc;
        
        Integer id;
        
        do {            
            
            menuLib();
            
            opc = teclado.nextInt();
            
            switch (opc) {
                
                case 1:
                    
                    ls.crearLibro();
                    break;
                
            }
            
        } while (opc != 9);
        
    }

}