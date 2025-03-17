import java.util.ArrayList;

public class RightHand extends Athlete {

	public RightHand() {
		
	}

	public RightHand(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
	}
	
	public void R() {
		ArrayList<Integer> path = new ArrayList<Integer>();
		int direction = 0,step = 0;
        while (!nextToABeeper()) {
    		if (rightIsClear()) {
            	turnRight();
            	direction++;
            }
    		if (frontIsClear()) {
    			move();
    			if (path.size()==0) {
    				path.add(direction % 4);
    				step++;
    			}
    			else if (path.get(step-1) != ((direction+2)%4)) {
    				path.add(direction % 4);
    				step++;
    			}
    			else {
    				path.remove(step-1);
    				step--;
    			}
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
        
        //往回
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
	
	public void L() {
    	putBeeper();
    	putBeeper();
        while (true) {
    		if (leftIsClear()) {
            	turnLeft();
            }
    		if (frontIsClear()) {
    			move();
            	if(!nextToABeeper()) {
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
	

}
