package Pelicula.Servicios;

import Pelicula.Entidades.Pelicula;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

import Pelicula.Utilidades.Comparadores;

/**
 * @author Luca Monte
 */
public class PeliServicios {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> peliculasGuardadas = new ArrayList();

    public Pelicula cargarPelicula() {

        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");

        p1.setTitulo(teclado.next());

        System.out.println("Ingrese el director de la pelicula");

        p1.setDirector(teclado.next());

        System.out.println("Ingrese la duracion de la pelicula (Horas)");

        p1.setHoras(teclado.nextDouble());

        return p1;

    }

    public void guardarPelicula(Pelicula p1) {

        String opc = "";

        do {

            peliculasGuardadas.add(cargarPelicula());

            System.out.println("Desea guardar alguna otra pelicula? (si/no)");

            opc = teclado.next();

        } while (!opc.toUpperCase().equals("NO"));

    }

    public void mostrarPelis() {

        System.out.println("Todas las peliculas son las siguientes: ");

        int cont = 1;

        for (Pelicula aux : peliculasGuardadas) {

            System.out.println("Pelicula N°" + cont);

            cont++;

            System.out.println(aux.getTitulo());

        }

    }

    public void pelis1Hora() {

        System.out.println("Todas las pelis mayor a 1 hora son las siguientes: ");

        int cont = 1;

        for (Pelicula aux : peliculasGuardadas) {

            if (aux.getHoras() >= 1.0) {

                System.out.println("Pelicula N°" + cont);

                cont++;

                System.out.println(aux.getTitulo());

            }

        }

    }

    public void duracionMinMay() {

        int cont = 1;

        System.out.println("Las peliculas ordenadas por duracion de menor a mayor");

        Collections.sort(peliculasGuardadas, Comparadores.ordenarDuracionMinMay);

        for (Pelicula aux : peliculasGuardadas) {

            System.out.println("Pelicula N°" + cont);

            cont++;

            System.out.println(aux.getTitulo() + " dura " + aux.getHoras());

        }
    }
    
    public void duracionMayMin() {
        
        int cont = 1;
        
        System.out.println("Las peliculas ordenadas por duracion de mayor a menor");
        
        Collections.sort(peliculasGuardadas, Comparadores.ordenarDuracionMayMin);
        
        for (Pelicula aux : peliculasGuardadas) {
            
            System.out.println("Pelicula N°" + cont);

            cont++;

            System.out.println(aux.getTitulo() + " dura " + aux.getHoras());
            
        }
    }
    
    public void ordenDirectores() {
        
        int cont = 1;
        
        System.out.println("Las peliculas ordenadas por director alfabeticamente");
        
        Collections.sort(peliculasGuardadas, Comparadores.ordenarDirectorMinMay);
        
        for (Pelicula aux : peliculasGuardadas) {
            
            System.out.println("Pelicula N°" + cont);

            cont++;

            System.out.println(aux.getTitulo() + " fue dirigida por " + aux.getDirector());
            
        }
        
    }
    
    public void ordenTitulos() {
        
        int cont = 1;
        
        System.out.println("Las peliculas ordenadas por titulo en orden alfabeticamente");
        
        Collections.sort(peliculasGuardadas, Comparadores.ordenarTituloMinMay);
        
        for (Pelicula aux : peliculasGuardadas) {
            
            System.out.println("Pelicula N°" + cont);

            cont++;

            System.out.println(aux.getTitulo());
            
        }
    }
}