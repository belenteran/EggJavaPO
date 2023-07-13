
package pkg1_ejer_obj;

import Entidad.Persona12;
import Servicios.newpackage.Persona12Servicio;

/**
 *
 * @author Belu
 */

/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

*/
public class Ejer12 {

    public static void main(String[] args) {
        Persona12Servicio ps = new Persona12Servicio();
        Persona12 p1 = ps.crearPersona();
        System.out.println("La edad de la persona es: " + ps.calcularEdad(p1));
        int edad=19;
        System.out.println("La persona es mayor a la edad ingresada " + "(" + edad + ") : " + ps.menorQue(p1,edad) );
        Persona12 p2 = ps.crearPersona();
        System.out.println("Persona 1: " + p1.getNombre() + "Persona 2: " + p2.getNombre());
        
        ps.mostrarPersona(p1);
    }
    
}
