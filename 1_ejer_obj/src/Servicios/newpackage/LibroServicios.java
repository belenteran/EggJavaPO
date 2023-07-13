/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class LibroServicios {
    
    Scanner leer  = new Scanner(System.in).useDelimiter("\n");
     
    public Libro cargar(){
        System.out.println("Ingrese el nro de ISBN: ");
        int ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el titulo del Libro: ");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el nombre del Autor: ");
        String autor = leer.nextLine();
        System.out.println("Ingrese el Numero de Página: ");
        int nro_pag = leer.nextInt(); 
       return new Libro(ISBN, titulo, autor, nro_pag);
    }

    
    public void mostrar(Libro l){
        System.out.println("-------------Libro------------");
        System.out.println("ISBN: " + l.getISBN());
        System.out.println("Titulo: " +  l.getTitulo() );
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Numero de Página: " + l.getNro_pag());
          
    }
}
