package starting.view;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

import java.awt.Graphics;
import java.awt.Color;

import starting.model.Model;
import starting.model.Node;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model) {
		this.model = model;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (model == null) {
			return;
		}
		
		// DRAW EVERYTHING HERE
		//g.drawString("test", 100, 100);
		
		g.setColor(Color.RED);
		g.drawLine(200, 50, 235, 105); //1 to 3
		g.drawLine(235, 105, 270, 160); //3 to 6
		g.drawLine(270, 160, 305, 215); //6 to 10
		
		g.drawLine(200, 50, 165, 105); //1 to 2
		g.drawLine(165, 105, 130, 160); //2 to 4
		g.drawLine(130, 160, 95, 215); //4 to 7
		
		g.setColor(Color.GREEN);
		g.drawLine(165, 105, 235, 105); //2 to 3
		g.drawLine(130, 160, 200, 160); //4 to 5
		g.drawLine(200, 160, 270, 160); //5 to 6
		g.drawLine(95, 215, 165, 215); //7 to 8
		g.drawLine(165, 215, 235, 215); //8 to 9
		g.drawLine(235, 215, 305, 215); //9 to 10
		
		g.setColor(Color.BLUE);
		g.drawLine(165, 105, 200, 160); //2 to 5
		g.drawLine(235, 105, 200, 160); //3 to 5
		g.drawLine(165, 215, 200, 160); //8 to 5
		g.drawLine(235, 215, 200, 160); //9 to 5
		g.drawLine(165, 215, 130, 160); //8 to 4
		g.drawLine(235, 215, 270, 160); //9 to 6
		
	}
	
}
