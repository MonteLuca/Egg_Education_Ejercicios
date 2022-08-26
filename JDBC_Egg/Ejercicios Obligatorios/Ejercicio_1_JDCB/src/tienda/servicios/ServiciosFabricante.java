package tienda.servicios;

import java.util.ArrayList;

import java.util.Scanner;

import tienda.entidades.Fabricante;

import tienda.persistencia.FabricanteDAO;
/**
 * @author Luca Monte
 */
public class ServiciosFabricante {
    
    private final Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    private FabricanteDAO dao;

    public ServiciosFabricante() {
        
        this.dao = new FabricanteDAO();
        
    }
    
    //Ingresar un fabricante a la base de datos
    public void insertarFabricante() throws Exception {
        
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = teclado.next();
        
        insertarFabricante(nombre);
        
    }
    
    public void insertarFabricante(String nombre) throws Exception {
        
        if (nombre == null || nombre.trim().isEmpty()) {
            
            throw new Exception("El nombre es invalido o esta vacio");
            
        }
        
        Fabricante fabriNuevo = new Fabricante();
        
        fabriNuevo.setNombre(nombre);
        
        dao.insertarFabricante(fabriNuevo);
        
    }
    //Listar fabricantes
    public void listarFabricante() throws Exception {
        
        ArrayList<Fabricante> listarFabricantes = dao.listarFabricantes();
        
        for (Fabricante listarFabricante : listarFabricantes) {
            
            System.out.println("CODIGO = " + listarFabricante.getCodigo() + " | NOMBRE = " + listarFabricante.getNombre());
            
        }        
    }
    
}