import java.util.ArrayList;

public class mazePlayer extends Athlete {

	public mazePlayer() {
	}

	public mazePlayer(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
	}

	public void followWallsLeft() {
		putBeeper();
		putBeeper();
		while (true) {
            if (leftIsClear()) {
            	turnLeft();
            }
    		if (frontIsClear()) {
    			
    			move();
    			if (!nextToABeeper()) {
        			if (leftIsClear()) {
        				putBeeper();
        				putBeeper();
        			}
        			if (rightIsClear()) {
        				putBeeper();
        				putBeeper();
        			}
        			if (frontIsClear()) {
        				putBeeper();
        				putBeeper();
        			}
    			}
    			else {
    				pickBeeper();
    				if (!nextToABeeper()) {
    					break;
    				}
    				pickBeeper();
    			}
    		}
    		if (!leftIsClear() && !frontIsClear()) {
    			turnRight();
    		}
		}
		
	}
	
	public void followWallsRight() {
		//int[] x= new int[5];
		ArrayList<Integer> path =new ArrayList<Integer>();
		int direction = 0,step=0;
		while (!nextToABeeper()) {
            if (rightIsClear()) {
            	turnRight();
            	direction++;
            }
    		if (frontIsClear()) {
    			if (step==0) {
        			path.add(direction % 4);
        			step++;
    			}
    			else if (path.get(step-1) == (direction+2)%4) {
    				path.remove(step-1);
        			step--;
    			}
    			else {
        			path.add(direction % 4);
        			step++;
    				
    			}
    			move();
    			for (int i=0;i<path.size();i++) {
    				System.out.print(path.get(i));
    			}
				System.out.println();
    		}
    		if (!rightIsClear() && !frontIsClear()) {
    			turnLeft();
            	direction--;
            	while (direction<0) direction+=4;
    		}
		}
		
		//往回走
		for (int k=path.size()-1;k>=0;k--) {
			while ((direction%4)!=(path.get(k)+2)%4) {
				turnLeft();
				direction--;
            	while (direction<0) direction+=4;
			}
			move();
			putBeeper();
		}
		
	}

}
