/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*---------------Ejer 1 -----------------
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package Entidad;

/**
 *
 * @author Belu
 */
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int nro_pag;
    //Contructores
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nro_pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nro_pag = nro_pag;
    }
    //Getter y Setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNro_pag() {
        return nro_pag;
    }

    public void setNro_pag(int nro_pag) {
        this.nro_pag = nro_pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nro_pag=" + nro_pag + '}';
    }
    
    
    
}
