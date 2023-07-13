/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Rectangulo;
import Servicios.newpackage.RectanguloServicio;

/**
 *
 * @author Belu
 */
public class Ejer4{

    /**
     * @param args the command line arguments
     */
    
    /*  -------------------Ejer 3 -----------------------
        Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario. También incluirá un método para
    calcular la superficie del rectángulo y un método para calcular el perímetro del
    rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
    setters y constructores correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.
        */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        int a = rs.superficieRectangulo(r1.getBase(), r1.getAltura());
        System.out.println("El area del Rectangulo es: " + a);
        int p = rs.perimetroRectangulo(r1.getBase(), r1.getAltura());
        System.out.println("El perimetro del Rectangulo es: " + p);
        
        rs.dibujarRectangulo(r1.getBase(), r1.getAltura());
        
    }
    
}
