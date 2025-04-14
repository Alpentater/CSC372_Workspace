package main;

//Imports for java UI stuff.
import javax.swing.*;
import java.awt.*;

//Imports for writing to an output file.
import java.io.FileWriter;
import java.io.IOException;

//Imports for using date time stuff.
import java.text.SimpleDateFormat;
import java.util.Date;

//Import for the Random utility library.
import java.util.Random;

public class MenuUI {

    public static void main(String[] args) {
    	
    	//Making the JFrame, the "Window".
    	JFrame mainFrame = new JFrame("User Interface");
        mainFrame.setSize(400, 300);

        //Creating the space in the window where text will be displayed.
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        //Creating the panel container for UI elements.
        //This will also be the component that changes color!
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        
        //Creating the menu bar that has options for the user!
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        
        //Making the sub-menu buttons.
        JMenuItem showDateTime = new JMenuItem("Show Date and Time");
        JMenuItem saveToFile = new JMenuItem("Save to File");
        JMenuItem changeColor = new JMenuItem("Change Green Hue");
        JMenuItem exit = new JMenuItem("Exit");

        //Adding an action to the showDateTime button that... shows the date and time!
        showDateTime.addActionListener(e -> {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            textArea.append("Current Date and Time: " + timestamp + "\n");
        });
        
        //Adding an action to the file write button.
        saveToFile.addActionListener(e -> {
        	//Creating a file writer that will take everything in the text area and spit it out into a text file called "Log.txt"
        	try (FileWriter writer = new FileWriter("Log.txt")) {
                writer.write(textArea.getText());
            //Actually had a tough time with this, apparently java WANTS me to make a filewriter within a try catch statement.
            } catch (IOException ex) {
            	//Intentionally left blank.
            	//If the program has issues printing to a text file in the programs directory, I think we'd have a larger problem than
            	//anything the IOException would have to say. :/
            }
        });
        
        //Adding an action to the file write button.
        changeColor.addActionListener(e -> {
        	//Creating a new randy!
            Random randy = new Random();
            
            //Using randy to random generate a green RGB value. (Lowest being 100 for readability.)
            int g = 100 + randy.nextInt(145);
            
            //Applying the randomly generated green value to the background.
            Color greenHue = new Color(0, g, 0);
            textArea.setBackground(greenHue);
            textArea.append("Changed color to R: 0 | G: "+ g + " |B: 0" + "\n");
        });
        
        //A simple action listener that closes the window on the exit button.
        exit.addActionListener(e -> System.exit(0));
        
        //Everything below here is just final setup.
        //(Adding everything and making everything visible in the main panel and main frame.)
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        menu.add(showDateTime);
        menu.add(saveToFile);
        menu.add(changeColor);
        menu.add(exit);
        menuBar.add(menu);
        mainFrame.setJMenuBar(menuBar);
    }
}