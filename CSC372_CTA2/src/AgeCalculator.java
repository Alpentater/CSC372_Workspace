//Imports for GUI libraries that we'll need!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Some helpful time related libraries to make "Date Math" easier.
import java.time.LocalDate;
import java.time.Period;

//Age Calculator with just a main function, it's all we need!
public class AgeCalculator {
	public static void main (String[] args) {
		
		//Making the JFrame, in other words, a "Window"
		JFrame frame = new JFrame("Age Calculator");
		frame.setSize(300, 200);
		
		//Creating a panel in the frame with a gridlayout for some "spread" and readability.
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1, 5, 5));
		
		//Creating the components needed for the application. (Labels, text fields, buttons, etc.)
		JLabel label = new JLabel("  Enter your birthdate (YYYY-MM-DD): ");
		JTextField birthdayInputField = new JTextField();
		JButton calculateButt = new JButton();
		JLabel result = new JLabel("");
		
		//Adding text to the calculate button so we know what it does!
		calculateButt.setText("Calculate Age");
		
		//Adding the components that were just created to the panel.
		panel.add(label);
		panel.add(birthdayInputField);
		panel.add(calculateButt);
		panel.add(result);
		
		//Creating the action listener for what will happen when we click the calculate button
		ActionListener listener = new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent event) {
                //Try to calculate the age based on the input given.
				try {
					//Get the date that the user entered and the current date.
                    LocalDate birthDate = LocalDate.parse(birthdayInputField.getText());
                    LocalDate currentDate = LocalDate.now();
                    
                    //Turn the users age into an integer and print that result to the result label.
                    int age = Period.between(birthDate, currentDate).getYears();
                    result.setText("  You are " + age + " years old.");
                    
                //If it doesn't work, throw this error which will most likely be the reason the above won't work.
                } catch (Exception ex) {
                    result.setText("  Invalid format. Use YYYY-MM-DD.");
                }
            }
		};
		
		//Adding an ActionListener to the button so it does the purpose of the program!
		calculateButt.addActionListener(listener);        
        
		//Essentially just making everything "visible" with these last two lines.
        frame.add(panel);
        frame.setVisible(true);
	}
}
