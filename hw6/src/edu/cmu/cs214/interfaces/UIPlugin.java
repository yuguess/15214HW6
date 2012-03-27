package edu.cmu.cs214.interfaces;

import java.awt.Color;
import java.awt.Graphics;


/**
 * This interface define the UIPlugin which will be used by client to define
 * its own UI view
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface UIPlugin {
	/**
	 * This is the most important interface in UIPlugin, the user will define 
	 * his own way of representing data for his data model. graphic is main component
	 * to draw object on, UI will draw based the content of data model 
	 * 
	 * @param graphic component plugin will draw on
	 * @param dataModel data model passed in from framework
	 */
	void draw(Graphics graphic, DataModel dataModel);
	
	/**
	 * This is interface for get width of UI, the framework will try to setup layout 
	 * according to UIPlugin’s parameter
	 * @return width of UI
	 */
	int getWidth();
	
	/**
	 * This is interface for get height of UI, the framework will try to setup layout 
	 * according to UIPlugin’s parameter
	 * @return height of UI
	 */
	int getHeight();
	
	/**
	 * This is interface for get background of UI, the framework will try to setup layout 
	 * according to UIPlugin’s parameter
	 * @return background color of UI
	 */
	Color getBackgroundColor();
	

}
