package Cadena.Servicios;

import Cadena.Entidades.Cadena;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class CadenaServicios {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena cargarDatos() {
        
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase o palabra");
        c1.setFrase(teclado.next());
        
        c1.setLongitud(c1.getFrase().length());
        
        return c1;
        
    }
    
    public int contarVocales(Cadena c1) {
        
        int cont = 0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            if (c1.getFrase().toUpperCase().charAt(i) == 'A' || c1.getFrase().toUpperCase().charAt(i) == 'E'|| c1.getFrase().toUpperCase().charAt(i) == 'I'||
                c1.getFrase().toUpperCase().charAt(i) == 'O' || c1.getFrase().toUpperCase().charAt(i) == 'U') {
                
                cont++;
                
            }
        }
        
        return cont;
        
    }
    
    public String invertirFrase(Cadena c1) {
        
        String texto = c1.getFrase();
        
        String invertido = "";
        
        for (int i = texto.length() - 1; i >= 0 ; i--)  {
            
            invertido += texto.charAt(i);
            
        }
        
        return invertido;
        
    }
    
    public void vecesRepetido(Cadena c1) {
        
        int cont = 0;
        
        System.out.println("Que letra desea buscar: ");
        System.out.print(">");
        
        String letra = teclado.next();
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            if (c1.getFrase().substring(i,i + 1).equals(letra)) {
                
                cont++;
                
            }
            
        }
        
        System.out.println("La letra " + letra + " esta presente " + cont + " veces");
        
    }
    
    public void compararLongitud(Cadena c1) {
        
        System.out.println("Ingrese una nueva frase: ");
        System.out.print(">");
        
        String newFrase = teclado.next();
        
        if (newFrase.length() > c1.getLongitud()) {
            
            System.out.println("La nueva palabra es mas larga");
            
        } else {
            
            System.out.println("La nueva palabra es mas corta");
            
        }
         
    }
    
    public void unirFrase (Cadena c1) {
        
        System.out.println("Ingrese una frase para unir: ");
        System.out.print(">");
        
        String newFrase = teclado.next();
        
        String fraseUnida = c1.getFrase().concat(newFrase);
        
        System.out.println("La frase unida queda asi: " + fraseUnida);
        
    }
    
    public void reemplazarAs (Cadena c1) {
        
        String newFrase = "";
        
        System.out.println("Que letra desea reemplazar: ");
        System.out.print(">");
        
        String letra = teclado.next();
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            c1.setFrase(c1.getFrase().toLowerCase().replace("a", letra));
            
        }
        
        System.out.println("La frase cambiada es: " + c1.getFrase());
        
    }
    
    public boolean contieneXXX(Cadena c1) {
        
        System.out.println("Que letra desea consultar si esta o no en la frase:");
        System.out.print(">");
        
        String letra = teclado.next();
        
        if (c1.getFrase().toLowerCase().contains(letra)) {
            
            System.out.println("La letra " + letra + " esta en la frase");
            return true;
            
        } else {
            
            System.out.println("La letra " + letra + " no esta en la frase");
            return false;
            
        }
            
    }
    
}
