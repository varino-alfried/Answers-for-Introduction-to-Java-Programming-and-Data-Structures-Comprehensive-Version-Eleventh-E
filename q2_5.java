package ch2;
import java.util.*;

public class q2_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = gratuityRate/100 * subTotal;
        double total = gratuity + subTotal;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total );
        
    }
    
}
