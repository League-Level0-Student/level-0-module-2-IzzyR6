//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		

		// 3. Use each value of randomNumber to give the user a random compliment.
for (int i = 0; i < 10; i++) {
	int randomNumber = new Random().nextInt(5);
	System.out.println(randomNumber);
		if (randomNumber==(4)) {
			
	JOptionPane.showMessageDialog(null, "You are nice.");
}
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You are funny.");
}
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You are not mean.");
}
if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "You are not not funny");
}
if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You are not mean like Sophia");
}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
}
