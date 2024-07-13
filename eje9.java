/*
 Ingrese 5 elementos donde muestre su código, nombre y edad mediante un
array:
 */
package tema8;

import java.util.Scanner;

public class eje9 {


    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        
        String [] codigo=new String[5];
        String[] nombre =new String[5];
        String[] edad=new String[5];
        for (int i = 0; i <2; i++) {
            System.out.println("ingresa el codigo: ");
            codigo[i] =entrada.next();
            System.out.println("ingrese el nombre: ");
            nombre[i] =entrada.next();
            System.out.println("ingrese la edad: ");
            edad[i] =entrada.next();
              
            
        }
        for (int i = 0; i <5; i++) {
            System.out.println("[Codigo:"+codigo[i]+"-Nombre:"+nombre[i]+"-Edad: "+edad[i]+"]");
            
        }
        
        
    }
    
}
