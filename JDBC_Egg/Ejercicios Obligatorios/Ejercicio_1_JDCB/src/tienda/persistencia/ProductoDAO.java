package tienda.persistencia;

import java.util.ArrayList;

import tienda.entidades.Producto;
/**
 * @author Luca Monte
 */
public final class ProductoDAO extends DAO {

    //En producto DAO creamos metodos por cada query de MySQL
    public void insertarProducto(Producto producto) throws Exception {

        try {

            if (producto == null) {

                throw new Exception("El producto esta vacio");

            }

            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante)" + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + " , " + producto.getCodigo_fabricante() + " ) ; ";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
            
            throw new Exception("NO LOGRO INSERTARSE EL USUARIO");

        }

    }

    public void modificarProducto(Producto producto) throws Exception {

        try {

            if (producto == null) {

                throw new Exception("El producto esta vacio");

            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "', precio = "
                    + producto.getPrecio() + ", codigo_fabricante = "
                    + producto.getCodigo_fabricante() + " WHERE codigo = " + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
            
            throw new Exception("No se pudo modificar el producto");

        }

    }

    public void eliminarProducto(Integer codigo) throws Exception {

        if (codigo <= 0) {

            throw new Exception("El codigo es invalido");

        }

        try {

            String sql = "DELETE FROM producto WHERE codigo = " + codigo + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
            
            throw new Exception("No se pudo eliminar el producto");

        }

    }

    public ArrayList<Producto> listarNombreProducto() throws Exception {

        try {

            String sql = "SELECT nombre FROM producto;";

            consultarBase(sql);

            ArrayList<Producto> listarNombreProducto = new ArrayList();

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                //Por cada seteo, va una columna
                producto.setNombre(resultado.getString(1));

                listarNombreProducto.add(producto);

            }

            return listarNombreProducto;

        } catch (Exception e) {
            
            System.out.println(e.toString());

            throw new Exception("No se pudo mostrar la lista de nombre de los productos(ProductoDAO)");

        } finally {

            desconectarBase();

        }

    }

    public ArrayList<Producto> listarNombreYPreciosProducto() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto;";

            consultarBase(sql);

            ArrayList<Producto> listarNombreYPreciosProducto = new ArrayList();

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));

                producto.setPrecio(resultado.getDouble(2));

                listarNombreYPreciosProducto.add(producto);

            }

            return listarNombreYPreciosProducto;

        } catch (Exception e) {
            
            System.out.println(e.toString());

            throw new Exception("No se pudo listar la listar de nombre y precios de producto");

        } finally {

            desconectarBase();

        }

    }

    public ArrayList<Producto> listarPrecioEntre120_202Producto() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto WHERE precio BETWEEN 120 AND 202;";

            consultarBase(sql);

            ArrayList<Producto> listarPrecioEntre120_202 = new ArrayList();

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));

                producto.setPrecio(resultado.getDouble(2));

                listarPrecioEntre120_202.add(producto);

            }

            return listarPrecioEntre120_202;

        } catch (Exception e) {

            System.out.println(e.toString());
            
            throw new Exception("No se pudo listar los precios entre 120 y 202");

        } finally {

            desconectarBase();

        }

    }

    public ArrayList<Producto> listarPortatilesProductos() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto WHERE nombre LIKE '%portatil%';";

            consultarBase(sql);

            ArrayList<Producto> listarPortatilesProductos = new ArrayList();

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));

                producto.setPrecio(resultado.getDouble(2));

                listarPortatilesProductos.add(producto);

            }

            return listarPortatilesProductos;

        } catch (Exception e) {
            
            System.out.println(e.toString());

            throw new Exception("No se pudo listar los portatiles de producto");

        } finally {

            desconectarBase();

        }

    }

    public Producto listarProductoMasBarato() throws Exception {

        try {

            String sql = "SELECT nombre, MIN(precio) FROM producto;";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));

                producto.setPrecio(resultado.getDouble(2));

            }

            return producto;

        } catch (Exception e) {
            
            System.out.println(e.toString());

            throw new Exception("No se pudo buscar el precio mas barato de producto");

        } finally {

            desconectarBase();

        }

    }

    public Producto obtenerProductoPorCodigo(Integer codigo) throws Exception {

        try {

            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));

                producto.setNombre(resultado.getString(2));

                producto.setPrecio(resultado.getDouble(3));

                producto.setCodigo_fabricante(resultado.getInt(4));

            }

            return producto;

        } catch (Exception e) {
            
            System.out.println(e.toString());

            throw new Exception("No se pudo obtener el producto por su codigo");

        } finally {

            desconectarBase();

        }

    }

}