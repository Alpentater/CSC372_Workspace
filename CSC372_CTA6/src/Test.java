import java.util.ArrayList;

public class Test {
	//Main entry point function
	 public static void main(String[] args) {
		 //Initializing our list.
        ArrayList<Student> students = new ArrayList<>();
        
        //Creating our 10 students to be sorted out!
        //(And adding adding it to the list made above.)
        students.add(new Student(1337, "Alex", "Boston"));
        students.add(new Student(24, "Goobert", "Chicago"));
        students.add(new Student(3, "Snoobert", "Atlanta"));
        students.add(new Student(4, "Flingo", "Seattle"));
        students.add(new Student(2, "Wayne", "New York"));
        students.add(new Student(16, "Pongorma", "Miami"));
        students.add(new Student(99, "Dedulsmuln", "San Francisco"));
        students.add(new Student(10, "Hecker", "Austin"));
        students.add(new Student(9, "Isaac", "Denver"));
        students.add(new Student(17, "Bwee", "Phoenix"));

        //Printing out the original list to easily compare.
        System.out.println("Original list:");
        for (Student s : students) {
            System.out.println(s);
        }
        
        //Printing out the list sorted by names in alphabetical order.
        System.out.println("\nSorted by Name:");
        ArrayList<Student> sortedByNameList = SortStudentList.insertionSortByName(students);
        for (Student s : sortedByNameList) {
            System.out.println(s);
        }
        
        //Printing out the list sorted by Roll number in order from least to greatest.
        System.out.println("\nSorted by Roll No:");
        ArrayList<Student> sortedByRollNoList = SortStudentList.selectionSortByRollNo(students);
        for (Student s : sortedByRollNoList) {
            System.out.println(s);
        }
    }
}
