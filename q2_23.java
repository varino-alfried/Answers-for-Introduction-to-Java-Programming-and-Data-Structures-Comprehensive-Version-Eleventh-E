package ch2;
import java.util.*;

public class q2_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        System.out.println("Enter the price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        double costOfDriving = (drivingDistance/milesPerGallon)*pricePerGallon;
        System.out.format("The cost of driving is $%.2f \n",costOfDriving);
    }
    
}
