package Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel01 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.GREEN);
		g.drawLine(0, 350, 400, 350);
		g.setColor(Color.black);
		g.drawRect(100, 200, 150, 150);
		g.setColor(Color.black);
		g.fillRect(150, 275, 50, 75);
		g.setColor(Color.YELLOW);
		g.fillOval(300, 75, 50, 50);
		g.setColor(Color.black);
		int x[]= {75,175,275};
		int y[]= {200,150,200};
		g.drawPolygon(x, y, 3);
		
		
		g.setFont(new Font("Serif",Font.BOLD,10));
		g.setColor(new Color(255,255,255));
		g.drawString("Welcome Home",40,40);
	}
}
