package Lab13;
//Name:    Date:
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
 public class ProjectPanel extends JPanel
{
   private static final ImageIcon THOMAS = new ImageIcon("C:\\Users\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\src\\Lab02\\tj.jpg");
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private Timer t1, t2;
   private int xPos=50;
   private int yPos=180;

    public ProjectPanel()
   {
      //
    	xPos=50;
        myImage =  new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
        myBuffer = (Graphics2D)myImage.getGraphics();
        
        t1 = new Timer(100, new Listener1());//ms
        t1.start();
        t2 = new Timer(3000, new Listener2());//ms
 	 //
   }
    public void paintComponent(Graphics g)
   {
 	   //
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
        //
   }
    private class Listener1 implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
      {
     	  	//
    	   int xPoints[] = {xPos,xPos,xPos+50,xPos,xPos-50,xPos,      xPos,xPos-50,xPos,xPos+50};
    	   int yPoints[] = {yPos,yPos+50,yPos,yPos+50,yPos,yPos+50, yPos+100,yPos+150,yPos+100,yPos+150};
    	   myBuffer.setColor(Color.gray);
    	   myBuffer.fillRect(0, 0, 700, 350);
    	   myBuffer.setColor(Color.darkGray);
    	   myBuffer.fillRect(0, 335, 700, 500);
    	   myBuffer.drawImage(THOMAS.getImage(), xPos-40, 50,70,125, null);
    	   myBuffer.setStroke(new BasicStroke(10.0f));
    	   myBuffer.drawPolyline(xPoints,yPoints,10);
    	   repaint();
    	   xPos+=5;
    	   if (xPos>=200) {
    		   myBuffer.setFont(new Font("Monospaced", Font.BOLD ,24));
    		   myBuffer.drawString("颱風天要帶多少錢才能出門?", 300, 140);
    		   myBuffer.drawOval(250, 80, 400, 100);
        	   repaint();
        	   t1.stop();
        	   t2.start();
    	   }
     	   //
      }
   } 
    

    private class Listener2 implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
      {
     	  //
    	   t2.stop();
		   myBuffer.setFont(new Font("Monospaced", Font.BOLD ,24));
		   myBuffer.drawString("四千萬 因為...", 320, 250);
		   myBuffer.drawString("颱風天沒\"事千萬\"不要出門", 330, 280);
		   myBuffer.drawOval(280, 190, 400, 130);
    	   repaint();
     	  //
      }
   } 
}