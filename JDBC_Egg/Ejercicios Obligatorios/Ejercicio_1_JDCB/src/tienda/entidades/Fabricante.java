package tienda.entidades;
/**
 * @author Luca Monte
 */
public class Fabricante {
    
    //Atributos
    
    private int codigo;
    
    private String nombre;
    
    //Constructor sin parametros

    public Fabricante() {
        
    }
    
    //Constructor con parametros

    public Fabricante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
}