/*Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package vector_matriz;

/**
 *
 * @author blom3
 */
public class matriz_ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int [][] matrizO = new int[n][n];
        int [][] matrizAT = new int [n][n];
        
        System.out.println("MATRIZ ORIGINAL");
        rellenoMatrizO(matrizO,n);
        mostrarMatrizO(matrizO,n);
        
        System.out.println("");
         System.out.println("MATRIZ TRASPUESTA");
        trasporner(matrizO,matrizAT,n);
        
        System.out.println("");
        System.out.println("¿La Matriz es Antisimétrica? ");
        
        verificar(matrizO, matrizAT, n);
       
    }
    public static void rellenoMatrizO(int [][]matrizO, int n){
        int i;
        
        for (int[] fila: matrizO) {
            for (i=0; i< fila.length; i++) {
            fila [i]= (int) (Math.random()*20-10);
            }
        }
    }
    public static void mostrarMatrizO(int [][] matrizO,int n){
               
        for (int[] fila:matrizO){
            for(int elemento:fila){
            System.out.print("[" + elemento + "]");
            }
            System.out.println("");
        }
    }
    public static void trasporner(int [][]matrizO,int[][]matrizAT,int n){
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                matrizAT[i][j]= (matrizO[i][j]*-1);
                System.out.print("["+matrizAT[i][j]+"]"); 
            }
            System.out.println("");
        }
    }
    public static void verificar(int [][]matrizO, int [][] matrizAT,int n){
        
        
    }
}
