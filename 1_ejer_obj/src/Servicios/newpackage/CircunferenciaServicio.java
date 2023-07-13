/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class CircunferenciaServicio {
    
    public Circunferencia crearCirfunferencia(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        float r = leer.nextFloat();
        return new Circunferencia(r);
    }
    
    public float area(float r){
        float a;
        a = (float) (r*r * 3.1416);
        return a;
    }
    
    public float perimetro(float r){
        float p = (float) (2*3.1416* r);
        return p;
        
    }
}
