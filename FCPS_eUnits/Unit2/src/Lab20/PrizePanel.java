package Lab20;
   import javax.swing.*;

//import PinballPanel.Listener;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private  final int num=500;
      private BufferedImage myImage;
      private Graphics myBuffer;
      private PinBall pb;
      private Prize[] array;
      private Timer t; 
      private int hits=0; 
		//constructor   
       public PrizePanel()
      {
         //
           myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           pb = new PinBall((int)Math.random()+FRAME-100+50, (int)Math.random()+FRAME-100+50, 10, Color.black);
           pb.setbound(FRAME, FRAME);
           
           array=new Prize(num);
           for(int i=0;i<array.length;i++) {
        	   x = (int)(Math.random()*(FRAME-25)+13);
        	   y = (int)(Math.random()*(FRAME-25)+13);
        	   array[i]=new Prize((int)Math.random()*FRAME,(int)Math.random()*FRAME,(int)Math.random()*15,Color.red);
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
        	  myBuffer.setColor(Color.WHITE);
        	  myBuffer.fillRect(0,0,FRAME,FRAME);
        	  for(int k=0; k<num; k++){
	        	  if(pb.intersect(array[k] && array[k].getMyColor()==Color.red)){
	        		  array[k].lightup();
	        	  }
        	  array[k].drawme(myBuffer);
        	  }
        	  pb.tick();
        	  pb.drawme(myBuffer);
        	  repaint();
         }
      }   
   }