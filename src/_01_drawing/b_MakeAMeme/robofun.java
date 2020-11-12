package _01_drawing.b_MakeAMeme;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class robofun {
public static void main(String[] args) {
Robot robot = new Robot();	
robot.setSpeed(100);
robot.penDown();
robot.move(250);
robot.turn(-100);
robot.setPenColor(Color.GRAY);
robot.move(100);
robot.turn(-80);
robot.setPenColor(Color.RED);
	
	
	
	
}    
}
