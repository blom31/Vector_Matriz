/*Realizar un algoritmo que llene un vector con los 10 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */
package vector_matriz;

/**
 *
 * @author blom3
 */
public class vector_ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int [] vector = new int [10];
        int i;
        /*(int) (Math.random()*10)*/
        for ( i = 0; i <10; i++) { //  FOR para rellenar un vector
            vector [i] = i;
        }   
        System.out.println("Impresión de un vector con los 10 primeros números enteros de forma descendente");  
       
        for (i = 9; i >= 0; i--) { //FOR para mostrar un vector
              System.out.println("[" +  vector [i] + "]");
          }  
            System.out.println("");
        
        
        
        
    }
    
}
