import java.util.*;
import java.io.*;

//This will be the class with the main entry point and behavior of the program.
public class ManageStudents {
	public static void main(String[] args) {
		
		//Creating a new scanner that reads from the system console input.
		Scanner scanner = new Scanner(System.in);
	
		//This is the linked list that will hold our students that we will soon make!
		LinkedList<Student> studentList = new LinkedList<>();
		
		//Letting the user input how many students they are going to enter.
		System.out.println("Welcome to... THE Ultimate Student List Manager Program!");
		System.out.println("How many students are you going to create? (Enter a number.)");
		String studentsToMakeString = scanner.nextLine();
		int numStudentsToMake = 0;
		
		//Try to turn the initial input into an integer for how many students we are going to make.
		try { 
			numStudentsToMake = Integer.parseInt(studentsToMakeString);
		} catch(NumberFormatException e) {
			System.out.println("You didn't enter a proper integer... dubious.");
		}
		
		//A for loop that facilitates the creation of students for the number of times determined in the step above.
		for(int i = 0; i < numStudentsToMake; i++) {
			//Prompting the user to input student name in the console.
			System.out.println("Enter a name for student #" + (i+1) + "/" + numStudentsToMake);
			String newStudentName = scanner.nextLine();
			
			//Prompting the user to input student address in the console.			
			System.out.println("Enter an address for student #" + (i+1) + "/" + numStudentsToMake);
			String newStudentAddress = scanner.nextLine();
			
			//Prompting the user to input student GPA in the console.
			System.out.println("Enter a GPA for student # "+ (i+1) + "/" + numStudentsToMake);
			String newGPAString = scanner.nextLine();
			double newGPA = 0.0;
			
			//The first of two things to validate the GPA input: checking if it can be parsed into a double.
			try {
				newGPA = Double.parseDouble(newGPAString);
				//The second of two things to validate the GPA input: being sure it is between 0.0 and 4.0.
				if(newGPA < 0 || newGPA > 4) {
					System.out.println("You didn't enter a proper number for GPA! (Only enter a decimal value between 0 and 4.)");
					break;
				}
			} catch (Exception e) {
				System.out.println("You didn't enter a proper number for GPA! (Only enter a decimal value between 0 and 4.)");
				break;
			}
			
			//Creating the student based on the above inputs and then adding it into the list of students.
			Student newStudent = new Student(newStudentName, newStudentAddress, newGPA);
			studentList.add(newStudent);
		}
		
		// Sort the list by student name in alphabetical order.
        studentList.sort(Comparator.comparing(Student::getName));

        //Writing the list of students out to a text file.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student student : studentList) {
                writer.write(student.toString());
                writer.newLine();
                writer.newLine();
            }
            System.out.println("Student data saved to 'students.txt'.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

		//Closing the scanner to prevent horrendous leaks.
		scanner.close();
	}
}
