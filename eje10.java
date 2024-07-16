/*
Vamos a crear la lista de 6 Estudiantes
 */
package tema8;

import java.util.Scanner;

public class eje10 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String [] nombre =new String[6];
        for (int i = 0; i <6; i++) {
            System.out.print("ingrese el nombre: ");
            nombre[i]=entrada.next();
            
        }
        for (String a:nombre) {
            System.out.print("["+a+""+"]");
            
            
        }
        
    }
    
}
