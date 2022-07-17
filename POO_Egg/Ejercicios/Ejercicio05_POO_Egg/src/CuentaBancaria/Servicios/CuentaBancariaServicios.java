package CuentaBancaria.Servicios;

import CuentaBancaria.Entidades.CuentaBancaria;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class CuentaBancariaServicios {

    Scanner teclado = new Scanner(System.in);

    double dinero;
    
    public CuentaBancaria cargarDatos() {

        CuentaBancaria c1 = new CuentaBancaria();

        System.out.println("Ingrese el numero de su cuenta: ");
        c1.setNumeroCuenta(teclado.nextInt());

        System.out.println("Ingrese su DNI: ");
        c1.setDNIcliente(teclado.nextInt());

        System.out.println("Ingrese su saldo actual: ");
        System.out.print("$");
        c1.setSaldoActual(teclado.nextDouble());

        return c1;

    }
    
    public void ingresarDinero(CuentaBancaria c1) {
        
        System.out.println("Cuanto dinero quiere ingresar: ");
        System.out.print("$");
        
        dinero = teclado.nextDouble();
        
        c1.setSaldoActual(dinero + c1.getSaldoActual());
        
        System.out.println("Dinero Ingresado");
             
    }
    
    public void retirarDinero (CuentaBancaria c1) {
        
        System.out.println("Cuanto dinero quiere retirar: ");
        System.out.print("$");
        
        dinero = teclado.nextDouble();
        
        if (dinero > c1.getSaldoActual()) {
            
            System.out.println("El dinero que ingreso es mayor a su saldo");
            
            c1.setSaldoActual(0);
            
        } else {
            
            System.out.println("Dinero extraido");
            
            c1.setSaldoActual(c1.getSaldoActual() - dinero);
            
        }
        
    }
    
    public void retirarExpress(CuentaBancaria c1) {
        
        System.out.println("Cuanto dinero quiere retirar: ");
        
        System.out.print("$");
        
        dinero = teclado.nextDouble();
        
        double porcentaje = 0.20 * c1.getSaldoActual();
    
        if (dinero > porcentaje) {
            
            System.out.println("Solo puede sacar un 20% de su saldo actual");
            
        } else {
            
            System.out.println("Dinero Extraido");
            
            c1.setSaldoActual(c1.getSaldoActual() - dinero);
            
        }
        
    }
    
    public void consultarSaldo(CuentaBancaria c1) {
        
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria c1) {
        
        System.out.println("Su numero de cuenta es: " + c1.getNumeroCuenta());
        
        System.out.println("Y su numero de DNI es: " + c1.getDNIcliente());
        
    }
}