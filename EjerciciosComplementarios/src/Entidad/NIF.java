/* -----EJER 4 ---
 * 
 */
package Entidad;

import java.math.BigInteger;

/**
 *
 * @author Belu
 */
public class NIF {
    private long dni ;
    private String letra;
    
    //constructor
    
    public NIF(){}

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }
    
    
    //getter y setter
    public long getDni(){
        return dni;
    }
    public void setDni(long dni){
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
