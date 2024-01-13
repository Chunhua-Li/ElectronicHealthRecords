package assignment1task;

/** This class inputs and outputs health data of a patient.
 * @author Chunhua Li
 * @version 1.0
 * @since Amozon corretto 17.0.8.1
 * @see java.util.Scanner
 * */
import java.util.Scanner;
import java.time.LocalDate;
public class MyHealthDataTest {

	public static void main(String[] args) 
	{
		LocalDate currentdate = LocalDate.now();				
	   int currentYearParam = currentdate.getYear();
	   
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("please enter first name:");
	   String firstNameParam = keyboard.next();
	   System.out.println("please enter last name:");
	   String lastNameParam = keyboard.next();
	   System.out.println("please enter gender:");
	   String genderParam = keyboard.next();	
	   System.out.println("please enter height(in meters):");
	   double heightParam = keyboard.nextDouble();
	   System.out.println("please enter weight(in kilograms):");
	   double weightParam = keyboard.nextDouble();
	   System.out.println("please enter year of birth:");
	   int birthYearParam = keyboard.nextInt();	   
	   nextLine();
	 
	  MyHealthData pHealthData = new MyHealthData(firstNameParam,lastNameParam,
			  genderParam,heightParam,weightParam,birthYearParam,currentYearParam);
	   pHealthData.displayMyHealthData();
	   
	   System.out.println("Program by Chunhua Li");
	   
	}

	private static void nextLine() 
	{
				
	}

}