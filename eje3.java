/*
 Ingrese 10 números mediante un array y realice una busqueda según el
ordenado
 */
package tema8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class eje3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero[],total,nu;
        total=Integer.parseInt(JOptionPane.showInputDialog("ingrese el total de elementos: "));
        numero = new int[total];
        for (int i = 0; i <total; i++) {
            System.out.print("ingresa el numero "+(i+1)+": ");
            numero[i]=entrada.nextInt();
            
        }
        System.out.println("ingresa el numero a buscar: ");
        nu=entrada.nextInt();
        boolean encontrado=false;
        for (int i = 0; i <total; i++) {
            if(numero[i]==nu){
                encontrado=true;
                break;
                
            }
        }
        if (encontrado){
            System.out.print("el numero: " +nu+ "se ecnuentra en el array");
        }
        else{
            System.out.print("el numero: "+nu+"no se ecnuentra en el array");
        }
      
           
         
            
        
        
            
            
        
     
        
        
    }
    
}
