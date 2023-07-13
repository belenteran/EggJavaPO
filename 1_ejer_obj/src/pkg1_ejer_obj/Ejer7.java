/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Persona;
import Servicios.newpackage.PesonaServicio;

/**
 *
 * @author Belu
 */



/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        PesonaServicio ps = new PesonaServicio();
        int sp=0, pi=0, dp=0, menor =0, mayor=0;
        System.out.println("----------PERSONA 1----------------");
        Persona p1 = ps.crearPersona();
         
        switch (ps.calcularIMC(p1)) {
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                sp ++;
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                pi++;
                break;
            default:
                System.out.println("La persona esta por debajo de su peso ideal.");
                dp++;
               break;
        }
        if(ps.esMayor(p1)){
            System.out.println("Es mayor de edad");
            mayor++;
        }else{
            System.out.println("Es menor de edad");
            menor++;
        }
        
        //PERSONA 2 
        System.out.println("----------PERSONA 2----------------");
        Persona p2 = ps.crearPersona();
         
        switch (ps.calcularIMC(p2)) {
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                sp ++;
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                pi++;
                break;
            default:
                System.out.println("La persona esta por debajo de su peso ideal.");
                dp++;
               break;
        }
        if(ps.esMayor(p2)){
            System.out.println("Es mayor de edad");
            mayor++;
        }else{
            System.out.println("Es menor de edad");
            menor++;
        }
        
        // PERSONA 3
        System.out.println("----------PERSONA 3----------------");
        Persona p3 = ps.crearPersona();
         
        switch (ps.calcularIMC(p3)) {
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                sp ++;
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                pi++;
                break;
            default:
                System.out.println("La persona esta por debajo de su peso ideal.");
                dp++;
               break;
        }
        if(ps.esMayor(p3)){
            System.out.println("Es mayor de edad");
            mayor++;
        }else{
            System.out.println("Es menor de edad");
            menor++;
        }
        
        // PERSONA 4
        System.out.println("----------PERSONA 4----------------");
        Persona p4 = ps.crearPersona();
         
        switch (ps.calcularIMC(p4)) {
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                sp ++;
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                pi++;
                break;
            default:
                System.out.println("La persona esta por debajo de su peso ideal.");
                dp++;
               break;
        }
        if(ps.esMayor(p4)){
            System.out.println("Es mayor de edad");
            mayor++;
        }else{
            System.out.println("Es menor de edad");
            menor++;
        }
        System.out.println("----------CONCLUSION----------");
        System.out.println("El porcentaje que esta por debajo de su peso es de: %" + (dp*100)/4);
        System.out.println("El porcentaje que esta en su peso ideal es de: %" + (pi*100)/4);
        System.out.println("El porcentaje que esta con sobrepeso es de: %" + (sp*100)/4);
        System.out.println("El porcentaje que es mayor de edad es: %" + (mayor*100)/4);
        System.out.println("El porcentaje que es menor de edad es: %" + (menor*100)/4);
        
        
    }
   
    
}
