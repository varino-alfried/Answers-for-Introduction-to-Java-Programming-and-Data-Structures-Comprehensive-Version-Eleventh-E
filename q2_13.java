package ch2;
import java.util.*;

public class q2_13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextInt();
    
        double monthlyInterestRate = 0.003125;
        
        double currentAmount = 0;
        double newAmount = 0;
        for(int i=1;i<=12;i++){
            
            currentAmount = (savingAmount + newAmount) * (1.0 + monthlyInterestRate);
            
            newAmount = currentAmount;
            
            System.out.println("After the "+i+"th month, the account value is "+newAmount);
            
            
        }
        
        
    }
    
}
