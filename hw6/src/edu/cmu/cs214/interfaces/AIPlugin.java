package edu.cmu.cs214.interfaces;

/**
 * This interface define AIPlugin method, the client will define his own 
 * AIPlugin by implementing this interface
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface AIPlugin {
	/**
	 * This interface create data model for the AI, then the data model will be passed 
	 * to UIPlugin for drawing purpose
	 * 
	 * @param dataModel the data model that need to be created 
	 */
	void onCreate(DataModel dataModel);
	
	/**
	 * This interface initialize the data model, different automation may have different
	 * way of initial pattern
	 *  
	 * @param dataModel the data model need to be initialized
	 */
	void initDataModel(DataModel dataModel);
	
	/**
	 * This interface define the rule of AIPlugin, this is most important interface, it define the 
	 * rule of update the data model
	 */
	void onUpdate();
	
	/**
	 * This interface define how getDataModel
	 * @return
	 */
	DataModel getDataModel();
}
