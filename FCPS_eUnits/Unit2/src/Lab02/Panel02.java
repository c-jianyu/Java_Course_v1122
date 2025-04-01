package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class Panel02 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.YELLOW);
		int x=100;
		int y=75;
		int r=10;
		for (int i=0;i<7;i++) {
				g.fillOval(x, y, r*2, r*2);
				x+=20;
		}
		for (int i=0;i<9;i++) {
				g.fillOval(x, y, r*2, r*2);
				y+=20;
		}
		for (int i=0;i<7;i++) {
			g.fillOval(x, y, r*2, r*2);
			x-=20;
		}
		for (int i=0;i<9;i++) {
			g.fillOval(x, y, r*2, r*2);
			y-=20;
		}
		g.fillRect(x+10, y+10, 140, 180);
		ImageIcon thomas = new ImageIcon("C:\\Users\\user\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Unit1\\src\\Lab02\\tj.jpg");
		g.drawImage(thomas.getImage(), 115,95,null);
		
		g.setFont(new Font("Serif",Font.BOLD,30));
		g.setColor(new Color(255,255,255));
		g.drawString("Our Fearless Leader",70,320);
	}
}
