	//Name______________________________ Date_____________
   package Lab03;

   import java.awt.*;
   import javax.swing.JPanel;
   import java.awt.image.BufferedImage;
   public class Panel03 extends JPanel{
      private BufferedImage myImage;
      
      public Panel03(){
//    	  String inputStr = J0ptionPane.showInputDialog("");
    	  
         final int N = 400; //width & height of buffered-image
         
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
      
         final int line = 50; //Line amount
         
         
      	//webbing
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= 50; k++)
         {
             /************************/
             buffer.drawLine(N * k / 50, 0, N, N * k / 50);
             buffer.drawLine(N, N*k/line, N-N*k/line, N);
             buffer.drawLine(N-N * k / line, N, 0, N-N * k / 50);
             buffer.drawLine(0, N-N*k/line, N*k/line, 0);
         	/*                      */
         	/* Your code goes here. */
         	/*           good           */
         	/************************/
         
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1;							//endpoint for each ray
         int size = 100;					//length of each ray
         int r1 = 60, r2 = 55;			//radius of the sun

         /************************/
         
         int ray = 12;
         int increment = 360/ray;
         for (int angle = 0;angle<=360;angle += increment) {
        	 x1 = (int)(x+size*Math.cos(angle * Math.PI / 180));
        	 y1 = (int)(x+size*Math.sin(angle * Math.PI / 180));
        	 buffer.drawLine(x, y, x1, y1);
         }
         
         
         
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
         
         
         
      
         buffer.setColor(Color.BLUE.brighter());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }