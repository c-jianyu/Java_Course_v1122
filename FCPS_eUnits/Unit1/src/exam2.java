
import edu.fcps.karel2.Display;
public class exam2 {

	public static void main(String[] args) {
        Display.openWorld("C:\\Users\\user\\Documents\\NTUST\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\exam2.map");
        Display.setSize(15, 15);
        Display.setSpeed(10);

        Thread t1 = new Thread( new Exam21(1) );
        Thread t2 = new Thread( new Exam22(8) );

        t1.start();
        t2.start();
	}

}
