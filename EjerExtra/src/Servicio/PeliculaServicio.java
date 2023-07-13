/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula crearPelicula(){
        
        Pelicula p1;
        p1 = new Pelicula();
        
        System.out.println("Ingrese el titulo: ");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese genero: ");
        p1.setGenero(leer.next());
        System.out.println("Ingrese la fecha: ");
        int dia, mes, anio;
        do{
            System.out.println("Dia: (1-31)");
            dia =(leer.nextInt());
        }while(dia<0 || dia>31 );
        
        do {            
            System.out.println("Mes: (1-12)" );
            mes = leer.nextInt() - 1;
        } while (mes<0 || mes>12);
        
        System.out.println("Año: (aaaa)");
        anio = leer.nextInt() - 1900;
        Date fec = new Date(anio, mes, dia);
        p1.setFecha(fec);
        
        System.out.println("Ingrese la duracion en minutos: ");
        p1.setDuracion(leer.nextDouble());
        
        
        return p1;
        
    }
    
    public void mostrarPelicula(Pelicula p){
        System.out.println("El titulo es: " + p.getTitulo());
        System.out.println("Su genero es: " + p.getGenero());
        System.out.println("La fecha es: " + p.getFecha());
    }
}
