package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot robo = new Robot();
	robo.setSpeed(70);
	robo.turn(90);
	robo.move(-300);
	robo.turn(-90);
	robo.move(200);
	robo.turn(230);
	robo.penDown();
	robo.setPenColor(255, 0, 0);
	robo.move(50);
	robo.turn(-50);
	robo.move(200);
	robo.turn(-30);
	robo.move(50);
	robo.hide();
}
}
