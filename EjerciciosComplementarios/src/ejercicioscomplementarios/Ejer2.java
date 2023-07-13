/*
 -------- EJER 2 ---------
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link: 
 */
package ejercicioscomplementarios;

import Entidad.Puntos;
import Servicio.PuntosServicio;

public class Ejer2 {

   
    public static void main(String[] args) {
        PuntosServicio ps = new PuntosServicio();
        
        Puntos p1 = ps.crearPuntos();
        System.out.println("La distancia entre los puntos: " + "(" + p1.getX1() + "," + p1.getY1() + ") y (" + p1.getX2() + "," + p1.getY2() + ") es: " + ps.distancia(p1));
    }
    
}
