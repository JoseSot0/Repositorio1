

/**
 *
 * @author joses
 */
import java.util.Scanner;
import java.util.Arrays;
public class ActividadPruebas {
    
    
    
     
    
    public static void main(String[] args) { 
        
        
    int[] numero = new int[10];
    
    Scanner a = new Scanner(System.in); 
    
    
    for(int i=0;i<10;i++){
        System.out.print("Mete los numeros: "); 
        
           numero[i] = a.nextInt();
    }

   System.out.println("Los numeros son:\n" + Arrays.toString(numero));
    }
     
}
