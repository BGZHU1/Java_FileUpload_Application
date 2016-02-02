import java.awt.GridLayout;
import javax.swing.*; 

//Class to create a JFrame for use in Project3.java

public class GUI extends JFrame {

//Three text areas: Left for unsorted list of players, Middle for fielders, and Right for pitchers
	
	protected JTextArea textArea = new JTextArea(20, 20);
	protected JTextArea textArea2 = new JTextArea(20, 20);
	protected JTextArea textArea3 = new JTextArea(20, 20);

//Constructor for the GUI class

	public GUI () {
		super("GUI");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocation(400, 400);
		setLayout(new GridLayout(1,3));		
		setVisible(true);
		setTitle("Project 3");
		textArea.append("Unsorted:\n\n");
		textArea2.append("Fielders:\n\n");
		textArea3.append("Pitchers:\n\n");
		textArea.setEditable(false);
		textArea2.setEditable(false);
		textArea3.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        JScrollPane scrollPane3 = new JScrollPane(textArea3);
        getContentPane().add(scrollPane);
        getContentPane().add(scrollPane2);
        getContentPane().add(scrollPane3);
	}
}