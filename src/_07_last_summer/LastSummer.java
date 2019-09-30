package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Whast is your name?");
	JOptionPane.showMessageDialog(null, "I know you slept last summer " + name + "!");
}
}
