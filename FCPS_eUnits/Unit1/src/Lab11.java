import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
        Display.setSize(36, 32);
        Display.setSpeed(10);
		
        Zero zero = new Zero(1, 20);
        zero.display();
        new One(7,20).display();
        new Two(13,20).display();
        new Three(19,20).display();
        new Four(25,20).display();
        new Five(31,20).display();
        new Six(1,10).display();
        new Seven(7,10).display();
        new Eight(13,10).display();
        new Nine(19,10).display();
	}

}
