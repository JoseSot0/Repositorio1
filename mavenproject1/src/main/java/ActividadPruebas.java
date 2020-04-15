

/**
 *
 * @author joses
 */
import java.util.Scanner;
import java.util.Arrays;
public class ActividadPruebas {
    
    
    
     
    
    public static void main(String[] args) { 
        
        
    int[] numero = new int[15];
    
    Scanner p = new Scanner(System.in); 
    
    
    for(int i=0;i<15;i++){
        System.out.print("Introduzca Numero: "); 
        
           numero[i] = p.nextInt();
    }

   System.out.println("Los numeros son:\n" + Arrays.toString(numero));
    }
     
}
