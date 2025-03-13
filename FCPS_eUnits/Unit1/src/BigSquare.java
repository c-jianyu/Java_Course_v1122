
public class BigSquare extends Dancer {

	public BigSquare(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
		// TODO Auto-generated constructor stub
	}

	public BigSquare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void danceStep() {
		for (int i=0;i<4;i++) {
			move();
			move();
			move();
			move();
			move();
			turnLeft();
		}
	}

}
