package edu.cmu.cs214.simulation;

import edu.cmu.cs214.interfaces.DataModel;

public class MatrixModel implements DataModel {
	protected Object[][] mat;
	private int columnCount;
	private int rowCount;
	
	public MatrixModel() {
		
	}
	
	@Override
	public Object getObject(int row, int column) {
		return mat[row][column];
	}

	@Override
	public void setObject(int row, int column, Object obj) {
		mat[row][column] = obj;
	}

	@Override
	public int getRowCount() {
		return rowCount;
	}

	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public void createDataModel(int row, int column) {
		rowCount = row;
		columnCount = column;
		mat = new Object[row][column];
	}
}
