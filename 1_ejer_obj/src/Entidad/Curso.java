/*----Ejer 13---------*/
package Entidad;

import java.util.Scanner;


/**
 *
 * @author Belu
 */
public class Curso {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private float precioPorHora;
    private String[] alumno;
   //constructores
    
    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasPorSemana, String turno, float precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }
    
    //getter y setter

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    
  
    
      
}
