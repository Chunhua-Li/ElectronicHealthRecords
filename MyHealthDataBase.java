package assignment1task;

/**
* MyHealthDataBase is a base class to be extended for the Electronic
* Health Records (EHR) System,It contains a method to calculate BMI, 
* a method to calculate maximum heart rate, minimum target heart rate
* maximum target heart rate.
* @author Daniel Cormier
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

public class MyHealthDataBase
{
   
    /* This method is a wrong method of calculating BMI of a patient,
     * just to test the junit method.
     * 
     */
    public double incorrectCalculateBMI(double weightParam, double heightParam)
    {
        return weightParam *703 / (heightParam * heightParam);
    }
    
}