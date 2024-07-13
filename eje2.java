/*
Realizar un Arreglo que permite ingresar valores según la tabla:
*/

package tema8;


public class eje2 {

   
    public static void main(String[] args) {
        int [] fila=new int[3];
        int[]columna=new int[3];
        for (int i = 0; i <3; i++) {
            fila[i]=i;
            for (int j = 0; j <3; j++) {
                columna[j]=j;
            }
        }
        int contador=1;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
               
                    System.out.println("el valor de i: "+fila[i]+" j: "+columna[j] + " valor "+(contador++));
                      
            }
            
        }
        
        
   
    }
    
}
