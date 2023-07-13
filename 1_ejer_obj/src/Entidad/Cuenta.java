/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.math.BigInteger;

/**
 *
 * @author Belu
 */
public class Cuenta {
    private int nroCuenta, saldoActual;
    private BigInteger dni;
    
    //Constructores

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, int saldoActual, BigInteger dni) {
        this.nroCuenta = nroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }
    //GEtter y Setter

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigInteger getDni() {
        return dni;
    }

    public void setDni(BigInteger dni) {
        this.dni = dni;
    }
    
    
    
    
}
