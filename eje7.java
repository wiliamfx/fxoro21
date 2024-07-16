/*
Ingrese 5 elementos de números por medio un array que lo suma:
 */
package tema8;

import java.util.Scanner;

public class eje7 {

  
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero[],suma=0;
        numero=new int[5];
        for (int i = 0; i <5; i++) {
            System.out.print("ingresa el numero: ");
            numero[i]=entrada.nextInt();
            suma+=numero[i];
            
        }
        System.out.println("la suma total de los 5 elementos es: "+suma);
    }
    
}
