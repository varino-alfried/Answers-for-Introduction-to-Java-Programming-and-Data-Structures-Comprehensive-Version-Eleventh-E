package ch1;
public class q4 
{
    public static void main(String[] args)
    {
        System.out.println("This program displays the average speed in kilometers per hour.");
        
        double distanceInKilometers = 24 * 1.6;
        double timeInMinutes = (1 * 60.0) + (40) + (35 / 60.0) ;
        
        double averageSpeed = 60.0 * distanceInKilometers / timeInMinutes;
   
        System.out.println("The average speed of the runner is "+averageSpeed+" Kilometers in hour");
    }
    
}
