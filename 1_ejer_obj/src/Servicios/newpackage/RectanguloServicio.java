/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("--------------Rectangulo---------------");
        System.out.println("Ingrese la base: ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura = leer.nextInt();
        System.out.println("---------------------------------------");
        return new Rectangulo(base,altura);
    }
    
    public int superficieRectangulo(int base, int altura){
        return base * altura;
    }
    
    public int perimetroRectangulo(int base, int altura){
        return 2*base + 2*altura;
    }
    
    public void dibujarRectangulo(int base, int altura){
        
        System.out.println("---------DIBUJO--------------");
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
         System.out.println("--------------------------");
    }
    
    
}
