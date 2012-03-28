package edu.cmu.cs214.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import edu.cmu.cs214.interfaces.DataModel;
import edu.cmu.cs214.interfaces.UIPlugin;

/**
 * This class define a simple automaton UIPlugin which use the
 * framework UI interface
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public class UISamplePlugin implements UIPlugin {
	private int rowGrid = 17;
	private int columnGrid = 17;
	private int unitLength = 30;
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return columnGrid * unitLength;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return rowGrid * unitLength;
	}

	@Override
	public Color getBackgroundColor() {
		// TODO Auto-generated method stub
		return Color.WHITE;
	}

	@Override
	public void draw(Graphics g, DataModel dataModel) {
		if (dataModel != null) {
			drawGridLine(g);	
			for (int i = 0; i < rowGrid; i++) 
				for (int j = 0; j < columnGrid; j++) {
					boolean bool = (Boolean) (dataModel.getObject(i, j));
					if (bool == true) {
						drawGrid(i, j, g);
					}
				}
		} else {

			g.drawString("15214 Homework6 Sample Plugin", 5 * unitLength, 4 * unitLength);
		}
	}

	private void drawGrid(int i, int j, Graphics g) { 
		g.setColor(Color.BLACK);
		g.fillRect(i * unitLength + 1, j * unitLength + 1, unitLength - 1, unitLength - 1);
	}
	
	private void clearGrid(int i, int j, Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(i * unitLength + 1, j * unitLength + 1, unitLength - 1, unitLength - 1);
	}

	private void drawGridLine(Graphics g) {
		for (int i = 0; i < columnGrid; i++) {
			g.drawLine(i * unitLength, 0, i * unitLength, getHeight());
		}
		
		for (int i = 0; i < rowGrid; i++) {
			g.drawLine(0, i * unitLength, getWidth(), i * unitLength);
		}
	}

}
