import edu.fcps.karel2.Display;

public class exam3 {

	public static void main(String[] args) {
        Display.openWorld("C:\\Users\\user\\Documents\\NTUST\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\exam3.map");
        Display.setSize(12, 12);
        Display.setSpeed(10);

		Athlete C = new Athlete(2,10,Display.EAST,Display.INFINITY);
		for (int i=0;i<4;i++) {
			while(C.frontIsClear()) {
				C.putBeeper();
				C.move();
			}
			C.putBeeper();
			C.turnAround();
			while(!C.leftIsClear()) {
				C.move();
			}
			C.turnLeft();
			C.move();
			C.turnLeft();
			while(C.frontIsClear()) {
				C.move();
			}
			C.turnAround();
			while(C.frontIsClear()) {
				C.putBeeper();
				C.move();
			}
			C.putBeeper();
			C.turnAround();
			while(!C.rightIsClear()) {
				C.move();
			}
			C.turnRight();
			C.move();
			C.turnRight();
			while(C.frontIsClear()) {
				C.move();
			}
			C.turnAround();
			
		}
		while(C.frontIsClear()) {
			C.putBeeper();
			C.move();
		}
		C.putBeeper();
		C.turnAround();
		while(!C.leftIsClear()) {
			C.move();
		}
		C.turnLeft();
		C.move();
		C.turnLeft();
		while(C.frontIsClear()) {
			C.move();
		}
		C.turnAround();
		while(C.frontIsClear()) {
			C.putBeeper();
			C.move();
		}
		C.putBeeper();
		C.turnAround();
		//////////////////////////////////////

		for (int i=0;i<4;i++) {
			while(C.frontIsClear()) {
				C.pickBeeper();
				C.move();
			}
			C.pickBeeper();
			C.turnAround();
			while(!C.rightIsClear()) {
				C.move();
			}
			C.turnRight();
			C.move();
			C.turnRight();
			while(C.frontIsClear()) {
				C.move();
			}
			C.turnAround();
			while(C.frontIsClear()) {
				C.pickBeeper();
				C.move();
			}
			C.pickBeeper();
			C.turnAround();
			while(!C.leftIsClear()) {
				C.move();
			}
			C.turnLeft();
			C.move();
			C.turnLeft();
			while(C.frontIsClear()) {
				C.move();
			}
			C.turnAround();
			
		}
		while(C.frontIsClear()) {
			C.pickBeeper();
			C.move();
		}
		C.pickBeeper();
		C.turnAround();
		while(!C.rightIsClear()) {
			C.move();
		}
		C.turnRight();
		C.move();
		C.turnRight();
		while(C.frontIsClear()) {
			C.move();
		}
		C.turnAround();
		while(C.frontIsClear()) {
			C.pickBeeper();
			C.move();
		}
		C.pickBeeper();
		C.turnAround();
		
	}

}
