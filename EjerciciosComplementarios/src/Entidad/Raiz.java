/*
 * ---EJER 3---
 */
package Entidad;

/**
 *
 * @author Belu
 */
public class Raiz {
    private int a;
    private int b;
    private int c;
    
    //Constructor

    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Raiz(){}
    
    public int getA(){
        return a;
    }
    
    public void setA(int a){
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}