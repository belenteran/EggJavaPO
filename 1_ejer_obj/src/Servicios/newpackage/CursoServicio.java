/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
        que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
        en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
        nombre de cada alumno.
         Método crearCurso(): el método crear curso, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
        al atributo alumnos
         Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
        en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
        día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
        se repite el encuentro.*/
package Servicios.newpackage;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class CursoServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumno(){
        
        String[] alumnos = new String[5];  
        for (int i = 0; i < 5; i++) {  
            System.out.println("-------Alumno " + (i+1) + "----------");
            System.out.println("Ingrese el nombre: ");
            alumnos[i] = read.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
    
        Curso c1 = new Curso();
        System.out.println("Ingrese el nombre del curso: ");
        c1.setNombreCurso(read.next());
        System.out.println("Ingrese la cantidad de Horas por Dia: ");
        c1.setCantidadHorasDia(read.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(read.nextInt());
        System.out.println("Ingrese el turno: (mañana-noche)");
        c1.setTurno(read.next());
        System.out.println("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(read.nextFloat());
        c1.setAlumno(cargarAlumno());
        return c1;
    
    }
     
    public float calcularGananciaSemanal(Curso c1){
        return c1.getCantidadDiasPorSemana() * c1.getCantidadHorasDia() * c1.getPrecioPorHora();
    }
    
    
}
