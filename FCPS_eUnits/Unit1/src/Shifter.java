	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
	@Override
	public void workCorner() {
		
	}
	@Override
	public void moveOneBlock() {
		
	}
	@Override
	public void turnToTheRight() {
		
	}
	@Override
	public void turnToTheNorth() {
		
	}
	@Override
	public void run() {
		int[] counter = new int[10];
		for (int i=0;i<counter.length;i++) {
			while(nextToABeeper()) {
				pickBeeper();
				counter[i]++;
			}
			if (i>0) {
				for (int k=0;k<counter[i-1];k++) {
					putBeeper();
				}
			}
			move();
		}
	}
   }