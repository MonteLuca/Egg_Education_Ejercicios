package tienda.servicios;

import java.util.ArrayList;

import java.util.Scanner;

import tienda.entidades.Producto;

import tienda.persistencia.ProductoDAO;
/**
 * @author Luca Monte
 */
public class ServiciosProducto {

    private final Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    private ProductoDAO dao;

    public ServiciosProducto() {

        this.dao = new ProductoDAO();

    }

    //Lista el nombre de todos los productos que hay en la tabla producto.
    public void listarNombreProducto() throws Exception {

        try {

            ArrayList<Producto> listarNombreProducto = dao.listarNombreProducto();

            for (Producto producto : listarNombreProducto) {

                System.out.println(producto.getNombre());

            }

        } catch (Exception e) {

            throw new Exception("No se pudo listar los nombre de productos(ServiciosProducto)");

        }
    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public void listarNombreYPreciosProducto() throws Exception {

        try {

            ArrayList<Producto> listarNombreYPreciosProducto = dao.listarNombreYPreciosProducto();

            for (Producto producto : listarNombreYPreciosProducto) {

                System.out.println("NOMBRE = " + producto.getNombre() + " | PRECIO = " + producto.getPrecio());

            }

        } catch (Exception e) {

            throw new Exception("No se puede listar los nombres y precios de productos(Servicios Producto)");

        }
    }

    //Listar aquellos productos que su precio este entre 120 y 202.
    public void listarPrecioEntre120_202Producto() throws Exception {

        try {

            ArrayList<Producto> listarPrecioEntre120_202Producto = dao.listarPrecioEntre120_202Producto();

            for (Producto producto : listarPrecioEntre120_202Producto) {

                System.out.println("NOMBRE = " + producto.getNombre() + " | PRECIO = " + producto.getPrecio());

            }

        } catch (Exception e) {

            throw new Exception("No se puede listar los precios entre 120 y 202 (Servicios Productos)");

        }
    }

    //Buscar y listar todos los portatiles de la tabla producto.
    public void listarPortatilesProductos() throws Exception {

        try {

            ArrayList<Producto> listarPortatilesProductos = dao.listarPortatilesProductos();

            for (Producto producto : listarPortatilesProductos) {

                System.out.println("NOMBRE = " + producto.getNombre() + " | PRECIO = " + producto.getPrecio());

            }

        } catch (Exception e) {

            System.out.println(e.toString());
            
        }
    }
    
    //Lista el nombre y el precio del producto mas barato.
    public void listarProductoMasBarato() throws Exception{
        
        try {
            
            Producto producto = dao.listarProductoMasBarato();
            
            System.out.println("NOMBRE = " + producto.getNombre() + " | PRECIO = " + producto.getPrecio());
            
        } catch (Exception e) {
            
            throw new Exception("No se puede traer el nombre del precio mas barato");
            
        }      
    }
    
    //Ingresar un producto a la base de datos.
    public void insertarProducto() throws Exception {
        //Registra los datos que el usuario ingresa
        try {
            
            System.out.println("Ingrese el nombre del producto");
            String nombre = teclado.next();
            
            System.out.println("Ingrese el precio del producto");
            double precio = teclado.nextDouble();
            
            System.out.println("Ingrese el codigo de fabricante");
            int codigo_fabricante = teclado.nextInt();
            
            //Ahora envia los datos al metodo que va a crear el objeto
            insertarProducto(nombre, precio, codigo_fabricante);
                   
        } catch (Exception e) {
            
            throw new Exception("No se pudo insertar el producto(SERVICIOS PRODUCTO)");
            
        }  
    }
    
    public void insertarProducto(String nombre, double precio, int codigo_fabricante) throws Exception {
        
        //Validamos que el codigo del fabricante este en los valores de la base de datos
        if (codigo_fabricante >= 10 || codigo_fabricante <= 0) {
            
            throw new Exception("El codigo del fabricante es invalido");
            
        }
        //Se validan los datos
        validar(nombre,precio); 
        
        Producto producto = new Producto(); //Creamos el objeto y seteamos los datos;
        
        producto.setNombre(nombre);
        
        producto.setPrecio(precio);
        
        producto.setCodigo_fabricante(codigo_fabricante);
        
        dao.insertarProducto(producto); //Envia el pedido a la base de datos;
        
    }
    
    //Modifica un producto con datos a eleccion.
    public void modificarProducto() throws Exception {
        //Pide los datos a modificar al usuario
        System.out.println("Ingrese el codigo del producto a modificar");
        Integer codigo = teclado.nextInt();
        
        System.out.println("Ingrese el nuevo nombre del producto");
        String nombre = teclado.next();
        
        System.out.println("Ingrese el nuevo precio del producto");
        Double precio = teclado.nextDouble();
        
        modificarProducto(codigo,nombre,precio);
    }
    
    public void modificarProducto(Integer codigo, String nombre, Double precio) throws Exception {
        
        try {
            
            //Validamos
            if (codigo <= 0) {
                
                throw new Exception("El codigo es invalido");
                
            }
            
            validar(nombre, precio);
            
            //Creamos un objeto para igualarlo a otro mediante una busqueda por codigo
            Producto productoModi = buscarPorCodigo(codigo);
            
            productoModi.setNombre(nombre);
            
            productoModi.setPrecio(precio);
            //Ahora el producto esta modificado y se lo enviamos al DAO
            dao.modificarProducto(productoModi);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo modificar el producto(Servicio Producto)");
            
        }
        
    }
    
    //Eliminar un producto de la base de datos.
    public void eliminarProducto() throws Exception {
        
        System.out.println("Ingrese el codigo del producto a eliminar");
        
        Integer codigo = teclado.nextInt();
        
        eliminarProducto(codigo);
        
    }
    
    public void eliminarProducto(Integer codigo) throws Exception {
        
        try {
            
            if (codigo == null || codigo <= 0) {
                
                throw new Exception("El codigo esta vacio o es invalido");
                
            }
            
            dao.eliminarProducto(codigo);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo eliminar el producto(Servicio Producto)");
            
        }
        
    }
    
    //VALIDACIONES 
    public void validar(String nombre,Double precio) throws Exception {
        
        if (nombre.trim().isEmpty() || nombre == null) {
            
            throw new Exception("El nombre esta vacio o es invalido");
            
        }
        
        if (precio == null || precio <= 0) {
            
            throw new Exception("El precio esta vacio o es invalido");
            
        }
        
    }
    
    public Producto buscarPorCodigo(Integer codigo) throws Exception {
        //Validamos 
        try {
            
            if(codigo == null || codigo <= 0) {
                
                throw new Exception("El codigo esta vacio o es invalido");
                
            }
            
            //Creo el objeto que me va a devolver la consulta de MySQL
            Producto productoModi = dao.obtenerProductoPorCodigo(codigo);
            //Validamos que el objeto no este vacio
            if (productoModi == null) {
                
                throw new Exception("El producto esta vacio");
                
            }
            
            return productoModi;
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            throw new Exception("Error del sistema");
            
        }
    }

}