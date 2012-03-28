package edu.cmu.cs214.ui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import edu.cmu.cs214.simulation.Simulation;

public class GamePanel extends JPanel {
	private Simulation simulation;
	
	public GamePanel(Simulation simulation) {
		this.simulation = simulation;
		setupGUI();
	}
	
	private void setupGUI() {
		int panelWidth = simulation.getGamePanelWidth();
		int panelHeight = simulation.getGamePanelHeight();
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setBackground(simulation.getGamePanelBackgroundColor());
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		simulation.draw(g);
	}
	
	public void setupControlPanel() {

	}
}
