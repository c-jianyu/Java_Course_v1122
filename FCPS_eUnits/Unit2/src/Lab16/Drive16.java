package Lab16;

//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

import javax.swing.JFrame;
public class Drive16
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Unit2, Lab16");
      frame.setSize(400, 400);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PrizePanel());
      frame.setVisible(true);
   }
}