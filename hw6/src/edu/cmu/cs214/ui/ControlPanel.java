package edu.cmu.cs214.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;



import edu.cmu.cs214.simulation.Simulation;

public class ControlPanel extends JPanel {
	private Simulation simulation;
	private JButton stepBtn;
	private JButton startBtn;
	
	public ControlPanel(Simulation argSimulation) {
		this.simulation = argSimulation;
		int ctrlPanelWidth = simulation.getGamePanelWidth() / 5;
		int ctrlPanelHeight =  simulation.getGamePanelHeight();

		setMinimumSize(new Dimension(200, ctrlPanelHeight));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		SoftBevelBorder sbb = new SoftBevelBorder(BevelBorder.RAISED);
		EmptyBorder eb = new EmptyBorder(5,5,5,5);
        setBorder(new CompoundBorder(sbb, eb));
		
		JPanel p2 = new JPanel(new GridLayout(0,1,2,10));
		p2.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(Box.createVerticalStrut(ctrlPanelHeight / 5));
	      
		startBtn = new JButton("Start");
		p2.add(startBtn);
		startBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				startBtn.setEnabled(false);
				stepBtn.setEnabled(true);
				simulation.onCreate();
				simulation.onStart();
				simulation.onUpdate();
			}
			
		});
		
		
		stepBtn = new JButton("Step");
		stepBtn.setEnabled(false);
		p2.add(stepBtn);
		stepBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				simulation.onUpdate();
			}
			
		});
		  
		add(p2);
		add(Box.createVerticalStrut(ctrlPanelHeight * 2 / 3));
	}

}
