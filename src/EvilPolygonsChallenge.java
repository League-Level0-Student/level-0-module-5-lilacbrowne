import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot bot = new Robot ();
		//2. Set the speed to 100
bot.penDown();
bot.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "PICK A COLOR", "ROBOT COLOR CHOOSER", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		if (colorChoice == 0) {
			bot.setPenColor(Color.CYAN);
		} else if (colorChoice == 1) {
			bot.setPenColor(Color.PINK);
		} else if (colorChoice == 2) {
			bot.setPenColor(Color.orange);
		}
		//3. Set the pen color of the robot according to the value of the colorChoise variable
	String polygons = JOptionPane.showInputDialog("How many polygons would you like?");
	int i = Integer.parseInt(polygons);
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		for( i = 0; i < i; i++) {
			bot.move(100);
			bot.turn(90);
			bot.move(100);
			bot.turn(90);
			bot.move(100);
			bot.turn(90);
			bot.turn(70);
			bot.move(200);
		}
	
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

