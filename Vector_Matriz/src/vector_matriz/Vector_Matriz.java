/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_matriz;

/**
 *
 * @author blom3
 */
public class Vector_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector = new int [5];
        int i;
        /*(int) (Math.random()*10)*/
        for ( i = 0; i < 5; i++) { //  FOR para rellenar un vector
            vector [i] = (int) (Math.random()*10);
        }   
          for (i = 0; i < 5; i++) { //FOR para mostrar un vector
              System.out.println("[" + vector [i] + "]");
          }  
            System.out.println("");
        
        
        
        
        
    }
    
}
