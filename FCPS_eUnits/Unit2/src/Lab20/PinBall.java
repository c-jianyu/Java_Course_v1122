package Lab20;
   import java.awt.*;
    public class PinBall extends Spot
   {
      private double dx;       // pixels to move each time step() is called.
      private double dy;
      private int rightEdge;
      private int bottomEdge;
    // constructors
       public PinBall(double x, double y, double r, Color c)
      {
         super(x, y, (int)r, c);
         dx = Math.random()* 12 - 6;
         dy = Math.random() * 12 - 6;
      }
      
       public void setbound(int right,int bottom) {
    	   rightEdge = right;
    	   bottomEdge = bottom;
       }
       
       private int littlerandom() {
    	   return ((int)Math.random()*6+1);
       }
       
       public void tick() {
    	   if(getX()>=rightEdge-getR()) {
    		   dx = (dx/Math.abs(dx)*littlerandom())*-1;
    		   setX(rightEdge-getR());
    	   }
    	   if(getX()<=getR()) {
    		   dx = (dx/Math.abs(dx)*littlerandom())*-1;
    		   setX(getR());
    	   }
    	   if(getY()<=getR()) {
    		   dy = (dy/Math.abs(dy)*littlerandom())*-1;
    		   setY(getR());
    	   }
    	   if(getY()>=bottomEdge-getR()) {
    		   dy = (dy/Math.abs(dy)*littlerandom())*-1;
    		   setY(bottomEdge-getR());
    	   }
    	   setX(getX()+dx);
    	   setY(getY()+dy);
       }
   }
    
    
    
    