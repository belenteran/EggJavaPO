/*
 * --- EJER 6 --
 * Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos 
con los parámetros que sean necesarios: 
 */
package Entidad;

public class Ahorcado {
    
    private int letras;
    private int jugadas;
    private String[] vec;
   
    public Ahorcado(String[] vec, int letras, int jugadas) {
        this.vec = vec;
        this.letras = letras;
        this.jugadas = jugadas;
    }
    
    public Ahorcado(){}
    
    //Getter y setter

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }
    
    
    
    
}
