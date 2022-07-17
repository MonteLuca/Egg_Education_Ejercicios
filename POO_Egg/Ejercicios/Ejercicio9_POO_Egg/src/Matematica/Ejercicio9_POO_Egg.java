/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:

• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Matematica;

import Matematica.Entidades.Matematica;

import Matematica.Servicios.MatematicaServicios;
/**
 * @author Luca Monte
 */
public class Ejercicio9_POO_Egg {

    public static void main(String[] args) {
        
        MatematicaServicios ms1 = new MatematicaServicios();
        
        Matematica m1 = ms1.cargarDatos();
        
        ms1.mostrarRamdom(m1);
        
        System.out.println("La raiz cuadrada es: " + ms1.calculaRaiz(m1));
        
        System.out.println("La potencia es: " + ms1.calcularPotencia(m1));
    }
    
}