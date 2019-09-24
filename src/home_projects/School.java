package home_projects;

import javax.swing.JOptionPane;

public class School {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome to the Java Learning tool!");
	tour();
}
public static void school() {
	String subject = JOptionPane.showInputDialog("Would you like to do math");
}
public static void tour() {
	String tour = JOptionPane.showInputDialog("Would you like a tour?");
	if (tour.equalsIgnoreCase("yes")) {
		school();
	}if(tour.equalsIgnoreCase("no")){
		school();
	}else {
		JOptionPane.showMessageDialog(null, "This is a yes or no question. Plese try again.");
		tour();
	}
}
}
