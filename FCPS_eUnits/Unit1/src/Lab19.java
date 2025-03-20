import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab19 {

	public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("C:\\Users\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\"+filename+".map");
        Display.setSize(11, 11);
        Display.setSpeed(10);
		
        Dorothy dorothy = new Dorothy();
        
        while (dorothy.findPath()) {
        	dorothy.followPath();
        }
        
	}

}
