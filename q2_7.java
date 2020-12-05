package ch2;
import java.util.*;
public class q2_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minute: ");

        long minutes = input.nextLong();
        
        double days = minutes / 60 / 24 ;
        
        double years = days / 365;
        
        double remainingDays = days % 365;
        
        System.out.println(minutes + " minutes is approximately "+ (int)years +" years "+ (int)remainingDays +" days .");
        
    }
    
}
