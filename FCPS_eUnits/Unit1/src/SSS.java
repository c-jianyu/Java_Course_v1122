import edu.fcps.Digit;

public class SSS extends Digit implements Runnable{

	public SSS(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		
		segment1_On();
		segment2_On();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_Off();
		segment7_On();
	}

	@Override
	public void run() {
		
		segment1_On();
		segment2_On();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_Off();
		segment7_On();
	}

}
