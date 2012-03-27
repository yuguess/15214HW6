package edu.cmu.cs214.simulation;

import javax.swing.JFrame;

import edu.cmu.cs214.client.UISamplePlugin;
import edu.cmu.cs214.interfaces.AIPlugin;
import edu.cmu.cs214.interfaces.SimulationFrame;
import edu.cmu.cs214.interfaces.UIPlugin;
import edu.cmu.cs214.ui.GamePanel;

public class Simulation implements SimulationFrame {

	private GamePanel gamePanel;
	private MatrixModel matrix;
	private AIPlugin aiPlugin;
	private UIPlugin uiPlugin;
	
	public Simulation(AIPlugin aiPlugin, UIPlugin uiPlugin) {
		this.aiPlugin = aiPlugin;
		this.uiPlugin = uiPlugin;
		
		gamePanel = new GamePanel(aiPlugin, uiPlugin);
	}
	
	public static void main(String args[]) {
		
		UIPlugin sampleUIPlugin = new UISamplePlugin();
		
		Simulation simulation = new Simulation(null, sampleUIPlugin);
		simulation.setupUI();
	}
	
	private void setupUI() {
		JFrame frame = new JFrame("Cellular Automation Simulation");

		frame.add(gamePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void onCreate() {
		aiPlugin.onCreate(matrix);
	}

	@Override
	public void onStart() {
		aiPlugin.initDataModel(matrix);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onUpdate() {
		// TODO Auto-generated method stub
	}
}
