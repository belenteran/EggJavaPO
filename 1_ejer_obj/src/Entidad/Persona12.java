/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Belu
 */
public class Persona12 {
     private String nombre;
    private Date fecNac;
    
    //constructores
    
    public Persona12() {
    }

    public Persona12(String nombre, Date fecNac) {
        this.nombre = nombre;
        this.fecNac = fecNac;
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

}
