/*
Ingrese 5 números desordenados mediante un array y muestre su orden.
 */
package tema8;

import java.util.Arrays;
import java.util.Scanner;

public class eje5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int [] numero=new int[5];
        for (int i = 0; i <5; i++) {
            System.out.print((i+1)+ " ingresa el numero: ");
            numero[i]=entrada.nextInt();
            
            
        }
        Arrays.sort(numero);
        System.out.println("la lista ordenada es");
        for (int a:numero) {
           
            System.out.print(a+"-");
            
        }
    }
    
}
