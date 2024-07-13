/*
Crea un array de números de 100 posiciones, que contendrá los
números del 1 al 100. Obtén la suma de todos ellos y la media.

*/
package tema8;

import java.util.Scanner;

public class eje17 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int total;
        int suma=0;
        System.out.println("ingresa el total de elementos: ");
        total=entrada.nextInt();
        int[] nu=new int[total];
        for (int i = 0; i <total; i++) {
            System.out.println("ingresa el numero: ");
            nu[i]=entrada.nextInt();
            suma+=nu[i];
            
        }
        for (int a:nu) {
            System.out.print(a+"-");
     
            
        }
        System.out.println("la suma total es: "+suma);
        
        
    }
    
}
