/*
 Ingrese 5 números mediante un array y realice una búsqueda secuencial.
 */
package tema8;

import java.util.Scanner;


public class eje4 {

    
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
       int array[],nu,total;
       System.out.println("ingrese el total de elementos en el array: ");
       total=entrada.nextInt();
       array=new int[total];
        for (int i = 0; i <total; i++) {
            System.out.print((i+1)+"ingresa el nuemero: ");
            array[i]=entrada.nextInt();
        }
        System.out.println("ingresa el numero a buscar de fomra secuencial: ");
        nu=entrada.nextInt();
        boolean busqueda=false;
        for (int i = 0; i <total; i++) {
            if (array[i]==nu){
                busqueda=true;
                System.out.println("se encontro el array");
                break;
            }
            
        }
        if (busqueda) {
            System.out.println("se encontro el array");
            
        }
        else{
            System.out.println("no se encontro");
        }
    }
    
}
