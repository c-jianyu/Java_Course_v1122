package Lab02;

import javax.swing.JFrame;

import Lab01.Panel01;

public class Driver02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab02");
		frame.setSize(400, 400);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}

}
