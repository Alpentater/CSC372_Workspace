
public class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student(int rollnoToBe, String nameToBe, String addressToBe) {
		this.rollno = rollnoToBe;
		this.name = nameToBe;
		this.address = addressToBe;
	}
	
	public int getRollno() { return rollno; }
	public String getName() { return name; }
	public String getAddress() { return address; }
	
	public String toString() {
		return "Roll No: " + rollno + " | Name: " + name + " | Address: " + address;
	}
}
