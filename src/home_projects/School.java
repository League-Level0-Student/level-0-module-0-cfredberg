package home_projects;

import javax.swing.JOptionPane;

public class School {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome to the Java Learning tool!");
	tour();
}
public static void mathOrReading() {
	String subject = JOptionPane.showInputDialog("Would you like to do math or reading?");
	if (subject.equalsIgnoreCase("math")) {
		math();
	}if (subject.equalsIgnoreCase("reading")) {
		reading();
	}
}
public static void tour() {
	String tour = JOptionPane.showInputDialog("Would you like a tour?");
	if (tour.equalsIgnoreCase("yes")) {
		mathOrReading();
	}if(tour.equalsIgnoreCase("no")){
		mathOrReading();
	}else {
		JOptionPane.showMessageDialog(null, "This is a yes or no question. Plese try again.");
		tour();
	}
}
public static void math() {
	//question: would you like to do math facts, algebra, or take a math test?
}
public static void reading() {
	
}
}
