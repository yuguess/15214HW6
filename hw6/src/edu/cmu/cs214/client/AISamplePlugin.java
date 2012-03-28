package edu.cmu.cs214.client;

import edu.cmu.cs214.interfaces.AIPlugin;
import edu.cmu.cs214.interfaces.DataModel;

/**
 * This class define a simple automaton plugin which use the
 * framework AI interface
 * 
 * @author Dalong Cheng (Andrew ID: dalongc)
 *
 */
public class AISamplePlugin implements AIPlugin {
	private DataModel dataModel;
	private int rowNum = 17;
	private int columnNum = 17;
	
	@Override
	public void onUpdate() {
		Boolean[][] nextRound = new Boolean[rowNum][columnNum];
		
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++) 
				nextRound[i][j] = false;
		
		for (int i = 1; i < rowNum - 1; i++)
			for (int j = 1; j < columnNum - 1; j++) {
				
				if (checkAround(i, j)) {
					nextRound[i][j] = true;
				} else {
					nextRound[i][j] = false;
				}
			}
		
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++) {
				if (nextRound[i][j]) {
					dataModel.setObject(i, j, new Boolean(true));
				} else {
					dataModel.setObject(i, j, new Boolean(false));
				}
			}
	}

	private boolean checkAround(int row, int col) {
		int count = 0;
		boolean cell = (Boolean) dataModel.getObject(row, col);
		for (int i = row - 1; i <= row + 1; i++)
			for (int j = col - 1; j <= col + 1; j++) {
				if (i == row && j == col) 
					continue;
				Boolean bool = (Boolean) dataModel.getObject(i, j);
				if (bool) {
					count++;
				}
			}
		
		if (cell) {
			if (count < 2) {
				return false;
			} else if (count > 3) {
				return false;
			} else if (count == 2 || count == 3){
				return true;
			}
		} else {
			if (count == 3) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public DataModel getDataModel() {
		return dataModel;
	}

	@Override
	public void onCreate(DataModel dataModel) {
		this.dataModel = dataModel;
		dataModel.createDataModel(rowNum, columnNum);
	}

	@Override
	public void initDataModel(DataModel dataModel) {
		resetDataModel();
		int rowStart = 2;
		int colStart = 2;
		
		initialSubPattern(4, 2);
		initialSubPattern(4 + 6, 2);
		
		initialSubPattern(4, 2 + 5);
		initialSubPattern(4 + 6, 2 + 5);
		
		initialSubPattern(4, 7 + 2);
		initialSubPattern(4 + 6, 7 + 2);
		
		initialSubPattern(4, 7 + 2);
		initialSubPattern(4 + 6, 7 + 2);
		
		initialSubPattern(4, 7 + 2 + 5);
		initialSubPattern(4 + 6, 7 + 2 + 5);
		
		initialSubPattern2(2, 4);
		initialSubPattern2(2 + 5, 4);
		initialSubPattern2(2 + 5 + 2, 4);
		initialSubPattern2(2 + 5 + 2 + 5, 4);
		
		initialSubPattern2(2, 10);
		initialSubPattern2(2 + 5, 10);
		initialSubPattern2(2 + 5 + 2, 10);
		initialSubPattern2(2 + 5 + 2 + 5, 10);
	}

	private void initialSubPattern(int rowStart, int colStart) {
		for (int i = 0; i < 3; i++)
			dataModel.setObject(i + rowStart, colStart, new Boolean(true));
	}
	
	private void initialSubPattern2(int rowStart, int colStart) {
		for (int i = 0; i < 3; i++)
			dataModel.setObject(rowStart, i + colStart, new Boolean(true));
	}

	private void resetDataModel() {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0;j < columnNum; j++) {
				dataModel.setObject(i, j, new Boolean(false));
			}
	}

}
