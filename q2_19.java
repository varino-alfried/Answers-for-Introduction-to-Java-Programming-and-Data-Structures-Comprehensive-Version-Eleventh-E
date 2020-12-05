package ch2;
import java.util.*;

public class q2_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the coordinates of three points separated by spaces");
        
        //Triangle points
        System.out.print("like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        //getting sides of triangle
        double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2),0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3),0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2),0.5);
        
        double s = (side1 + side2 + side3)/2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.format("The area of the triangle is %.1f \n",area);
    }
    
}
