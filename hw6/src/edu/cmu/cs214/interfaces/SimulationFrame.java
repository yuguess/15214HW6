package edu.cmu.cs214.interfaces;


/**
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface SimulationFrame {
	/**
	 * 
	 */
	void onCreate();
	
	/**
	 * 
	 */
	void onStart();
	
	/**
	 * 
	 */
	void onDestroy();
	
	/**
	 * 
	 */
	void onUpdate();
}
