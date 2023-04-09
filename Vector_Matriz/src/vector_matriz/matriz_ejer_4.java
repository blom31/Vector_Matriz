/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package vector_matriz;

/**
 *
 * @author blom3
 */
public class matriz_ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];

        relleno(matriz, n);
        imp_matrizOri(matriz, n);
        traspuesta(matriz, n);
    }

    public static void relleno(int matriz[][], int n) { //se rellena la matriz original
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void imp_matrizOri(int matriz[][], int n) { //se imprime la matriz original
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void traspuesta(int matriz[][], int n) {// se imprime matris traspuesta
        int i, j;
        for (j = 0; j < 4; j++) {
            for (i = 0; i < 4; i++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
