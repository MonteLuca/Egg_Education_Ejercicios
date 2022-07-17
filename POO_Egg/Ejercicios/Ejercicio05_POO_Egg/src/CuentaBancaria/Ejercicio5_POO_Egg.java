/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:

• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package CuentaBancaria;

import CuentaBancaria.Entidades.CuentaBancaria;

import CuentaBancaria.Servicios.CuentaBancariaServicios;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Ejercicio5_POO_Egg {

    public static void main(String[] args) {
        
        System.out.println("BIENVENIDO AL BANCO LOXI");
        
        int opcion; 
        Scanner teclado = new Scanner(System.in);
        
        CuentaBancariaServicios cbs1 = new CuentaBancariaServicios();
        
        CuentaBancaria c1 = cbs1.cargarDatos();
        
        do {
            System.out.println("Eliga una opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Retiro Express");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    
                    cbs1.ingresarDinero(c1);
                    break;
                    
                case 2:
                    
                    cbs1.retirarDinero(c1);
                    break;
                    
                case 3:
                    
                    cbs1.retirarExpress(c1);
                    break;
                    
                case 4: 
                    
                    cbs1.consultarSaldo(c1);
                    break;
                    
                case 5: 
                    
                    cbs1.consultarDatos(c1);
                    break;
                    
                case 6:
                    
                    System.out.println("Adios, Que tenga un buen dia");
                    
            }
            
        } while (opcion != 6);
    }
    
}