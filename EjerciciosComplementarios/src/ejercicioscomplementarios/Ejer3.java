/*
 * ---EJER 3 ---
    Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
 Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones. 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
 */
package ejercicioscomplementarios;

import Entidad.Raiz;
import Servicio.RaizServicio;

public class Ejer3 {

    public static void main(String[] args) {
        RaizServicio rs = new RaizServicio();
        Raiz r1 = new Raiz(1,-4,7);
        System.out.println("La ecuacion " + r1.getA() + "x2  + " + r1.getB() + "x + " + r1.getC());
        System.out.println("El discriminante es: " + rs.getDiscriminante(r1) );
        rs.calcular(r1);
    }
    
}
