package edu.cmu.cs214.interfaces;


/**
 * This interface define framework, we use classic life cycle model to define
 * the framework
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface SimulationFrame {
	/**
	 * define what to do during when the framework is created
	 */
	void onCreate();
	
	/**
	 * define behavior before update method begin execution 
	 */
	void onStart();
	
	/**
	 * define what to do when frame work update the data model
	 */
	void onUpdate();
	
	/**
	 * define behavior when frame work goes to end
	 */
	void onDestroy();
}
