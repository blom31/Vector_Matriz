/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
 */
package vector_matriz;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class vector_ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        int i, num;

        Scanner leer = new Scanner(System.in);
        for (i = 0; i < 5; i++) { //  FOR para rellenar un vector
            vector[i] = (int) (Math.random() * 10); // función ramdon para rellenar el código
        }
        System.out.println("Impresión de un vector con dimensión 5 relleno de forma aleatoria");
        for (i = 0; i < 5; i++) { //FOR para mostrar un vector
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Ingrese el número a buscar");
        num = leer.nextInt();
        for (i = 0; i < 5; i++) {
            if (vector[i] == num) {
                System.out.println("El número esta en la posición " + i);

            }

        }

    }
}
