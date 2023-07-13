/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Belu
 */

/*-----Ejer 10--------------
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();

*/
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int dia;
        int mes;
        do{
            System.out.println("Ingrese el dia: (1-31)");
            dia =(read.nextInt());
        }while(dia<0 || dia>31 );
        
        do {            
            System.out.println("Ingrese el mes: (1-12)" );
            mes = read.nextInt() - 1;
        } while (mes<0 || mes>12);
        
        System.out.println("Ingrese el año: (dd-mm-aaaa)");
        int anio = read.nextInt() - 1900;
        
        Date fechaUsuario = new Date(anio, mes , dia);
        System.out.println("dia " + fechaUsuario.getDay());
        Date fechaActual = new Date();
        
        System.out.println(fechaUsuario);
        System.out.println(fechaActual);
        int dif = fechaUsuario.getYear() - fechaActual.getYear();
        System.out.println("La cantidad de anios entre la fecha ingresada y la fecha actual es: " + Math.abs(dif));
        
    }
    
}
