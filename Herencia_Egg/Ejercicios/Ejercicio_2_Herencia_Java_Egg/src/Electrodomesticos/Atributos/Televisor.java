package Electrodomesticos.Atributos;
/**
 * @author Luca Monte
 */
public class Televisor extends Electrodomesticos {

    //Atributos
    
    protected Integer resolucion;

    protected Boolean sintonizadorTDT;

    //Constructor vacio
    
    public Televisor() {

    }

    //Constructor con parametros
    
    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Getters and Setters
    
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Metodos
    
    public void crearTelevisor() {
        
        System.out.println("Televisor");

        String opc;

        crearElectrodomestico();

        System.out.println("De cuantas pulgadas es el televisor?");

        this.resolucion = teclado.nextInt();

        do {

            System.out.println("Trae Sintonizador TDT? (S/N)");

            opc = teclado.next();
            
            if (opc.equalsIgnoreCase("S")) {
                
                this.sintonizadorTDT = true;
                
            } else {
                
                this.sintonizadorTDT = false;
                
            }
        } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));

    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        if (this.resolucion > 40) {

            //V+((P/100)*V)
            
            this.precio += this.precio * 0.3;

        }
        
        if (sintonizadorTDT) {
            
            this.precio += 500;
            
        }

        System.out.println("El precio final es de " + this.precio);
        
    }

    @Override
    
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
}