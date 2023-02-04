package com.haiprj.petwars.mvp.presenter;

import com.haiprj.base.mvp.presenter.DataPresenter;
import com.haiprj.base.mvp.view.ViewResult;
import com.haiprj.petwars.mvp.model.GameDataModel;

public class GameDataPresenter extends DataPresenter {
    public GameDataPresenter(ViewResult viewResult) {
        super(viewResult);
        dataModel = new GameDataModel(this);
    }

    public void getMatrixMap(String pathDirMap) {
        ((GameDataModel) dataModel).getMatrixMap(pathDirMap);
    }
}
