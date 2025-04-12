package main;

//Need this import to read user inputs on a line.
import java.util.Scanner;

public class RecursionTest {
	
	//The recursive function that multiplies all the numbers in the nums array!
	public static double recursiveProduct(int index, double[]nums) {
		if(index < nums.length - 1) {
			//Recursively calling the function within itself!
			//Basically multiplying every number with the next number in the array until it is done.
			return nums[index]*recursiveProduct(index + 1, nums);
		} else {
			/* When the end of the nums array is reached, don't call itself again.
			 * The reason for returning the nums[index], the last number in the array is acts as the starting value for
			 * multiplication when recursion "unwinds." */
			return nums[index];
		}
	}
	
	//Main entry point.
	public static void main(String[] args) {
		//Creating a scanner so we can read the users inputs.
		Scanner scanny = new Scanner(System.in);
		
		//Predefining an empty array of 5 integers to be used by the user.
		double[] nums = new double[5];
		
		//This for loop will take in users input of an integer 5 times in order to populate the array.
		System.out.println("Enter 5 numbers to be multiplied! (Decimals are permitted.)");
		for(int i = 0; i < 5; i++) {
			//Reading the line and converting the user input into a double.
			System.out.print("Number " + (i+1) + ": ");
			try {
				nums[i] = scanny.nextDouble();
			} catch(Exception e) {
				//Let the user know they didn't enter a number!
				System.out.println("You didn't enter a number! ");
			}
		}
		//Calling the recursive function to get our result!
		double result = recursiveProduct(0, nums);
		
		//Printing the result to the console!
        System.out.println("The product of the five numbers is: " + result);
        
        //Always close your scanners, kids! (Leaking is bad.)
        scanny.close();
	}
}
