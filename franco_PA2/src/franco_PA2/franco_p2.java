package franco_PA2;

import java.util.Scanner;

public class franco_p2 {

	public static void main(String[] args) {
		float BMI;
		double weightInPounds;
		double heightInInches;
		double weightInKg;
		double heightInM;
		int userNum;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How do you want to calculate BMI?");
		System.out.println("1: Pounds/Inches");
		System.out.println("2: Kg/meters");
		userNum = scnr.nextInt();
		
		if(userNum == 1) {
			System.out.println("Enter weight in pounds:");
			weightInPounds = scnr.nextDouble();
			System.out.println("Enter height in inches:");
			heightInInches = scnr.nextDouble();
			
			BMI = (float) ((703 * weightInPounds) / Math.pow(heightInInches, 2));
			System.out.printf("Your BMI is %.1f\n",BMI);
		}
		else if(userNum == 2) {
			System.out.println("Enter weight in kg:");
			weightInKg = scnr.nextDouble();
			System.out.println("Enter height in meters:");
			heightInM = scnr.nextDouble();
			
			BMI = (float) (weightInKg / Math.pow(heightInM, 2));
			System.out.printf("Your BMI is %.1f\n", BMI);
		}
		else {
			System.out.println("Invalid entry");
		}
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		scnr.close();
	}
	
	}


