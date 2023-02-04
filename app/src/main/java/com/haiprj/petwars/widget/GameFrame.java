package com.haiprj.petwars.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.haiprj.base.mvp.view.ViewResult;
import com.haiprj.base.widget.BaseGameFrame;
import com.haiprj.petwars.mvp.presenter.GameDataPresenter;

@SuppressLint("ViewConstructor")
public class GameFrame extends BaseGameFrame implements ViewResult {

    private final GameDataPresenter dataPresenter = new GameDataPresenter(this);
    private final String pathDirMap;

    public GameFrame(@NonNull Context context, String pathDirMap) {
        super(context);
        this.pathDirMap = pathDirMap;
    }

    public GameFrame(@NonNull Context context, @Nullable AttributeSet attrs, String pathDirMap) {
        super(context, attrs);
        this.pathDirMap = pathDirMap;
    }

    public GameFrame(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, String pathDirMap) {
        super(context, attrs, defStyleAttr);
        this.pathDirMap = pathDirMap;
    }

    public GameFrame(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes, String pathDirMap) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.pathDirMap = pathDirMap;
    }

    @Override
    protected void init() {
        super.init();
    }

    private void drawMap() {
        dataPresenter.getMatrixMap(pathDirMap);
    }
    @Override
    protected void update() {
        super.update();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    protected void onTouchDown(View view, MotionEvent motionEvent) {
        super.onTouchDown(view, motionEvent);
    }

    @Override
    protected void onTouchUp(View view, MotionEvent motionEvent) {
        super.onTouchUp(view, motionEvent);
    }

    @Override
    protected void onTouchMove(View view, MotionEvent motionEvent) {
        super.onTouchMove(view, motionEvent);
    }

    @Override
    public void onViewAvailable(String key, Object... objects) {

    }

    @Override
    public void onViewNotAvailable(String mess) {

    }
}
