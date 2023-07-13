/*
 * ---EJER 3--
 */
package Servicio;

import Entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class RaizServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    /* Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c */
    
    public double getDiscriminante(Raiz r1){
        return Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC());
    }
    /* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    public boolean tieneRaices(Raiz r1){
        return getDiscriminante(r1) > 0;
    }
   /*  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. */
    
    public boolean tieneRaiz(Raiz r1){
        return getDiscriminante(r1) == 0;
    }
    
   /*  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones. */
    
    public void obtenerRaices(Raiz r1){
        if(tieneRaices(r1)){
            System.out.println("La raiz numero 1 es: " + ((-r1.getB())- Math.sqrt(getDiscriminante(r1)))/ (2*r1.getA()));
            System.out.println("La raiz numero 2 es: " + ((-r1.getB())+ Math.sqrt(getDiscriminante(r1)))/ (2*r1.getA()));
        }else{
            System.out.println("No tiene 2 raices.");
        }
    }
    
    /* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible*/
    
    public void obtenerRaiz(Raiz r1){
        if(tieneRaiz(r1)){
             System.out.println("La raiz es: " + ((-r1.getB())- Math.sqrt(getDiscriminante(r1)))/ (2*r1.getA()));
        }else{
            System.out.println("No tiene 1 raiz.");
        }
    }
    
    /* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.*/
    
    public void calcular(Raiz r1){
        if(tieneRaices(r1)){
            obtenerRaices(r1);
        }else if(tieneRaiz(r1)){
            obtenerRaiz(r1);
        }else{
            System.out.println("No tiene raices. ");
        }
    }
}
