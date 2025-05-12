package Lab20;
   import javax.swing.*;

//import PinballPanel.Listener;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class Spot extends JPanel
   {
     private double x,y,r;
     private Color myColor;
     
     public Spot() {
    	 x=200;
    	 y=200;
    	 r=25;
    	 myColor=Color.red;
     }

     public Spot(double sx, double sy, double sr, Color sc){
        x = sx;
        y = sy;
        r = sr;
        myColor = sc;
     }
     

     public double getx(){ 
        return x;
     }
     
     public double gety(){ 
         return y;
     }

     public double getR(){ 
        return r;
     }

     public void setX(double sx){ 
         x=sx;
      }

     public void setY(double sy){ 
         y=sy;
      }

     public void setR(double sr){ 
         r=sr;
      }

     public Color getColor(){ 
         return myColor;
     }
     
     public void setMyColor(Color sc){ 
         this.myColor=sc;
     }
     
     public boolean intersect(Spot spot) {
    	 double d=distance(x,y,spot.getx(),spot.gety());
    	 return d<=(r+spot.getR());
     }
     
     private double distance(double x1,double y1,double x2,double y2) {
    	 return  	 Math.sqrt( Math.pow(x1-x2,2)+Math.pow(y1-y2,2)  );
     }
     
     public void drawme(Graphics myBuffer) {
    	 myBuffer.setColor(myColor);
    	 myBuffer.fillOval((int)(getx()-getR()), (int)(gety()-getR()), (int)(getR()*2), (int)(getR()*2));
     }
     
   }
    
    
    
    