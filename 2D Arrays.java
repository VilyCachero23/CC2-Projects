
package pkg2d.arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Eneter Number of Rows: ");
        int a = sc.nextInt();
        
        System.out.println("Enter number of Columns: ");
        int b = sc.nextInt();
        
        String [][]names = new String[a][b];
           
        for(int kaylle = 0; kaylle < a; kaylle++){
            for(int vily = 0; vily < b; vily++){
                System.out.println("row " + kaylle + " column " + vily + ": " );
                String c = sc.next();
                
                names [kaylle][vily]= c; 
            }
        }
        
        System.out.println("\n\n\n\n\n\n\n\n\n");
        
        
        for(int i = 0; i < names.length; i++) {
            for(int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j] + "\t");

        }
        
        System.out.println("");
        
    
    
    }
    }
}