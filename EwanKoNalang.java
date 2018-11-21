package ewan.ko.nalang;

import java.util.Scanner;
public class EwanKoNalang {
    
    //CACHERO,VILY KAYLLE DE GUZMAN
    //finals FINAL ACTIVITY!!!!!!!!!!
    //CC2 ACTIVITY

    public static void main(String[] args) {
        
        userInput();
        
    }
    
    static int fibonacci(int n){
        
        if(n <= 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    static int factorial(int n){
        
        if(n <= 1){
            return 1;
            
        } else{
            return n*factorial(n-1);
        }
       
    }
    
    static String userInput(){
        
        Scanner kaylle = new Scanner(System.in);
        System.out.println("Choose Between Fibonacci or Factorial: ");
        String input = kaylle.nextLine();
        
        if(input.equals("fibonacci")){
            
            fibo1();
        
            
        }else if(input.equals("factorial")){
        
            fact1();
        
        
        }else{
            System.out.println("Invalid Input");
            return userInput();
        }      
        return null;
    }
        
       
    static void fibo1(){
        
        Scanner sc = new Scanner(System.in);
        int e = arraySize();
        
        int[] array = new int[e];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element of " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("f(" + array[i]+  ")\t");
        }
        
        System.out.println("\n\n\n\n\n Fibonacci \n");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(fibonacci(array[i]) + "\t");
        }
    }
    
    static void fact1(){
      Scanner sc = new Scanner(System.in);
        int e = arraySize();
        
        int[] array = new int[e];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element of " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("f(" + array[i]+  ")\t");
        }
        
        System.out.println("\n\n\n\n\n Factorial \n");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(factorial(array[i]) + "\t");
        }
       
    }
    
    
    static int arraySize(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int a = input.nextInt();
        return a;
         
        
    }
    
        
    
        
}
        
    



    
    
    



        
        
    



    

    
    



