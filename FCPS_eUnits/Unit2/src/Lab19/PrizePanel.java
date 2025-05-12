package Lab19;
   import javax.swing.*;

//import PinballPanel.Listener;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
//      private Polkadot pd;
      private Polkadot[] pdarray;
      private Timer t; 
      private int hits=0; 
      int x=0;
      int y=0;
		//constructor   
       public PrizePanel()
      {
         //
           myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           ball = new Ball(0, 0, 50, Color.black);
           //*************************************************
           //pd = new Polkadot(200, 200, 30, Color.yellow);
           pdarray=new Polkadot[50];
           for(int i=0;i<pdarray.length;i++) {
        	   x = (int)(Math.random()*(FRAME-25)+13);
        	   y = (int)(Math.random()*(FRAME-25)+13);
        	   pdarray[i]=new Polkadot(x,y,25,Color.red);
           }
           //**************************************************
           t = new Timer(5, new Listener());//ms
           t.start();
    	 //
      }
       public void paintComponent(Graphics g)
      {
    	   //
           g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
           //
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
        	  //
        	  myBuffer.setColor(BACKGROUND);    //cover the 
              myBuffer.fillRect(0,0,FRAME,FRAME);   //old ball
              ball.move(FRAME,FRAME);
              //*************************************
              //collide(ball,pd);
              //pd.draw(myBuffer);
              for(int i=0;i<pdarray.length;i++) {
            	  collide(ball,pdarray[i]);
            	  pdarray[i].draw(myBuffer);
              }
              //*************************************
              ball.draw(myBuffer);
        	  myBuffer.setColor(Color.BLACK);    //cover the 
        	  myBuffer.setFont(new Font("Monospaced", Font.BOLD ,24));
        	  myBuffer.drawString("Count:"+hits, FRAME-150, 25);
              repaint();
        	  //
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(  b.getX(),b.getY(),pd.getX(),pd.getY()/* 4 arguments */  );  
        if (d <= b.getRadius()+pd.getRadius()) {
        	hits++;
        	pd.jump(FRAME, FRAME);
        }
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return  	 Math.sqrt( Math.pow(x1-x2,2)+Math.pow(y1-y2,2)  );// enter the calculation here.
      }
   }