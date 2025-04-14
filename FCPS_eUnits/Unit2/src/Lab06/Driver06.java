	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
      
         /************************/
         smidge = new SquareTurtle(100);
         smidge.setColor(Color.YELLOW);
         smidge.setThickness(10);
         smidge.drawShape();

         smidge = new SquareTurtle(100,200,120);
         smidge.drawShape();

         smidge = new SquareTurtle(300,200,120,80);
         smidge.drawShape();
      	/************************/
      
      }
   }