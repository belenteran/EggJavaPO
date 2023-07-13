/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Cafetera;
import Servicios.newpackage.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    
    /*------------EJER 6-------------
            Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
        cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
        métodos:
         Constructor predeterminado o vacío
         Constructor con la capacidad máxima y la cantidad actual

         Métodos getters y setters.
         Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
        máxima.
         Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
         Método vaciarCafetera(): pone la cantidad de café actual en cero.
         Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.

    */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio cs = new CafeteraServicio();
        
        cs.llenarCafetera();
       
        System.out.println("--------LLENAR TAZA-----------");
        System.out.println("Ingrese el tamaño de la taza: ");
        int tamanio = read.nextInt();
        cs.llenarTaza(tamanio);
        
        cs.vaciarCafetera();
        System.out.println("--------AGREGAR CAFE-----------");
        System.out.println("Ingrese cuanto cafe quiere agregar: "); 
        int cafe = read.nextInt();
        cs.agregarCafe(cafe);
        
    }
    
}
