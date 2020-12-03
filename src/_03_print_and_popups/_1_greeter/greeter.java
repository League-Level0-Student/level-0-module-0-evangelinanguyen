package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public final class greeter {
	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("whats your favorite color?");
		
		JOptionPane.showMessageDialog(null, input + " is a great color!");
		
	String name= JOptionPane.showInputDialog ("what is your name?");
	JOptionPane.showMessageDialog (null, "hello " + name + " . it is very nice to meet you :)");
		
		
		
		
		
		
		
	}
}