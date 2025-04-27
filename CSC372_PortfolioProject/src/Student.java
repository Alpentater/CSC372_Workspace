
public class Student {
	//Required components for the student class.
	private String name;
	private String address;
	private double gpa;
	
	//Constructor for the student class.
	public Student(String nameToBe, String addressToBe, double gpaToBe) {
		this.name = nameToBe;
		this.address = addressToBe;
		this.gpa = gpaToBe;
	}
	
	//Getters for Student.
	public String getName() { return this.name; }
	public String getAddress() { return this.address; }
	public double getGpa() { return this.gpa; }
	
	//This function will print the information about the student into a string.
	public String toString() {
		String toPrint = "Student Name: " + this.name + '\n' +
						 "Student Address: " + this.address + '\n' +
						 "Student GPA: " + this.gpa;
		return toPrint;
	}
	
}
