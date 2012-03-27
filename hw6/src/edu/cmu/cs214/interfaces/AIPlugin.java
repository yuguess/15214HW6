package edu.cmu.cs214.interfaces;

/**
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface AIPlugin {
	/**
	 * 
	 * @param dataModel
	 */
	void onCreate(DataModel dataModel);
	
	/**
	 * 
	 * @param dataModel
	 */
	void initDataModel(DataModel dataModel);
	
	/**
	 * 
	 */
	void onUpdate();
	
	/**
	 * 
	 * @return
	 */
	DataModel getDataModel();
}
