import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("C:\\Users\\user\\Documents\\NTUST\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\maps\\shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
		Racer runner1 = new Racer(1);      
		Racer runner2 = new Racer(4);      
		Racer runner3 = new Racer(7);
      runner1.move();
      runner1.jumpRight();
      runner1.sprint(2);
      runner1.pick(7);
      runner1.sprint(2);
      runner1.pick(5);
      runner1.sprint(2);
      runner1.pick(3);
      runner1.turnAround();
      runner1.sprint(6);
      runner1.jumpLeft();
      runner1.move();
      runner1.put(15);
      runner1.turnAround();
      runner1.move();
      
      runner2.move();
      runner2.jumpRight();
      runner2.sprint(2);
      runner2.pick(7);
      runner2.sprint(2);
      runner2.pick(5);
      runner2.sprint(2);
      runner2.pick(3);
      runner2.turnAround();
      runner2.sprint(6);
      runner2.jumpLeft();
      runner2.move();
      runner2.put(15);
      runner2.turnAround();
      runner2.move();
      
      runner3.move();
      runner3.jumpRight();
      runner3.sprint(2);
      runner3.pick(7);
      runner3.sprint(2);
      runner3.pick(5);
      runner3.sprint(2);
      runner3.pick(3);
      runner3.turnAround();
      runner3.sprint(6);
      runner3.jumpLeft();
      runner3.move();
      runner3.put(15);
      runner3.turnAround();
      runner3.move();

      
   
	}

}
