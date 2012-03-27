package edu.cmu.cs214.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

import edu.cmu.cs214.interfaces.AIPlugin;
import edu.cmu.cs214.interfaces.UIPlugin;

public class GamePanel extends JPanel {
	private AIPlugin aiPlugin;
	private UIPlugin uiPlugin;
	
	public GamePanel(AIPlugin aiPlugin, UIPlugin uiPlugin) {
		this.aiPlugin = aiPlugin;
		this.uiPlugin = uiPlugin;
		
		int panelWidth = uiPlugin.getWidth();
		int panelHeight = uiPlugin.getHeight();
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setBackground(uiPlugin.getBackgroundColor());
	}
	
	public void paintComponent(Graphics g){
		//super.paintComponent(g);
		//UIPlugin.draw(g, AIPlugin.getDataModel());
	}
	
	public void setupControlPanel() {
        /*
		JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        SoftBevelBorder sbb = new SoftBevelBorder(BevelBorder.RAISED);
        p1.setBorder(new CompoundBorder(sbb, eb));
        //p1.add(tempoDial);
        p1.add(Box.createVerticalStrut(10));

        JPanel p2 = new JPanel(new GridLayout(0,1,2,10));
        p2.add(startB = makeButton("Start", getBackground()));
        p2.add(loopB = makeButton("Loop", getBackground()));
        p2.add(makeButton("Clear Table", getBackground()));

        combo = new JComboBox();
        combo.addActionListener(this);
        combo.addItem("Rock Beat 1");
        combo.addItem("Rock Beat 2");
        combo.addItem("Rock Beat 3");
        p2.add(combo);

        p1.add(p2);
        p1.add(Box.createVerticalStrut(180));
        add("West", p1);
*/
	}
}
