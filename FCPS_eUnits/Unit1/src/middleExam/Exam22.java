import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Exam22 extends Robot implements Runnable, Workable{
	

    public Exam22(int y)
    {
       super(8, y, Display.EAST, 0);
    
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
		for (int k=0;k<4;k++) {
			for (int i=0;i<4;i++) {

				move();
			}
			turnLeft();
			turnLeft();
			turnLeft();
			
		}

	}

}
