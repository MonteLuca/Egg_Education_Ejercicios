/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Tienda;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;
/**
 * @author Luca Monte
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        
        HashMap <String,Double> productos = new HashMap();
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("BIENVENIDO A LA BASE DE DATOS DE TADICOR S.A");
        
        int opcion = 0;
        
        do {            
            
            System.out.println("Que desea realizar");
            
            System.out.println("1.Cargar Producto");
            
            System.out.println("2.Modificar Producto");
            
            System.out.println("3. Eliminar Producto");
            
            System.out.println("4. Ver todos los productos");
            
            System.out.println("5. Salir");
            
            opcion = teclado.nextInt();
            
            switch (opcion) {
                
                case 1:
                    
                    System.out.println("Ingrese el nombre del producto que desea cargar: ");
                    
                    String nombreProducto = teclado.next();
                    
                    System.out.println("Ingrese el valor que le pondra a " + nombreProducto + ": ");
                    
                    double precio = teclado.nextDouble();
                    
                    productos.put(nombreProducto, precio);
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese el nombre del producto a modificar");
                    
                    String buscarProducto = teclado.next();
                    
                    for (Map.Entry<String, Double> entry : productos.entrySet()) {
                        
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        
                        if (buscarProducto.equals(key)) {
                            
                            System.out.println("Ingrese el nuevo producto: ");
                            
                            String nuevo = teclado.next();
                            
                            System.out.println("Ingrese el nuevo precio");
                            
                            double nuevoPrecio = teclado.nextDouble();
                            
                            productos.replace(nuevo, nuevoPrecio);
                            
                        } else {
                            
                            System.out.println("No se encontro el producto");
                            
                        }
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el nombre del producto a eliminar");
                    
                    buscarProducto = teclado.next();
                    
                    for (Map.Entry<String, Double> entry : productos.entrySet()) {
                        
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        
                        if (buscarProducto.equals(key)) {
                            
                            productos.remove(key);
                            
                        } else {
                            
                            System.out.println("No se encontro el producto");
                            
                        }
                        
                    }
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Los productos son los siguientes");
                    
                    for (Map.Entry<String, Double> entry : productos.entrySet()) {
                        
                        String key = entry.getKey();
                        
                        Double value = entry.getValue();
                        
                        System.out.println("Producto: " + key + " y su precio es : " + value);
                        
                    }
                    
                    break;
                    
                case 5:
                    
                    System.out.println("ADIOS");
                    
                    break;
                    
            }
  
        } while (opcion != 5);
        
    }
    
}