package circle1;

//ACTIVITY 1 (CIRCLE)
//AREAS
import java.util.Scanner;
public class Circle1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kaylle = new Scanner(System.in);
        
        System.out.println("Enter Radius of the Circle ");
        double haha = kaylle.nextDouble();
        double carea = Math.PI*(Math.pow(haha, 2));
        
        System.out.println("The Area of the Circle is: " + carea);
        System.out.println("");
        System.out.println("Enter the Sides of the Square: ");
        double sid = kaylle.nextDouble();
        double vily = Math.pow(sid, 2);
        System.out.println("The Area of the Square is: " + vily);
        
        System.out.println("Enter the Base of the Triangle: ");
        double base = kaylle.nextDouble();
        System.out.println("Enter Height of the Triangle: ");
        double height = kaylle.nextDouble();
        double cachero = (base * height)/2;
        System.out.println("The Area of the Triangle is: " + cachero);
        
        
    }
    
}
