package CuentaBancaria.Entidades;
/**
 * @author Luca Monte
 */
public class CuentaBancaria {
    
    //Atributos
    
    private int numeroCuenta;
    
    private int DNIcliente;
    
    private double saldoActual;
    
    //Constructor por defecto

    public CuentaBancaria() {
        
    }
    
    //Contructor con parametros

    public CuentaBancaria(int numeroCuenta, int DNIcliente, int saldoActual) {
        
        this.numeroCuenta = numeroCuenta;
        this.DNIcliente = DNIcliente;
        this.saldoActual = saldoActual;
        
    }
    
    //Getters and Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(int DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}