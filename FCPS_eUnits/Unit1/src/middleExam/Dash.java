import edu.fcps.Digit;

public class Dash extends Digit implements Runnable{

	public Dash(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment7_On();
	}

	@Override
	public void run() {
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment1_Off();
		segment7_On();
	}

}
