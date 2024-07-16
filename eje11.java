/*
 Pide al usuario por teclado una frase y pasa sus caracteres a un array de
caracteres. Puedes hacer con o sin métodos de String
 */
package tema8;

import java.util.Scanner;


public class eje11 {

  
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String frase;
        System.out.println("ingresa la frase: ");
        frase=entrada.next();
        int total=frase.length();
        char[] letra=new char[total];
        
        for (int i = 0; i <total; i++) {
            letra[i]=frase.charAt(i);
                
            
        }
        for(char a:letra){
            System.out.print(a+"-");
        }
    }
    
}
