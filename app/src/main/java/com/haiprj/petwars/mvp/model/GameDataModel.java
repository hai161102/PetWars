package com.haiprj.petwars.mvp.model;

import com.haiprj.base.mvp.model.DataModel;
import com.haiprj.base.mvp.model.DataResult;
import com.haiprj.petwars.utils.GameMatrix;

public class GameDataModel extends DataModel {

    GameMatrix gameMatrix;
    public GameDataModel(DataResult dataResult) {
        super(dataResult);

    }

    public void getMatrixMap(String pathDirMap) {
        
    }
}
