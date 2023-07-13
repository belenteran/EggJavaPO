/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_ejer_obj;

import Entidad.Cuenta;
import Servicios.newpackage.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Belu
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    
    /*------------EJER 5 ------------------
        Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
      
        System.out.println("-------INGRESO DINERO----------");
        System.out.println("Saldo actual: " + c1.getSaldoActual());
        System.out.println("Ingrese el monto a ingresar: ");
        double monto = leer.nextDouble();
        System.out.println("El saldo actual es : " + cs.ingresar(monto, c1));
        System.out.println("--------------------------------");
        leer.next();
        
        System.out.println("-------EXTRAER DINERO----------");
        System.out.println("Saldo actual: " + c1.getSaldoActual());
        System.out.println("Ingrese el monto a retirar: ");
        double monto2 = leer.nextDouble();
        System.out.println("El saldo actual es : " + cs.retirar(monto2, c1));
        System.out.println("--------------------------------");
        leer.next();
       
        System.out.println("" + cs.extraccionRapida(c1));
        System.out.println("--------------------------------");
        leer.next();
       
        cs.consultarSaldo(c1);
        System.out.println("--------------------------------");
        leer.next();
        cs.consultarDatos(c1);
        System.out.println("--------------------------------");
        leer.next();
        
        
        
        
        
    }
    
}
