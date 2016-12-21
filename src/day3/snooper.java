package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog("How old are you?");
		String num = JOptionPane.showInputDialog("What is your phone number?");
	String SSN = JOptionPane.showInputDialog("What is your social security number?");
	String HA = JOptionPane.showInputDialog("Where do you live?");
	String FB = JOptionPane.showInputDialog("What is your instagram account?");
	JOptionPane.showMessageDialog(null, "Hello " +Name+ " how is your day. You are " +age+ " years old,  your phone number is " +num+" your social security number is " +SSN+ " You live at " +HA+ " and your instagram account will gain 200 new followers in exchange for all your money");
	 
	

	
	
	
	
	
	
	}
}
