
package pkgswitch.calculator;

import java.util.Scanner;

//activity number 2 switch calculator
public class SwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kyle = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int a = kyle.nextInt();
        
        System.out.println("Enter another Number: ");
        int b = kyle.nextInt();
        
        System.out.println("Enter an Operation: ");
        String o = kyle.next();
        
        switch(o){
            
            case("+"):
            case("add"):
                System.out.println(a+b);
                break;
                
            case("-"):
            case("subtract"):
                System.out.println(a-b);
                break;
            
            case("*"):
            case("multiply"):
                System.out.println(a*b);
                break;
                
            case("/"):
            case("divide"):
                System.out.println(a/b);
                break;
                
            case("%"):
            case("modulo"):
                System.out.println(a%b);
                break;
                
                
            default:
                System.out.println("the number that you have entered is invalid");
            
                
                
        }
        
        
    }
    
}
