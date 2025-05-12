package Lab20;

//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

import javax.swing.JFrame;
public class Drive20
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Unit2, Lab20");
      frame.setSize(800, 800);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PrizePanel());
      frame.setVisible(true);
   }
}