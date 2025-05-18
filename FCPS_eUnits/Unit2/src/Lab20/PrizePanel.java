package Lab20;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class PrizePanel extends JPanel {

    private static final int FRAME = 800;
    private static final Color BACKGROUND = new Color(204, 204, 204);
    private final int num = 500;
    private BufferedImage myImage;
    private Graphics buffer;

    private PinBall pb;
    private Prize[] array;

    private Timer t;

    // Constructor
    public PrizePanel() {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        buffer = myImage.getGraphics();
        buffer.setColor(Color.WHITE);
        buffer.fillRect(0, 0, FRAME, FRAME);
        pb = new PinBall((int) (Math.random() * (FRAME - 100) + 50),(int) (Math.random() * (FRAME - 100) + 50),10,Color.black);
        pb.setbound(FRAME, FRAME);

        array = new Prize[num];
        for (int k = 0; k < array.length; k++) {
            array[k] = new Prize((int) (Math.random() * FRAME),(int) (Math.random() * FRAME),Math.random() * 15,Color.red);
        }

        // Timer setup
        t = new Timer(5, new Listener());
        t.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private class Listener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         buffer.setColor(Color.WHITE);
         buffer.fillRect(0, 0, FRAME, FRAME);

         for (int k = 0; k < num; k++) {
               if (pb.intersect(array[k])) {
                  array[k].lightup();
               }
               array[k].drawme(buffer);
         }

         pb.tick();
         pb.drawme(buffer);

         repaint();
      }
   }
}