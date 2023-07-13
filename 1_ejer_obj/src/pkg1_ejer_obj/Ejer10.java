
package pkg1_ejer_obj;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Belu
 */

/*-----------EJER 10 ---------------
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/
public class Ejer10 {

    public static void main(String[] args) {
      float[] a = new float[50];
      float[] b = new float[20];
 //     Random random = new Random();
      System.out.println("Arrays");
     
      
//      for (int i = 0; i < 50; i++) {
//            numeroAleatorio = random.nextFloat() * 100;
//             a[i] = Math.round(numeroAleatorio * 100) / 100.0f;
//         }

        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random()*10);
        }
     
      System.out.println("Arrays: " + Arrays.toString(a));
      
      Arrays.sort(a);
      System.out.println("Arrays A ordenado: " + Arrays.toString(a));
      
      Arrays.fill(b, 10, 20, 0.5f);
      
      System.arraycopy(a, 0, b, 0, 10);
      
//      for (int i = 0; i < 20; i++) {
//          if (i<10) {
//             b[i]= a[i];
//          } else {
//              b[i] = 0.5f;
//          }
//      }
      
        System.out.println("Array B: " + Arrays.toString(b));
      
    }
    
   
            
            
    
}
