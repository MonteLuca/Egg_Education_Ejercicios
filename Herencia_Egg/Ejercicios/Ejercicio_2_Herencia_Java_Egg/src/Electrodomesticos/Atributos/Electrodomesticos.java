package Electrodomesticos.Atributos;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Electrodomesticos {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    //Atributos
    
    protected Double precio;
    
    protected String color;
    
    protected String consumoEnergetico;
    
    protected Integer peso;
    
    //Constructor sin parametros

    public Electrodomesticos() {
    }
    
    //Constructor con parametros

    public Electrodomesticos(Double precio, String color, String consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    //Getters and setters

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    //Metodos
    
    public void comprobarConsumoEnergetico(String letra) {
       
        switch (letra.toUpperCase()) {
            
            case "A":
                
                this.consumoEnergetico = "A";
                
                break;
                
            case "B":
                
                this.consumoEnergetico = "B";
                
                break;
                
            case "C":
                
                this.consumoEnergetico = "C";
                
                break;
                
            case "D":
                
                this.consumoEnergetico = "D";
                
                break;
                
            case "E":
                
                this.consumoEnergetico = "E";
                
                break;
                
            case "F":
                
                this.consumoEnergetico = "F";
                
                break;
                
                default:
                    
                    System.out.println("La letra no corresponde, por defecto sera F");
                    
                    this.consumoEnergetico = "F";
                    
                    break;
                    
        }
        
    }
    
    public void comprobarColor (String colorOpc) {
        
        switch (colorOpc.toUpperCase()) {
            
            case "GRIS":
                
                this.color = "Gris";
                
                break;
                
            case "AZUL":
                
                this.color = "Azul";
                
                break;
                
            case "ROJO":
                
                this.color = "Rojo";
                
                break;
                
            case "NEGRO":
                
                this.color = "Negro";
                
                break;
                
            case "BLANCO":
                
                this.color = "Blanco";
                
                break;
                
                default:
                    
                    System.out.println("El color no es valido, por defecto sera blanco");
                    
                    this.color = "Blanco";
                    
                    break;
        }
        
    }
    
    public void crearElectrodomestico(){
       
        System.out.println("De que color es: ");
        
        comprobarColor(teclado.next());
        
        System.out.println("De cuanto es su consumo energetico: ");
        
        comprobarConsumoEnergetico(teclado.next());
        
        System.out.println("Cuanto pesa: ");
        
        this.peso = teclado.nextInt();
        
        this.precio = 1000.00;
        
    }
    
    public void precioFinal () {
        
        switch (this.consumoEnergetico) {
            
            case "A":
                
                this.precio += 1000.00;
                
                break;
                
            case "B":
                
                this.precio += 800.00;
                
                break;
                
            case "C":
                
                this.precio += 600.00;
                
                break;
                
            case "D": 
                
                this.precio += 500.00;
                
                break;
                
            case "E":
                
                this.precio += 300.00;
                
                break;
                
            case "F":
                
                this.precio += 100.00;
                
                break;
                    
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            
            this.precio += 100.00;
            
        } else if (this.peso >= 1 && this.peso <= 19) {
            
            this.precio += 500.00;
            
        } else if (this.peso >= 50 && this.peso <= 79) {
            
            this.precio += 800.00;
            
        } else {
            
            this.precio += 1000.00;
            
        }
   
    }

    @Override
    
    public String toString() {
        return "Electrodomesticos{" + "teclado=" + teclado + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }  
}