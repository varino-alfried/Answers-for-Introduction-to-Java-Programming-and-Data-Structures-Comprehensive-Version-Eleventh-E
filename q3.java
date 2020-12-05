package ch1;

public class q3
{

    public static void main(String[] args)
    {
        System.out.println("The program to display the population for each of the next five years.");
        long currentPopulation = 312032486;
        
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantRateInSeconds = 45.0;
        
        double secondsInYear = 365*24*60*60;
        
       double birthInYear = secondsInYear / birthRateInSeconds;
       double deathInYear = secondsInYear / deathRateInSeconds;
       double immigrantInYear = secondsInYear / newImmigrantRateInSeconds;
    
       for(int i=1;i<=5;i++)
       {
           currentPopulation += birthInYear + immigrantInYear - deathInYear;
           System.out.println(i+"the year population = "+currentPopulation);
       }
    }
    
}
