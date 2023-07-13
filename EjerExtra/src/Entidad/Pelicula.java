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
public class Pelicula {
    private String titulo;
    private String genero;
    private Date fecha;
    private double duracion;
    
    //constructores

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, Date fecha, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
    }
    //getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
}
