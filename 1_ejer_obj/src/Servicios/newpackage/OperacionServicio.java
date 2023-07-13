/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in);
    public Operacion crearOperacion(){
        
        System.out.println("Ingrese el numero 1: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int n2 = leer.nextInt();
        return new Operacion(n1,n2);
    }
    
    public int suma(int n1, int n2){
        return n1+n2;
    }
    
     public int restar(int n1, int n2){
        return n1-n2;
    }
    
     
    public int multiplicacion(int n1, int n2){
        if(n1==0 || n2 == 0){
            System.out.println("Error. Es una multiplicacion por 0 ");
            return 0;
        }else{
            return n1*n2;
        }
    }
    
    public double division(int n1, int n2){
        double num1 = n1;
        double num2 = n2;
        if(num1==0 || num2 == 0){
            System.out.println("Error. Es una division por 0 ");
            return 0;
        }else{
            double div = num1/num2;
            
            return Math.floor(div *100)/100;
        }
    }
    
    
}
