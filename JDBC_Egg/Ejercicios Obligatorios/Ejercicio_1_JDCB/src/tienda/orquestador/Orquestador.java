package tienda.orquestador;

import java.util.Scanner;

import tienda.servicios.ServiciosFabricante;

import tienda.servicios.ServiciosProducto;
/**
 * @author Luca Monte
 */
public class Orquestador {
    
    private static final Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuPrincipal() throws Exception {
        
        int opc = 0;
        
        do {         
            
            System.out.println("MENU PRINCIPAL");
            
            System.out.println("SELECCIONE UNA OPCION");
            
            System.out.println("\n1 - Menu Producto" +
                               "\n2 - Menu Fabricante" +
                               "\n3 - Salir");
            
            opc = teclado.nextInt();
            
            switch(opc) {
                
                case 1:
                    
                    menuProducto();
                    break;
                    
                case 2:
                    
                    menuFabricante();
                    break;
                    
                case 3:
                    
                    System.out.println("Adios");
                    break;
            }
            
        } while (opc != 3);
    }
    
    public static void menuProducto() throws Exception {
        
        int opc = 0;
        
        do {

            ServiciosProducto servi = new ServiciosProducto();
            
            System.out.println("INGRESE UNA OPCION");
       
            System.out.println("\n1 - Listar los nombres de todos los productos" +
                               "\n2 - Listar los nombres y los precios de todos los productos" +
                               "\n3 - Listar los precios de productos entre 120 y 202" +
                               "\n4 - Listar todos los portatiles" +
                               "\n5 - Listar el nombre y el precio del producto mas barato" +
                               "\n6 - Ingrese un producto a la base de datos" + 
                               "\n7 - Modificar un producto de la base de datos" +
                               "\n8 - Eliminar un producto de la base de datos " +
                               "\n9 - Volver al menu principal");
            
            opc = teclado.nextInt();
            
            switch(opc) {
                
                case 1:
                    
                    servi.listarNombreProducto();
                    break;
                    
                case 2:
                    
                    servi.listarNombreYPreciosProducto();
                    break;
                    
                case 3:
                    
                    servi.listarPrecioEntre120_202Producto();
                    break;
                
                case 4:
                    
                    servi.listarPortatilesProductos();
                    break;
                    
                case 5:
                    
                    servi.listarProductoMasBarato();
                    break;
                    
                case 6:
                    
                    servi.insertarProducto();
                    break;
                    
                case 7:
                    
                    servi.modificarProducto();
                    break;
                    
                case 8:
                    
                    servi.eliminarProducto();
                    break;
                    
                case 9:
                    
                    break;
                        
            }
            
        } while (opc != 9);
        
    }
    
    public static void menuFabricante() throws Exception {
        
        ServiciosFabricante servi = new ServiciosFabricante();
        
        int opc = 0;
        
        do {            
            
            System.out.println("MENU FABRICANTES");
            
            System.out.println("INGRESE UNA OPCION");
            
            System.out.println("\n1 - Ingresar un nuevo fabricante" +
                               "\n2 - Mostrar a los fabricantes" + 
                               "\n3 - Volver al menu principal");
            
            opc = teclado.nextInt();
            
            switch (opc) {
                
                case 1:
                    
                    servi.insertarFabricante();
                    break;
                    
                case 2:
                    
                    servi.listarFabricante();
                    break;
                    
                case 3:
                    
                    break;
            }
            
        } while (opc != 3);
    }
}