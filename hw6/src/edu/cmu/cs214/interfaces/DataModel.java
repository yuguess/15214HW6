package edu.cmu.cs214.interfaces;


/**
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface DataModel {
	/**
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	Object getObject(int row, int column);
	
	/**
	 * 
	 * @param row
	 * @param column
	 * @param obj
	 */
	void setObject(int row, int column, Object obj);
	
	/**
	 * 
	 * @return
	 */
	int getRowCount();
	
	/**
	 * 
	 * @return
	 */
	int getColumnCount();
	
	/**
	 * 
	 * @param row
	 * @param column
	 */
	void createDataModel(int row, int column);
}
