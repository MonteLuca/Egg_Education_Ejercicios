package AreaYPerimetro.Entidades;

import AreaYPerimetro.Interfaces.calculosFormas;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Circulo implements calculosFormas {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("/n");
    
    //Atributos
    
    private Double radio;
    
    private Double diametro;
    
    //Constructor sin parametros

    public Circulo() {
    }
    
    //Constructor con parametros

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    //Getters y setters

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("PERIMETRO CIRCULO");
        
        System.out.println("Ingrese el diametro del circulo");
        
        this.diametro = teclado.nextDouble();
                
        double resultado = Math.PI * this.diametro;
        
        System.out.println("El resultado es " + resultado);
        
    }

    @Override
    public void calcularArea() {
        
        System.out.println("AREA CIRCULO");
        
        System.out.println("Ingrese el radio del circulo");
        
        this.radio = teclado.nextDouble();
        
        double resultado = Math.PI * Math.pow(this.radio, 2);
        
        System.out.println("El resultado es: " + resultado);
        
    }   
}