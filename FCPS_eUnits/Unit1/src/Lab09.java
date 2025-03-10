import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab09 {

	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("C:\\Users\\\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\"+filename+".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        Athlete Lisa = new Athlete(1,1,Display.EAST,0);
		
		int[] counter = new int[10];
		for (int i=0;i<counter.length;i++) {
			while(Lisa.nextToABeeper()) {
				Lisa.pickBeeper();
				counter[i]++;
			}
			if (i>0) {
				for (int k=0;k<counter[i-1];k++) {
					Lisa.putBeeper();
				}
			}
			Lisa.move();
		}
	}

}
