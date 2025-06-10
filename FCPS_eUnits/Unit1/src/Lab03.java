import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Display.openWorld("C:\\Users\\user\\Documents\\NTUST\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(8);
      
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
