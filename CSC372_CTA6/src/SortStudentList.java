import java.util.ArrayList;
import java.util.Comparator;

public class SortStudentList {
	
	//Function that sorts students by their name in alphabetical order. (Using the insertion sort algorithm!)
	public static ArrayList<Student> insertionSortByName(ArrayList<Student> studentList){
        for (int i = 1; i < studentList.size(); ++i) {
            Student currentStudent = studentList.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position (GeeksforGeeks, 2023)*/
            while (j >= 0 && currentStudent.getName().compareTo(studentList.get(j).getName()) < 0) {
            	Student tempStudent = studentList.get(j+1);
            	studentList.set(j+1, studentList.get(j));
            	studentList.set(j, tempStudent);
            	j--;
            }
            //Bumping up to next student.
            Student wat = studentList.get(j+1);
            wat = currentStudent;
            
        }
        //Return our newly sorted list!
		return studentList;
	}
	
	//Function that sorts students by their roll number in order from least to greatest. (Using the selection sort algorithm!)
	public static ArrayList<Student> selectionSortByRollNo(ArrayList<Student> studentList) {
		
		for(int i = 0; i < studentList.size(); i++) {
			//Assume the current student has the lowest value roll number.
			int minValIndex = i;
			
			//Loop through the unsorted part of the list to fine the new minimum.
			for(int j = i+1; j < studentList.size(); j++) {
				//If a smaller roll number is found...
				if(studentList.get(j).getRollno() < studentList.get(minValIndex).getRollno()) {
					//...update the minimum value index number.
					minValIndex = j;
				}				
			}
			
			//Move the newly found min value to its correct position in the list.
			Student tempStudent = studentList.get(i);
			studentList.set(i, studentList.get(minValIndex));
			studentList.set(minValIndex, tempStudent);
		}
		//Return our newly sorted list!
		return studentList;
	}
}
