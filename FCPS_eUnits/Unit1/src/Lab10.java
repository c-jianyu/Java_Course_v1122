import edu.fcps.karel2.Display;

public class Lab10 {

	public static void main(String[] args) {
		Display.openWorld("C:\\Users\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\maze3.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        mazePlayer pete = new mazePlayer(1,1,Display.NORTH,Display.INFINITY);

        if (Math.random()>0.5) {
        	pete.followWallsRight();
        }
        else {
        	pete.followWallsLeft();
        }
        
        	
	}

}
