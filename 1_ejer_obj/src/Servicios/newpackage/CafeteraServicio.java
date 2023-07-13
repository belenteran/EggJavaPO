/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class CafeteraServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Cafetera c1 = new Cafetera();
    public void llenarCafetera(){
        
        System.out.println("--------LLENAR CAFETERA-----------");
        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        c1.setCapacidadMaxima(read.nextInt());
        
        c1.setCapacidadActual(c1.getCapacidadMaxima());   
        System.out.println("----------------------------------");
        read.nextLine();
    }
    public void llenarTaza(int tamanio){
        
        if(tamanio<=c1.getCapacidadActual()){
            c1.setCapacidadActual( c1.getCapacidadActual() - tamanio);
            System.out.println("La taza esta esta llena, su carga es de: " + tamanio);
        }else{
            int  resto;
            resto = Math.abs(tamanio - c1.getCapacidadActual());
            System.out.println("La taza no se puede llenar. Su carga es de: " + c1.getCapacidadActual());
        }
         System.out.println("----------------------------------");
         read.nextLine();
    }
        
    public void vaciarCafetera(){
        System.out.println("--------VACIAR CAFETERA-----------");
        c1.setCapacidadActual(0);
        System.out.println("La carga de la cafetera es: " + c1.getCapacidadActual());
        System.out.println("----------------------------------");
        read.nextLine();
    }
    
    public void agregarCafe(int cafe){
        c1.setCapacidadActual(cafe + c1.getCapacidadActual());
        System.out.println("La carga de la cafetera es: " + c1.getCapacidadActual());
        read.nextLine();
    }
}
