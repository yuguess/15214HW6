package edu.cmu.cs214.client;

import java.awt.Color;
import java.awt.Graphics;

import edu.cmu.cs214.interfaces.DataModel;
import edu.cmu.cs214.interfaces.UIPlugin;

public class UISamplePlugin implements UIPlugin {

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 640;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 480;
	}

	@Override
	public Color getBackgroundColor() {
		// TODO Auto-generated method stub
		return Color.white;
	}

	@Override
	public void draw(Graphics graphic, DataModel dataModel) {
		// TODO Auto-generated method stub
		
	}

}
