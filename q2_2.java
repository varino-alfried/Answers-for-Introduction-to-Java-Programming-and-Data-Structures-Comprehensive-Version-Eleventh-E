package ch2;
import java.util.*;

public class q2_2 {

    public static void main(String[] args) {
        System.out.println("This program reads in the length of " +
            "sides of an equilateral triangle and computes the area and volume");
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter the length of the side: ");
        double length = input.nextDouble();
        
        double area = ((Math.pow(3.0 , 0.5 ))/4)*(Math.pow(length, 2));
   
        double volume = area * length;
    
        System.out.println("The area is "+area);
        System.out.println("The volume of the Triangular prism is "+volume);
    }
    
}
