package com.fengzhi.testdemo6;

import android.app.Application;

import com.vondear.rxtool.RxTool;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RxTool.init(this);
    }
}
