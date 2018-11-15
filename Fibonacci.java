package fibonacci;

//ACTIVITY 1 (FINALS)
// Vily Kaylle G. Cachero
import java.util.Scanner;
public class Fibonacci {
    static int nacci(int n){
        if(n <= 0 || n <= 1)
            return n;
        else{ return nacci (n-1)+ nacci(n-2);
     
    }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Enter a Number : ");
        int vily = sc.nextInt();
        for(int a = 0; a <= vily; a++){
            System.out.print("f(" + a + ") \t");
        }
        System.out.println("");
        
        for(int a = 0; a < vily + 1; a++){
            for(int b = 0; b < a + 1; b++){
                System.out.print( nacci(b) + "\t" );
            }
            System.out.println("");
            
            
    
        
    }
    
}
}