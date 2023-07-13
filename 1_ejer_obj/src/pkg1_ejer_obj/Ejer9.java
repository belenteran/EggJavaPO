/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Matematica;
import Servicios.newpackage.MatematicaServicio;

/**
 *
 * @author Belu
 */

/*
Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MatematicaServicio ms = new MatematicaServicio();
       float n1 = 1.2f, n2 = 2.5f;
       Matematica m1 = new Matematica(n1,n2);
       
        System.out.println("---------Bienvenido------------");
        System.out.println("El numero 1 es: " + n1 + " el numero 2 es: " + n2);
        System.out.println("---------Conclusion------------");
        System.out.println("El mayor es: " + ms.devolverMayor(m1));
        System.out.println("La potencia es: " + ms.calcularPotencia(m1));
        System.out.println("La raiz del menor es: " + ms.calcularRaiz(m1));
    }
    
}
