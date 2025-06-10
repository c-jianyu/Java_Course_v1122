import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("C:\\Users\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\first.map");
		Display.setSize(10,10);
		Display.setSpeed(5);
		  
		Robot karel = new Robot();
		  
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
   
	}

}
