import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Exam21 extends Robot implements Runnable, Workable{
	

    public Exam21(int y)
    {
       super(1, y, Display.EAST, 0);
    
    }

	@Override
	public void workCorner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveOneBlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnToTheRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnToTheNorth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		int[] counter = new int[8];
		for (int i=0;i<counter.length;i++) {
			while(nextToABeeper()) {
				pickBeeper();
				counter[i]++;
			}
			if (i>0) {
				for (int k=0;k<counter[i-1];k++) {
					putBeeper();
				}
			}
			move();
		}

		turnLeft();
		move();
		turnLeft();
		int[] counter2 = new int[8];
		for (int i=0;i<counter2.length;i++) {
			while(nextToABeeper()) {
				pickBeeper();
				counter2[i]++;
			}
			turnLeft();
			turnLeft();
			move();
			for (int k=0;k<counter2[i];k++) {
				putBeeper();
			}
			turnLeft();
			turnLeft();
			move();
			move();
		}
	}

}
