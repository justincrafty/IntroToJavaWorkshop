package day1.tortoise;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the tortoise will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot bob=new Robot();
		bob.penDown();
		
		// 6. make the tortoise go at maximum speed
bob.setSpeed(10);
		// 9. choose a color that you like for the shape

		// 2. make a variable for the number of sides you want (can’t test this one)
int sides = 5;
		// 3. make a variable for the angle you want the tortoise to turn. Hint: you can divide in Java using “/”. Can’t test until step 5.

		// 5. Do everything below 200 times. When this is done you will see a pentagon.
for (int b = 0; b < 10000; b++) {
	

for (int i = 0; i <10000; i++) {
	bob.move(i);
	bob.turn(360/sides+1);
	bob.setRandomPenColor();

}
}			// 1. move the tortoise 100 pixels
	
			// 7. make the tortoise move "i" pixels instead of 100 (don’t need new line of code for this, just change previous one)
	
			// 4. turn the tortoise the amount in your angle variable
	
			// 8. turn the tortoise one more degree

	}

	// Variations:
	// *9. make the pattern really huge
	// *10. change the color of the pattern
	// *11. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
