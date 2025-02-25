import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(5);
      
      Climber climber = new Climber(8);
      
      climber.turnRight();
      climber.move();
      climber.climbUpRight();
      climber.climbUpRight();
      climber.climbUpRight();
      climber.climbDownRight();
      climber.climbDownRight();
      climber.pickBeeper();
      climber.turnAround();
      climber.climbUpLeft();
      climber.climbUpLeft();
      climber.climbDownLeft();
      climber.climbDownLeft();
      climber.climbDownLeft();
      climber.move();
      climber.putBeeper();
   
	}

}
