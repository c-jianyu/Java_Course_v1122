
public class HillClimber extends Climber {

	public HillClimber() {
	}

	public HillClimber(int x) {
		super(x);
	}

	@Override
	public void climbUpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		move();
		
	}

	@Override
	public void climbUpLeft() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}

	@Override
	public void climbDownRight() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		
	}

	@Override
	public void climbDownLeft() {
		move();
		move();
		turnLeft();
		move();
		turnRight();
		
	}

}
