package ch2;
import java.util.*;

public class q2_6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");  
        
        int number = input.nextInt();
        int numberLeft = number;
        int total = 1;
        
        for(int i=0;i<3;i++){
            
            total *= numberLeft%10;
            numberLeft = number/10;
        }
        
        System.out.println("The multiplication of all digits in "+number+" is "+total);
    }
    
}
