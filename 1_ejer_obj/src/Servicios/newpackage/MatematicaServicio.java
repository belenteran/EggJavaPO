/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import Entidad.Matematica;

/**
 *
 * @author Belu
 */

/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class MatematicaServicio {
    
    public float devolverMayor(Matematica m1){
        return Math.max(m1.getN1(), m1.getN2());
    }
    public int calcularPotencia(Matematica m1){
        int num1, num2;
        num1 = Math.round(m1.getN1());
        num2 = Math.round(m1.getN2());
        if(num1>= num2){
            return (int) Math.pow(num1, num2);
        }else{
            return (int) Math.pow(num2, num1);
        }
    }
    public float calcularRaiz(Matematica m1){
        float min = Math.min(m1.getN1(), m1.getN2());
        return (float) Math.sqrt(Math.abs(min));
    }
}
