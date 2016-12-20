package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Joe=new Robot();
	Joe.penDown();	
	Joe.setPenColor(10, 255, 255);
	Joe.setSpeed(10);
	Joe.setRandomPenColor();
	for (int i = 0; i < 4; i++) {
		Joe.move(100);
		Joe.turn(90);	
		Joe.setRandomPenColor();
	}

	Joe.move(100);
	Joe.turn(90);
	Joe.setRandomPenColor();
	Joe.move(100);
	Joe.turn(90);
	Joe.setRandomPenColor();
	Joe.move(100);
	Joe.turn(90);
	Joe.setRandomPenColor();
	Joe.move(100);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(180);
	Joe.move(200);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	Joe.setRandomPenColor();
	Joe.turn(90);
	Joe.move(100);
	
	for (int i = 0; i < 4; i++) {
		Joe.move(100);
		Joe.turn(90);	
		Joe.setRandomPenColor();
	}
		
	}
}
