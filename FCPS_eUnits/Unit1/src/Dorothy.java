import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {

	public Dorothy() {
		super(2, 2, Display.EAST, 0);
	}

	public boolean findPath() {
		int x=0;
		if (nextToABeeper() && !frontIsClear()) {
			turnLeft();
			return true;
		}
		while(!nextToABeeper()) {
			turnAround();
			move();
			turnRight();
			x++;
			if (x==2) {
				turnLeft();
			}
			move();
			if (x>=3) {
				turnAround();
				move();
				turnAround();
				return false;
			}
		}
		return true;
	}
	
	public void followPath() {
		while(nextToABeeper() && frontIsClear()) {
			move();
		}
	}

}
