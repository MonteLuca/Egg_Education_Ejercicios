/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package Rectangulo;

import Rectangulo.Entidades.Rectangulo;

import Rectangulo.Servicios.RectanguloServicios;
/**
 * @author Luca Monte
 */
public class Ejercicio4_POO_Egg {

    public static void main(String[] args) {
        
        RectanguloServicios rs1 = new RectanguloServicios();
        
        Rectangulo r1 = rs1.pedirDatos();
        
        System.out.println("El perimetro del rectangulo es: " + rs1.calcularPerimetro(r1));
        
        System.out.println("La superficie del rectangulo es: " + rs1.calcularSuperficie(r1));
        
        System.out.println("--- Dibujo del rectangulo ---");
        
        rs1.dibujarRectangulo(r1);       
    }
}