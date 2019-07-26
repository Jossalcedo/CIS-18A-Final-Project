package finalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDrinks implements ActionListener {
	JLabel jlab;
	ButtonDrinks() {
	
	//Create a new Jframe container,
	JFrame jfrm = new JFrame("A Button");
	
	//Specify FlowLayout for the layout manager.
	jfrm.setLayout(new FlowLayout());

	//Give the frame an initial size
	jfrm.setSize(1900, 1000);
	
	//Terminate the program when the user closes the application 
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Make two buttons
		
	JButton jbtnMM = new JButton("Moscow Mule");		//Button for Moscow Mule
	JButton jbtnTS = new JButton("Tequila Sunrise");	//Button for Tequila Sunrise
	JButton jbtnLA = new JButton("LA Water");		//Button for LA Water
	JButton jbtnAD = new JButton("Adios");			//Button for Adios
	JButton jbtnBM = new JButton("Bloody Mary");		//Button for Bloody Mary
	JButton jbtnLI = new JButton("Long Island Ice Tea");	//Button for LIIT
	
	//Add Action listeners
	
	jbtnMM.addActionListener(this);
	jbtnTS.addActionListener(this);
	jbtnLA.addActionListener(this);
	jbtnAD.addActionListener(this);
	jbtnBM.addActionListener(this);
	jbtnLI.addActionListener(this);

	//Add the buttons to the content pane.
	jfrm.add(jbtnMM);
	jfrm.add(jbtnTS);
	jfrm.add(jbtnLA);	
	jfrm.add(jbtnAD);
	jfrm.add(jbtnBM);
	jfrm.add(jbtnLI);

	//Create a Label
	jlab = new JLabel("Press a Drink to see the items.");
	
	//Add the label to the frame
	jfrm.add(jlab);
	
	//Display the frame
	jfrm.setVisible(true);
}

	//Handle Button Events 
	public void actionPerformed(ActionEvent ae) {

	if(ae.getActionCommand().equals("Moscow Mule")){
		jlab.setText("Combine vodka and ginger beer in a copper mug or highball glass filled with ice. Add lime juice. Stir gently and garnish with a lime slice.");
	}
	
	if(ae.getActionCommand().equals("Tequila Sunrise")){
		jlab.setText("Pour the tequila and orange juice into glass over ice. Add the grenadine, which will sink to the bottom. Do not stir. Garnish and serve.");

	}
	if(ae.getActionCommand().equals("LA Water")){
		jlab.setText("Add ice to tall glass before pouring over vodka, gin, tequila, rum, triple sec, sweet and sour, melon liqueur, raspberry liqueur and blue curaçao.");

	}

	if(ae.getActionCommand().equals("Adios")){
		jlab.setText("Blue Curacao liqueur, sweet and sour mix and  Top with 7-Up and stir gently.");

	}
	
	if(ae.getActionCommand().equals("Bloody Mary")){
		jlab.setText("Add dashes of Worcestershire Sauce,\n Tabasco salt and pepper into highball glass\n, then pour all ingredients into highball\n with ice cubes. Stir gently. \nGarnish with celery stalk and lemon wedge.");
	}
if(ae.getActionCommand().equals("Long Island Ice Tea")){
		jlab.setText("Vodka, White Rum, Lemon Juice. Add all ingredients into highball glass filled with ice. Stir gently. Garnish with lemon spiral. Serve with straw.");

	}

	}

public static void main(String args[]){
	//Create the frame on the event dispatcching thread.
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	new ButtonDrinks();
	}
	});
	}
	}











