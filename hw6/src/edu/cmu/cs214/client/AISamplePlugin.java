package edu.cmu.cs214.client;

import edu.cmu.cs214.interfaces.AIPlugin;
import edu.cmu.cs214.interfaces.DataModel;

public class AISamplePlugin implements AIPlugin {
	private DataModel dataModel;
	private int rowNum;
	private int columnNum;
	
	@Override
	public void onUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataModel getDataModel() {
		return dataModel;
	}

	@Override
	public void onCreate(DataModel dataModel) {
		dataModel.createDataModel(rowNum, columnNum);
	}

	@Override
	public void initDataModel(DataModel dataModel) {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0;j < columnNum; j++) {
				dataModel.setObject(i, j, new Boolean(false));
			}
	}

}
