/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class NIFServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
   /* Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. */
    public NIF crearNif(){
        NIF n1 = new NIF();
        System.out.println("Ingrese el DNI: ");
        n1.setDni(read.nextLong());
        String[] l = new String[23];
        l[0] = "T";
        l[1] = "R";
        l[2] = "W";
        l[3] = "A";
        l[4] = "G";
        l[5] = "M";
        l[6] = "Y";
        l[7] = "F";
        l[8] = "P";
        l[9] = "D";
        l[10] = "X";
        l[11] = "B";
        l[12] = "N";
        l[13] = "J";
        l[14] = "Z";
        l[15] = "S";
        l[16] = "Q";
        l[17] = "V";
        l[18] = "H";
        l[19] = "L";
        l[20] = "C";
        l[21] = "K";
        l[22] = "E";
        
        int i;
        i = (int) (n1.getDni() % 23);
        System.out.println("i: " + i);
        n1.setLetra(l[i]);
        
        return n1;
    }
    
    
    
    public void mostrar(NIF n1){
        
        String documento = String.valueOf(n1.getDni());
        if(documento.length()<8){
            for (int i = 0; i < (8 - documento.length()); i++) {
                System.out.print("0");
            }
        }
        System.out.print(n1.getDni() + "-" + n1.getLetra());
        System.out.println(" ");
    }
    
    
}
