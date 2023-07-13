/*
 * 
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra: ");
        String palabra = read.nextLine();
        
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, (i+1));
        }
        
       a1.setVec(vector);
       
        System.out.println("Ingrese la cantidad de jugadas maximas: ");
        a1.setJugadas(read.nextInt());
        
        return a1;
    }
     
    public int longitud( Ahorcado a1){
        return a1.getVec().length;
    }
    
    public boolean buscar(String letra, Ahorcado a1){
       
        for (String vec : a1.getVec()) {
            if (letra.equals(vec)) {
               return true;
            }
        }
        return false;
    }
    
  /*   Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades. */
    
    public void encontradas(int letra, Ahorcado a1){
        
    }

   
}
