/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Belu
 */

/* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
public class PesonaServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(read.next());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(read.nextInt());
        System.out.println("Ingrese el peso: ");
        p1.setPeso(read.nextFloat());
        
        int c;
        String s;
        do {  
            c=0;
            System.out.println("Ingrese el sexo (H-M-O)");
            p1.setSexo(read.next()); 
            s = p1.getSexo();
            s = s.toUpperCase();
            if(!s.equals("H") && !s.equals("M") && !s.equals("O") )
            {
                System.out.println("El sexo ingresado es incorrecto.");
                c=1;
            }
            
        } while (c!=0);
        System.out.println("Ingrese la altura: ");
        p1.setAltura(read.nextFloat());
        return p1;

    }
    
    public int calcularIMC(Persona p1){
        float IMC;
        
        IMC = (p1.getPeso())/(p1.getAltura()*2);
        if(IMC < 20){
           return -1;
        }else if(IMC >= 20 && IMC<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayor(Persona p1){
        return p1.getEdad()>= 18;
    }
    
}
