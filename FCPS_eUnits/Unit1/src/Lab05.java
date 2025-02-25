import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
	public static void takeTheField(Athlete arg) {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
		Racer runner1 = new Racer(1);      
		Racer runner2 = new Racer(4);      
		Racer runner3 = new Racer(7);
      runner1
      takeTheField(athlete1);
      athlete1.move();
      athlete1.move();
      athlete1.move();
      athlete1.turnLeft();
      athlete1.move();
      athlete1.move();
      athlete1.turnAround();
      takeTheField(athlete2);
      athlete2.move();
      athlete2.move();
      athlete2.move();
      athlete2.move();
      athlete2.move();
      athlete2.turnLeft();
      athlete2.move();
      athlete2.turnAround();
      takeTheField(athlete3);
      athlete3.move();
      athlete3.move();
      athlete3.move();
      athlete3.move();
      athlete3.turnRight();
      takeTheField(athlete4);
      athlete4.move();
      athlete4.move();
      athlete4.move();
      athlete4.turnRight();
      takeTheField(athlete5);
      athlete5.move();
      athlete5.move();
      athlete5.turnRight();
      takeTheField(athlete6);
      athlete6.move();
      athlete6.turnLeft();
      athlete6.move();
      athlete6.turnAround();
      
   
	}

}
