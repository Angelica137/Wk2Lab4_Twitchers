
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;

public class BirdTable {

	// main method begins execution of Java application
	public static void main(String args[]) {
		// Declare and build an array interactively - see the Temperature Project

		// Declare array
		int[] birds = new int[7];

		// Declare string element and double element to collect user input
		String strElement;
		int intElement;

		// Enter record using inputDialog and a loop
		for (int i = 0; i < birds.length; i++) {
			strElement = JOptionPane.showInputDialog("How many birds did you see today? " + (i + 1));
			intElement = Integer.parseInt(strElement);
			birds[i] = intElement;
		}

		// Display Output using a histogram of '*' - see Histogram Project
		// declare string to hold *s
		String hist = "Element";

		// iterate through array to create a bar
		for (int i = 0; i < birds.length; i++) {
			hist += "\n" + i + "\t" + birds[i] + "\t";

		}

	}
}