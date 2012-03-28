package edu.cmu.cs214.interfaces;


/**
 * This interface define the data model which will be as inside framework, most of 
 * automaton is based on matrix data model, so in this interface, some of method are
 * defined especially for matrix data  
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public interface DataModel {
	/**
	 * get object store at certain location of data model
	 * 
	 * @param row row index of data model
	 * @param column column index of data model
	 * @return
	 */
	Object getObject(int row, int column);
	
	/**
	 * set object at certain location of data model
	 * @param row row index of data model
	 * @param column column index of data model
	 * @param obj the object store at ceratin location
	 */
	void setObject(int row, int column, Object obj);
	
	/**
	 * get row number of data model
	 * @return
	 */
	int getRowCount();
	
	/**
	 * get column number of data model
	 * @return
	 */
	int getColumnCount();
	
	/**
	 * this define how data model will be created
	 * 
	 * @param row row size of data model
	 * @param column column size of data model
	 */
	void createDataModel(int row, int column);
}
