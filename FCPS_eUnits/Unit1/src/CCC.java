import edu.fcps.Digit;

public class CCC extends Digit implements Runnable{

	public CCC(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_Off();
	}

	@Override
	public void run() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_Off();
	}

}
