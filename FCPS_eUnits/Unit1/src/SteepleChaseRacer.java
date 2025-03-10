
public class SteepleChaseRacer extends Racer {


	public SteepleChaseRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void jumpRight() {
		// TODO Auto-generated method stub
		turnLeft();
		while(!rightIsClear()) {
			move();
		}
		turnRight();
		move();
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
