/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Circunferencia;
import Servicios.newpackage.CircunferenciaServicio;

/**
 *
 * @author Belu
 */
public class ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CircunferenciaServicio cs = new CircunferenciaServicio();
       Circunferencia c1 = cs.crearCirfunferencia();
   
       float a = cs.area(c1.getRadio());
       System.out.println("El area es: " + a);
       
       float p = cs.perimetro(c1.getRadio());
        System.out.println("El perimetro es: " + p);
    }
    
}
