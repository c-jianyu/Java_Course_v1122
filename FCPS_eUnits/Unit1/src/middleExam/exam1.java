import edu.fcps.karel2.Display;

public class exam1 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
        Display.setSize(36, 36);
        Display.setSpeed(10);
		
//多跑幾次
        
        SSS S1 = new SSS(13,20);
        CCC C2 = new CCC(19,20);
        EEE E1 = new EEE(25,20);
        EEE E2 = new EEE(31,20);
        One A1 = new One(19,10);
        Eight A2 = new Eight(13,10);
        Dash A3 = new Dash(26,10);
        Thread t1 = new Thread( C2 );
        Thread t2 = new Thread( E1 );
        Thread t3 = new Thread( S1 );
        Thread t4 = new Thread( E2 );
        Thread t5 = new Thread( A1 );
        Thread t6 = new Thread( A2 );
        Thread t7 = new Thread( A3 );
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t7.start();
        t6.start();
        
	}

}
