/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class AlquilerServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(){
        Alquiler a1 = new Alquiler();
        System.out.println("Ingrese el titulo de la pelicula: ");
        a1.setPeliculaAlquilada(leer.next());
        int dia, mes, anio;
        do {     
            System.out.println("Ingrese la fecha de alquiler: ");
            System.out.println("Dia: ");
            dia = leer.nextInt();
            System.out.println("Mes: ");
            mes = leer.nextInt();
            System.out.println("Anio: ");
            anio = leer.nextInt()- 1900;
            
        } while (!fechaValida(dia, mes,anio));
        
        Date f = new Date(anio, mes, dia);
        a1.setFechaAlquiler(f);
        int d, m, a;
        int bool;
        do {     
            System.out.println("Ingrese la fecha de devolucion: ");
            System.out.println("Dia: ");
            d = leer.nextInt();
            System.out.println("Mes: ");
            m = leer.nextInt();
            System.out.println("Anio: ");
            a = leer.nextInt() - 1900;
            
            Date fec = new Date(a, m, d);
            a1.setFechaDevolucion(fec);
            
            bool = a1.getFechaAlquiler().compareTo(a1.getFechaDevolucion());
            
        } while (!fechaValida(d, m,a) && bool<0);
        
        System.out.println("Ingrese el precio: ");
        a1.setPrecio(leer.nextFloat());
       
        return a1;
        
    }
    
    public boolean fechaValida(int dia, int mes, int anio) {
        
        boolean validez;
        
        validez = false; 
        if ((mes >= 1) && (mes <= 12 ))   {
             switch ( mes ) {
                case  1 :
                case  3 :
                case  5 :
                case  7 :
                case  8 :
                case 10 :
                case 12 : validez = (dia >= 1) && (dia <= 31);
                          break;
                case  4 :
                case  6 :
                case  9 :
                case 11 : validez = (dia >= 1) && (dia <= 30);
                          break;
                case  2 : if((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
                    validez = (dia >= 1) && (dia <= 29);
                          }
                          else  {
                    validez = (dia >= 1) && (dia <= 28);
                          }   
            }
        }
        else    { 
                validez = false;
        }
        return validez;
    }
    
    public void mostrarAlquiler(Alquiler a){
        System.out.println(" Nombre de la pelicula: " + a.getPeliculaAlquilada());
        System.out.println(" Fecha de alquiler:  " + a.getFechaAlquiler());
        System.out.println(" Fecha de devolucion: " + a.getFechaDevolucion());
        System.out.println(" Precio: " + a.getPrecio());
    }
    
    public int diferenciaDias(Alquiler a){
        int dia = a.getFechaDevolucion().getDay() - a.getFechaAlquiler().getDay(); 
        // solo consideramos dias por que nos da fiaca
        return dia;
    }
}
