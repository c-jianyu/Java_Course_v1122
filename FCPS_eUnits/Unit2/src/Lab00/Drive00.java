package Lab00;

import javax.swing.JFrame;

public class Drive00
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Lab00");

        frame.setSize(600, 600);

        frame.setLocation(200, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new Panel00());

        frame.setVisible(true);
    }
}
