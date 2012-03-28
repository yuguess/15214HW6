package edu.cmu.cs214.simulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import edu.cmu.cs214.client.AISamplePlugin;
import edu.cmu.cs214.client.UISamplePlugin;
import edu.cmu.cs214.interfaces.AIPlugin;
import edu.cmu.cs214.interfaces.DataModel;
import edu.cmu.cs214.interfaces.SimulationFrame;
import edu.cmu.cs214.interfaces.UIPlugin;
import edu.cmu.cs214.ui.ControlPanel;
import edu.cmu.cs214.ui.GamePanel;

public class Simulation implements SimulationFrame {

	private GamePanel gamePanel;
	private ControlPanel ctrlPanel;
	private MatrixModel matrix;
	private AIPlugin AIPlugin;
	private UIPlugin UIPlugin;
	
	public static void main(String args[]) {
		UIPlugin sampleUIPlugin = new UISamplePlugin();
		AIPlugin sampleAIPlugin = new AISamplePlugin();
		
		Simulation simulation = new Simulation(sampleAIPlugin, sampleUIPlugin);
		simulation.setupUI();

	}
	
	public Simulation(AIPlugin aiPlugin, UIPlugin uiPlugin) {
		this.AIPlugin = aiPlugin;
		this.UIPlugin = uiPlugin;
		matrix = new MatrixModel();
		
		gamePanel = new GamePanel(this);
		ctrlPanel = new ControlPanel(this);
		
		//onCreate();
		//onStart();
		
		//gamePanel.repaint();
	}
	
	private void setupUI() {
		JFrame frame = new JFrame("Cellular Automation Simulation");
		frame.setLayout(new BorderLayout());

		frame.add(gamePanel, BorderLayout.CENTER);
		frame.add(ctrlPanel, BorderLayout.LINE_START);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public int getGamePanelWidth() {
		return UIPlugin.getWidth();
	}

	public int getGamePanelHeight() {
		return UIPlugin.getHeight();
	}
	
	public Color getGamePanelBackgroundColor() {
		return UIPlugin.getBackgroundColor();
	}
	
	public DataModel getDataModel() {
		return AIPlugin.getDataModel();
	}
	
	@Override
	public void onCreate() {
		AIPlugin.onCreate(matrix);
	}

	@Override
	public void onStart() {
		AIPlugin.initDataModel(matrix);
	}

	@Override
	public void onDestroy() {
		
	}

	@Override
	public void onUpdate() {
		AIPlugin.onUpdate();
		gamePanel.repaint();
	}

	public void draw(Graphics g) {
		UIPlugin.draw(g, getDataModel());
	}
}
