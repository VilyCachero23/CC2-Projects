import java.util.Arrays;
public class Hahahha {
// Create a Program that  uses an array to store-
// these values: (3,9,15,20,65,23,18,4,2,14,21}
// the separate the even and odd numbers.
    //ACTIVITY #5
    // CACHERO, VILY KAYLLE G.
    

    public static void main(String[] args) {
        
       
        
        
        int [] array = {3,9,15,20,65,23,18,4,2,14,21};
        Arrays.sort(array);
        int [] odd = new int[array.length];
        int [] even = new int[array.length];
        
        int oddCount = 0;
        int evenCount = 0;
        
        
        for (int i = 0; i < array.length; i++) {
            
             
            if(array[i] % 2 <= 0) {
                even[evenCount] = array[i]; evenCount++;
                
                
                
            } else if(array[i] % 2 >= 0) {
                odd[oddCount] = array[i]; oddCount++;
            
            } else if(array[i] % 2 == 0) {
                odd [i] = array[i]; i++; 
            }
        
            
            
        }
        
        
            
        System.out.println("Odd \t Even");
        
        for (int i = 0; i < evenCount; i++) {
            System.out.println(odd[i]+"\t"+even[i]);
            
            
          
            
            
            
           
          
           
            
        }
    }
    
}
