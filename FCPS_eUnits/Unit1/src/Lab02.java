import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/maze.map");
      Display.setSize(8,8);
      Display.setSpeed(10);
      
		Athlete maria = new Athlete(1,1,Display.NORTH,20);
      
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.turnLeft();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.turnRight();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.move();
   
	}

}
