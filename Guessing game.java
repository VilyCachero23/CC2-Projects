import java.util.Scanner;

//Guessing Game//
public class javaapplication2 {
    
    public static void main(String[]args){
        Scanner vily = new Scanner(System.in);
       
        int a = 0;
        int attempts = 0;
        
        System.out.println("Enter a number");
        int n = vily.nextInt();
         
        int b = n&a;
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        while(a!=n){
            attempts++;
        System.out.println("Guess the Number: ");
        if(n % 2 ==0){
            System.out.println("HINT: It's an Even Number");
        } 
        else {
        System.out.println("HINT: It's an Odd Number");
        }
        a = vily.nextInt();
        if(a>n){
            System.out.println("HINT: LOWER!!!!");
        }
        else if (a<n){
            System.out.println("HINT: HIGHER");
        }
        if (n==a){
            System.out.println("Excellent! You have Succesfully Guessed the Number.");
            
            System.out.println("attempts: "+attempts);
            
            
        }
        
}
}
    }