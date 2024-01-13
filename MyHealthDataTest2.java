package assignment1task;
/*
 *  This test class shows errors existing in the method 
 *  incorrectCalculateBMI(double weight, double height)
 * method. The method is adapted for calculating BMI 
 * in pounds for weight and in inches for heights.
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyHealthDataTest2 {
	
	/*
	 * This test is to test the calculateBMI(double weight, double height)
	 * method in the class of MyHealthData.
	 */
	@Test
	void test() {
		MyHealthData test = new MyHealthData("Peter","Johns","male",1.75,73.5,1955,2023);
		assertEquals(23.05, test.calculateBMI(59.0,1.6),0.01);
	}
	
	/*
	 * This test is to test the incorrectCalculateBMI()method in the class
	 * of MyHealthDataBase.
	 * The error is caused by the wrong calculation formula. The formula using in the 
	 * method of incorrectCalculateBMI() works for for height in inches and weight in pounds. 
	 */
	@Test
	void test1() {
		MyHealthDataBase test = new MyHealthDataBase();
		assertEquals(23.05, test.incorrectCalculateBMI(59.0,1.6),0.01);
	}

	
}
