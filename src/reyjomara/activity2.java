package reyjomara;
import java.util.Scanner;
public class activity2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        if(num == 0) {
            System.out.println("Inputted number is Zero"); 
        }else if(num%2 == 0) {
            System.out.println("Inputted number is even");
        }else{
            System.out.println("Inputted number is odd");
        }
    }
}
