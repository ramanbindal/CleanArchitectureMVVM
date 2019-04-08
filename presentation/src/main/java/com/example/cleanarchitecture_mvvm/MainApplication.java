package com.example.cleanarchitecture_mvvm;

import android.app.Application;

import com.example.cleanarchitecture_mvvm.di.AppModule;
import com.example.cleanarchitecture_mvvm.di.DaggerMyComponent;
import com.example.cleanarchitecture_mvvm.di.MyComponent;

public class MainApplication extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyComponent.builder().appModule(new AppModule(getApplicationContext())).build();
    }

    public MyComponent getComponent() {
        return this.component;
    }
}
