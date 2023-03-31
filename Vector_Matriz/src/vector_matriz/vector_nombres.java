/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_matriz;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class vector_nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//declaracion del vector  de tipo String
      String [] equipo = new String [5]; 
        
        String nombre;
        int i;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese por favor los nombres de losi ntegrantes de su equipo");
        
        for (i = 0; i < equipo.length; i++) { // FOR para asignar valores al vector por teclado de tipo carácter
            System.out.println("Integrante nro "+i);
            nombre = leer.next();
            equipo [i] = nombre;            
        }
        
        for (i = 0; i < equipo.length; i++) {
            System.out.println("[" + equipo[i] + "]");
            
        }
        
        
    }
    
}
