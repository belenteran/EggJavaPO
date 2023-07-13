/*
 * ----EJER 2----
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link: 
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();
        
        System.out.println("Ingrese X1: ");
        p1.setX1(read.nextInt());
         System.out.println("Ingrese Y1: ");
        p1.setY1(read.nextInt());
         System.out.println("Ingrese X2: ");
        p1.setX2(read.nextInt());
         System.out.println("Ingrese Y2: ");
        p1.setY2(read.nextInt());
        return p1;
    
    }
    
    public double distancia(Puntos p1){
        return Math.sqrt(Math.pow((p1.getX2()-p1.getX1()), 2)+ Math.pow((p1.getY2()-p1.getY1()), 2));
    }

}
