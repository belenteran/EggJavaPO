/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Cuenta;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta crearCuenta(){
        
        System.out.println("Ingrese el numero de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        BigInteger dni = leer.nextBigInteger();
        System.out.println("Ingrese el saldo actual: ");
        int saldo = leer.nextInt();
        
        return new Cuenta(numCuenta, saldo, dni);
    }
   
    public double ingresar(double ingreso, Cuenta c1 ){
        
        c1.setSaldoActual((int) (double) (ingreso + c1.getSaldoActual()));
        return c1.getSaldoActual();
    }
    
    /** Realiza el retiro de dinero de la cuenta
     * @param retiro 
     * @param c1
     * @return c1.getSaldoActual
     */
    public double retirar(double retiro,  Cuenta c1){
        if(retiro >= c1.getSaldoActual()){
            c1.setSaldoActual(0);
            return c1.getSaldoActual();
        }else{
            c1.setSaldoActual((int) (c1.getSaldoActual()-retiro));
            return c1.getSaldoActual();
        }
    }
    
    public double extraccionRapida(Cuenta c1){
        System.out.println("-----------EXTRACCION RAPIDA ----------- ");
        System.out.println("** No puede sacar mas del 20% de su saldo **");
        System.out.println("Su saldo es: " + c1.getSaldoActual());
        System.out.println("¿Cuanto desea extraer?");
        double monto = leer.nextDouble();
        
        if(monto>0.2*c1.getSaldoActual()){
            System.out.println("NO PUEDE SACAR ESA CANTIDAD");
            return c1.getSaldoActual();
        }else{
            System.out.println("Ha retirado:  $" + monto );
            c1.setSaldoActual((int) (c1.getSaldoActual() - monto));
            return c1.getSaldoActual();
        }
        
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println("--------CONSULTAR SALDO ----------");
        System.out.println("Su saldo es: " + c1.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println("--------CUENTA-----------");
        System.out.println("Numero de cuenta es: " + c1.getNroCuenta());
        System.out.println("DNI: " + c1.getDni());
        System.out.println("Saldo Actual: $" + c1.getSaldoActual() );
        
    }
}
