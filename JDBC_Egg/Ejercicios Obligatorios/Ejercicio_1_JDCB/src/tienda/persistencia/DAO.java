package tienda.persistencia;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;
/**
 * @author Luca Monte
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    
    protected ResultSet resultado = null;
    
    //ResultSet guarda el resultado de la query;
    
    protected Statement sentencia = null;
    
    //Statement prepara a la variable sentencia, para luego ejecutar la query
    
    //Constantes
    
    private final String USER = "root";
    
    private final String PASSWORD = "root";
    
    private final String DATABASE = "tienda";
    
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    //Metodos
    
    protected void conectarBase() throws Exception {
        
        try {
            
            Class.forName(DRIVER);
            
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo conectar a la base de datos");
            
        }
        
    }
    
    protected void desconectarBase() throws Exception {
        
        try {
            
            if (resultado != null) {
                
                resultado.close();
                
            }
            
            if (sentencia != null) {
                
                sentencia.close();
                
            }
            
            if (conexion != null) {
                
                conexion.close();
                
            }
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo desconectar la base de datos");
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception {
        
        try {
            
            conectarBase();
            
            sentencia = conexion.createStatement();
            
            sentencia.executeUpdate(sql);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo insertar, modificar o eliminar nada");
            
        } finally {
            
            desconectarBase();
            
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        
        try {
            
            conectarBase();
            
            sentencia = conexion.createStatement();
            
            resultado = sentencia.executeQuery(sql);
            
        } catch (Exception e) {
            
            throw new Exception("No se pudo consultar la base");
            
        }   
    }
}