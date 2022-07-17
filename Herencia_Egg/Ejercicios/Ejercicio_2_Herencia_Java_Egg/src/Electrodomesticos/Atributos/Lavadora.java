package Electrodomesticos.Atributos;
/**
 * @author Luca Monte
 */
public class Lavadora extends Electrodomesticos {
    
    //Atributos
    
    protected Integer carga;
    
    //Constructor vacio

    public Lavadora() {
        
    }

    //Constructor parametrizado
    
    public Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //Getters and Setters

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    //Metodos
    
    public void crearLavadora() {
        
        System.out.println("Lavadora");
        
        crearElectrodomestico();
        
        System.out.println("De cuanta carga es la Lavadora: ");
        
        this.carga = teclado.nextInt();
        
    }
    
    @Override
    public void precioFinal () {
        
        super.precioFinal();
        
        if (this.carga > 30) {
            
            this.precio += 500.00;
            
        }
        
        System.out.println("El precio final es de " + this.precio);
        
    }   

    @Override
    
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
}