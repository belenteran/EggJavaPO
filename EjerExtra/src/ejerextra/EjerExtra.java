/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicio.AlquilerServicio;
import Servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class EjerExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pelicula[] vectorPelicula = new Pelicula[5];
        Alquiler[] vectorAlquiler = new Alquiler[5];
        
        menu(vectorPelicula, vectorAlquiler);
        
    }
    public static void menu(Pelicula[] peli, Alquiler[] alq){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        int tp =0, ta=0;
        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio();
        
        do {    
            System.out.println("-------MENU---------");
            System.out.println("1. Cargar Pelicula");
            System.out.println("2. Cargar Alquiler");
            System.out.println("3. Listar Pelicula");
            System.out.println("4. Listar Alquileres");
            System.out.println("5. Buscar Pelicula por titulo");
            System.out.println("6. Buscar Pelicula por genero");
            System.out.println("7. Calcular Servicio");
            System.out.println("8. Salir");
            System.out.println("Ingrese la opcion: ");
            op = leer.nextInt();
            
            
            switch(op){
                case 1: if(tp<5){
                             peli[tp] = ps.crearPelicula();
                             tp ++;
                             break;
                        }else{
                            System.out.println("No podes ingresar mas peliculas");
                            break;
                        }        
                case 2: if(ta<5){
                             alq[ta] = as.crearAlquiler();
                             ta ++;
                             break;
                        }else{
                            System.out.println("No podes ingresar mas alquileres");
                            break;
                        }  
                case 3: for (int i = 0; i < tp; i++) {
                            ps.mostrarPelicula(peli[i]);
                            System.out.println("");
                        }
                        leer.nextLine();
                        break;
                case 4: for (int i = 0; i < ta; i++) {
                            as.mostrarAlquiler(alq[i]);
                            System.out.println("");
                        }
                        leer.nextLine();
                        break;
                case 5: System.out.println("Ingrese el titulo de la pelicula a buscar: ");
                        String busq = leer.next();
                        boolean bool=false;
                        for (int i = 0; i < tp; i++) {
                            if(busq.equals(peli[i].getTitulo())){
                                bool = true;
                                break;
                            }
                        }
                        if(bool){
                            System.out.println("Se encontro la pelicula. ");
                        }else{
                            System.out.println("No se encontro la pelicula. ");
                        }
                        break;
                case 6:
                    System.out.println("Ingrese el genero de la pelicula a buscar: ");
                        String busq2 = leer.next();
                        boolean bool2=false;
                        for (int i = 0; i < tp; i++) {
                            if(busq2.equals(peli[i].getGenero())){
                                bool2 = true;
                                break;
                            }
                        }
                        if(bool2){
                            System.out.println("Se encontro la pelicula. ");
                        }else{
                            System.out.println("No se encontro la pelicula. ");
                        }
                        break;
                case 7: 
                    System.out.println("Ingrese el titulo de la pelicula a buscar: ");
                        String busq3 = leer.next();
                        
                        for (int i = 0; i < ta; i++) {
                            if(busq3.equals(alq[i].getPeliculaAlquilada())){
                               if(as.diferenciaDias(alq[i])>=3){
                                   System.out.println("El costo del servicio es: " + ((10 + (as.diferenciaDias(alq[i])-3)*0.1)));
                               }else{
                                   System.out.println("El costo es: $10 ");
                               }
                                break;
                            }
                        } 
                        break;
                case 8:
                    System.out.println("Gracias por utilizar nuestro servicio!!");
                    break;
                default:
                    System.out.println("Ha ingresado una opcion incorrecta. Intentelo de vuelta.");
                    
            }
            
        } while (op<7);
        
        
        
    }     
}
