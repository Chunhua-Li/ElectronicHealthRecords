package assignment1task;

/** This class displays the health information about a patient. 
 * @author Chunhua Li
 * @version 1.0
 * @since Amozon corretto 17.0.8.1
 * @see MyHealthDataTest
 * @see MyHealthDataBase
 * 
 * */

public class MyHealthData extends MyHealthDataBase
{
	/**
	 * firstName First name of the patient.
	 */
	private String firstName;
	/**
	 * lastName Last name of the patient.
	 */
	private String lastName;
	/**
	 * gender Gender of the patient.
	 */
	private String gender;
	/**
	 * birthYear The birth year of the patient.
	 */
	private int birthYear; 
	/**
	 * currentYear The current year of recording the health data 
	 * of the patient.
	 */
	private int currentYear;
	/**
	 * height Height of the patient.
	 */
	private double height; 
	/**
	 * weight Weight of the patient.
	 */
	private double weight;
	
	/**
	 * This constructor sets first name, last name, gender, height,
	 * weight, birth of year and current year as passed.
	 * @param firstNameParam First name of the patient.
	 * @param lastNameParam Last name of the patient.
	 * @param genderParam Gender of the patient.
	 * @param heightParam Height of the patient.
	 * @param weightParam Weight of the patient.
	 * @param birthYearParam Birth year of the patient.
	 * @param currentYearParam The current year of recording the health data of the patient.
	 */

    public MyHealthData(String firstNameParam, String lastNameParam, 
    		String genderParam, double heightParam,	double weightParam, 
    		int birthYearParam, int currentYearParam) 
    {
	firstName = firstNameParam;
	lastName = lastNameParam;
	gender = genderParam;
	birthYear = birthYearParam;
	currentYear = currentYearParam;
	height = heightParam;
	weight = weightParam;
    }
	/**
	 * Returns first name of the patient.
	 * @return returns first name of the patient.
	 */
    public String getFirstName() 
    {    	
    	return firstName;
    }
    /**
     * Set first name of the patient.
     * @param firstNameParam First name of the patient.
     */
    public void setFirstName(String firstNameParam) 
    {
    	firstName = firstNameParam;
    }
    /**
     * Returns last name of the patient.
     * @return Returns last name of the patient.
     */
    public String getLastName() 
    {
    	return lastName;
    }
    /**
     * Sets last name of the patient.
     * @param lastNameParam Last name of the patient.
     */
    public void setLastName(String lastNameParam) 
    {
    	lastName = lastNameParam;
    }
    /**
     * Returns gender of the patient.
     * @return Returns gender of the patient.
     */
    public String getGender() 
    {
    	return gender;
    }
    /**
     * Sets gender of the patient.
     * @param genderParam Gender of the patient.
     */
    public void setGender(String genderParam) 
    {
    	gender = genderParam;
    }
    /**
     * Returns birth year of the patient.
     * @return Returns birth year of the patient.
     */
    public int getBirthYear() 
    {
    	return birthYear;
    }
    /**
     * Sets birth year of the patient.
     * @param birthYearParam Birth year of the patient.
     */
    public void setBirthYear(int birthYearParam) 
    {
    	birthYear = birthYearParam;
    }
    /**
     * Returns current year recording the health date of the patient at the first time.
     * @return current year recording the health date of the patient at the first time.
     */
    public int getCurrentYear()
    {
    	return currentYear;  	
    }
    /**
     * Returns height of the patient.
     * @return Height of the patient.
     */
    public double getHeight() 
    {
    	return height;
    }
    /**
     * Sets height of the patient.
     * @param heightParam Height of the patient.
     */
    public void setHeight(double heightParam) 
    {
    	height = heightParam;
    }
    /**
     * Returns weight of the patient.
     * @return Returns weight of the patient.
     */
    public double getWeight() 
    {
    	return weight;
    }
    /**
     * Sets weight of the patient.
     * @param weightParam Weight of the patient.
     */
    public void setWeight(double weightParam) 
    {
    	weight = weightParam;
    }
    /**
     * Returns age of the patient.
     * @return Returns age of the patient.
     */
    public int getAge() 
    {
    	int age = currentYear - birthYear;
    	return age;
    }
    /**
     * This method calculates the maximum heart rate of the patient
     * from the age provided.
     * It return the maximum heart rate of the patient.
     * @param age  age Age of the patient.
     * @return Returns the maximum heart rate of the patient.
     */
    public int maximumHeartRate(int age) 
    {
    	int maximumHeartRate = 220- age;
    	return maximumHeartRate;
    }
    /**
     * This method calculates the minimum target heart rate of the patient
     * from the maximum heart rate provided.
     * It returns the minimum target heart rate of the patient.
     * @param maximumHeartRate Maximum Heart Rate of the patient.
     * @return Returns the minimum target heart rate of the patient.
     */
    public int minimumTargetHeartRate(int maximumHeartRate)
    {
    	int minimumTargetHeartRate = maximumHeartRate/2;
    	return minimumTargetHeartRate;
    }
    /**
     * This method calculates the maximum target heart rate of the patient
     * from the maximum heart rate provided.
     * It returns the maximum target heart rate of the patient. 
     * @param maximumHeartRate Maximum Heart Rate of the patient.
     * @return Returns the maximum target heart rate of the patient.
     */
    public int maximumTargetHeartRate (int maximumHeartRate)
    {
    	int maximumTargetHeartRate = 85 * maximumHeartRate /100;
    	return maximumTargetHeartRate;
    }
    
    /** 
     * This method calculates and returns the Body Mass Index (BMI) 
     * of a patient from data provided.
     * @param weightParam Weight of the patient in kilograms.
     * @param heightParam Height of the patient in meters.    
     * @return Returns BMI value of the patient. 
     */
 	
     public double calculateBMI(double weightParam, double heightParam)
     {
         return weightParam / (heightParam * heightParam);
     }
    
    /**
     * Outputs first name, last name, gender, birth year, height,
     * weight, age, BMI value, maximum heart rate, minimum target heart rate
     * and maximum heart rate of the patient.
     * Also displays the BMI ranges indicating of underweight, normal, overweight
     *  and obese for reference.
     */
	public void displayMyHealthData() 
    {   		
		System.out.printf("First name: %s%n", getFirstName());		
		System.out.printf("Last name: %s%n",getLastName());
		System.out.printf("Gender: %s%n",getGender());
		System.out.printf("Year of birth: %d%n",getBirthYear());
		System.out.printf("Height: %.1f%n",getHeight());
		System.out.printf("Weight: %.2f%n",getWeight());
		System.out.printf("Age in years:%d%n",getAge());
		System.out.printf("BMI: %.1f%n",calculateBMI(getWeight(),getHeight()));
		System.out.printf("Maximmum Heart Rate: %d%n",maximumHeartRate(getAge()));
		System.out.printf("Target heart rate range (MininumHeartRate ~ MaximumHeartrate): %d ~ %d%n",
				minimumTargetHeartRate(maximumHeartRate(getAge())),maximumHeartRate(getAge()));
		
       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

} 
