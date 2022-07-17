package AreaYPerimetro.Entidades;

import AreaYPerimetro.Interfaces.calculosFormas;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Rectangulo implements calculosFormas {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    //Atributos
    
    private int base;
    
    private int altura;
    
    //Constructor sin parametros

    public Rectangulo() {
    }
    
    //Constructor con parametros

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getters and Setters

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("PERIMETRO RECTANGULO");
        
        System.out.println("Ingrese la base");
        
        this.base = teclado.nextInt();
        
        System.out.println("Ingrese la altura");
        
        this.altura = teclado.nextInt();
        
        int resultado = (this.base + this.altura) * 2;
        
        System.out.println("El resultado es " + resultado);
        
    }

    @Override
    public void calcularArea() {
        
        System.out.println("AREA RECTANGULO");

        System.out.println("Ingrese la base");
        
        this.base = teclado.nextInt();
        
        System.out.println("Ingrese la altura");
        
        this.altura = teclado.nextInt();
        
        int resultado = this.base * this.altura;
        
        System.out.println("El resultado es: " + resultado);
        
    }
    
}