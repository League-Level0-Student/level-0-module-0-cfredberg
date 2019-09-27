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
	String math = JOptionPane.showInputDialog("Would you like to do math facts, algebra, or take a math test?");
	if(math.equalsIgnoreCase("math facts")) {
		String multiple = JOptionPane.showInputDialog("Would you like to do times 1s, 2s, 3s, 4s, 5s, 6s, 7s, 8s, 9s, 10s, 11s, or 12s?");
	}
}
public static void reading() {
	
}
}
