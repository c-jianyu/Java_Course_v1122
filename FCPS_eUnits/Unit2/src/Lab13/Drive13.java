   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003
package Lab13;
   import javax.swing.JFrame;
    public class Drive13
   {
    	
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab13");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new ProjectPanel());
         frame.setVisible(true);
      }
   }