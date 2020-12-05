package ch2;
import java.util.*;
public class MiniProject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amount:");
        double investementAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate:");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/(12*100); //*100 to remove the percentage
        
        System.out.print("Enter number of years:");
        int numberOfYears = input.nextInt();
        
        double futureInvestementValue = (investementAmount) *( Math.pow( (1.0 + monthlyInterestRate), (numberOfYears * 12.0) ) );
       
        System.out.format("Accumulated value is %.2f \n",futureInvestementValue);
    
    }
    
}
