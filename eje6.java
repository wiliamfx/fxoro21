/*
 Ingrese mediante un array la suma de 9 números
 */
package tema8;

import java.util.Scanner;


public class eje6 {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int numero[],suma=0;
       numero=new int[9];
        for (int i = 0; i <9; i++) {
            System.out.println("ingresa el numero: ");
            numero[i]=entrada.nextInt();
            suma+=numero[i];
            
        }
        System.out.println("la suma total de los 9 elementos es: "+suma);
       
    }
    
}
