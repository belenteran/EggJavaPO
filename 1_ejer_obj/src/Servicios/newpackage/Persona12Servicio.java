/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Persona12;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
public class Persona12Servicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Persona12 crearPersona(){
        Persona12 p1 = new Persona12();
        System.out.println("Ingrese el nombre del usuario: ");
        p1.setNombre(read.next());
        System.out.println("Ingrese la fecha de Nacimiento: ");
        int dia;
        int mes;
        do{
            System.out.println("Dia: (1-31)");
            dia =(read.nextInt());
        }while(dia<0 || dia>31 );
        
        do {            
            System.out.println("Mes: (1-12)" );
            mes = read.nextInt() - 1;
        } while (mes<0 || mes>12);
        
        System.out.println("Año: (dd-mm-aaaa)");
        int anio = read.nextInt() - 1900;
        Date fec = new Date(anio, mes, dia);
        p1.setFecNac(fec);
        
        return p1;
    }
    
    public int calcularEdad(Persona12 p1){
        Date hoy = new Date();
        int edad = hoy.getYear() - p1.getFecNac().getYear();
        return edad;
    }
    
    public boolean menorQue(Persona12 p1, int e){
        return e<  calcularEdad(p1);
    }
    
    public void mostrarPersona(Persona12 p2){
        System.out.println("Persona: ");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Fecha nacimiento: " + p2.getFecNac());
        System.out.println("Edad: " + calcularEdad(p2));
    
    }
    
}
