/*
 * EJER 14
 */
package Servicios.newpackage;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class MovilServicio {
    
    /* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        System.out.println("-------TELEFONO--------");
        System.out.println("Ingrese la marca: ");
        m1.setMarca(read.next());
        System.out.println("Ingrese el precio: ");
        m1.setPrecio(read.nextFloat());
        System.out.println("Ingrese el modelo: ");
        m1.setModelo(read.next());
        System.out.println("Ingrese la memoria Ram: ");
        m1.setMemoriaRam(read.nextInt());
        System.out.println("Ingrese el almacenamiento: ");
        m1.setAlmacenamiento(read.nextInt());
        System.out.println("Ingrese el codigo: ");
        
        
        m1.setCodigo(ingresarCodigo());
        return m1;
        
    }
    public int[] ingresarCodigo(){
        int[] vec = new int[7];
        
        for (int i = 0; i < 7; i++) {
            vec[i] = (int) Math.round(Math.random())*10;
        }
        return vec;
    }
}
