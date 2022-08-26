package tienda.persistencia;

import java.util.ArrayList;

import tienda.entidades.Fabricante;
/**
 * @author Luca Monte
 */
public class FabricanteDAO extends DAO{
    
    //En fabricante creamos un metodo por cada Query
    
    public void insertarFabricante(Fabricante fabricante) throws Exception {
        
        try {
            
            if (fabricante == null) {
                
                throw new Exception("El fabricante esta vacio");
                
            }
            
            String sql = "INSERT INTO fabricante (nombre) " 
                    + "VALUES ( '" + fabricante.getNombre() + "');";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
            throw new Exception("No se pudo insertar un fabricante");
            
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception {
        
        try {
            
            if (fabricante == null) {
                
                throw new Exception("No se puede modificar el fabricante porque esta vacio");
                
            }
            
            String sql = "UPDATE fabricante SET " 
                    + "nombre = '" + fabricante.getNombre() + "WHERE codigo = " + fabricante.getCodigo() + ";s";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
            throw new Exception("No se pudo modificar el producto");
            
        }
        
    }
    
    public void eliminarFabricante(Integer codigo) throws Exception {
        
        try {
            
            if (codigo <= 0) {
                
                throw new Exception("El codigo es invalido");
                
            }
            
            String sql = "DELETE FROM fabricante WHERE codigo = " + codigo + ";";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
            throw new Exception("No se pudo eliminar al fabricante");
            
        }
    }
    
    public ArrayList<Fabricante>listarFabricantes () throws Exception {
        
        try {
            
            String sql = "SELECT * FROM fabricante;";
            
            consultarBase(sql);
            
            Fabricante fabricante = null;
            
            ArrayList<Fabricante> listarFabricantes = new ArrayList();
            
            while (resultado.next()) {             
                
                fabricante = new Fabricante();
                
                fabricante.setCodigo(resultado.getInt(1));
                
                fabricante.setNombre(resultado.getString(2));
                
                listarFabricantes.add(fabricante);
                
            }
            
            return listarFabricantes;
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo traer la lista de fabricantes");
            
        } finally {
            
            desconectarBase();
            
        }
        
    }   
}