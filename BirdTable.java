
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
		System.out.println(birds);
		String hist = "Element\tValue\tHistogram";

		// iterate through array to create a bar
		for (int j = 0; j < birds.length; j++) {
			hist += "\n" + j + "\t" + birds[j] + "\t";

			// populate bars with * using nested loop
			for (int stars = 0; stars < birds[j]; stars++)
				hist += "*";
		}

		// Output text object to print histogram

		JTextArea outputArea = new JTextArea();
		outputArea.setText(hist);

		JOptionPane.showMessageDialog(null, outputArea, "Birdies", JOptionPane.INFORMATION_MESSAGE);

	}
}