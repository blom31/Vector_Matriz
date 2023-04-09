/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package vector_matriz;

/**
 *
 * @author blom3
 */
public class vector_ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        int i, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        String num;

        for (i = 0; i < vector.length; i++) { //  FOR para rellenar un vector
            vector[i] = (int) (Math.random() * 9999 + 1);
            System.out.println("[" + vector[i] + "]");
        }
        for (i = 0; i < vector.length; i++) {
            num = Integer.toString(vector[i]);
            switch (num.length()) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Hay " + cont1 + " elementos con 1 digito");
        System.out.println("Hay " + cont2 + " elementos con 2 digitos");
        System.out.println("Hay " + cont3 + " elementos con 3 digitos");
        System.out.println("Hay " + cont4 + " elementos con 4 digitos");
        System.out.println("Hay " + cont5 + " elementos con 5 digitos");
    }
}

/*int[] vector = new int[10];
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < 10; i++) {
            vector[i]=(int)(Math.random()*99999+1);
        }
        
        for(int elemento: vector){
            if(elemento <= 99999 && elemento >= 10000){
                cont5++;
            }else if(elemento <= 9999 && elemento >= 1000){
                cont4++;
            }else if(elemento <= 999 && elemento >= 100){
                cont3++;
            }else if(elemento <= 99 && elemento >= 10){
                cont2++;
            }else{
                cont1++;
            }
        }
        
        System.out.println("Hay "+cont1+" numeros con 1 digito.");
        System.out.println("Hay "+cont2+" numeros con 2 digito.");
        System.out.println("Hay "+cont3+" numeros con 3 digito.");
        System.out.println("Hay "+cont4+" numeros con 4 digito.");
        System.out.println("Hay "+cont5+" numeros con 5 digito.");
    }*/

 /*int[] vector = new int[10];
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < 10; i++) {
            vector[i]=(int)(Math.random()*99999+1);
            System.out.println(vector[i]);
        }
        
        for(int elemento: vector){
            switch(String.valueOf(elemento).length()){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        
        System.out.println("Hay "+cont1+" numeros con 1 digito.");
        System.out.println("Hay "+cont2+" numeros con 2 digito.");
        System.out.println("Hay "+cont3+" numeros con 3 digito.");
        System.out.println("Hay "+cont4+" numeros con 4 digito.");
        System.out.println("Hay "+cont5+" numeros con 5 digito.");
    }*/
