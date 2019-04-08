package com.example.cleanarchitecture_mvvm.di;


import com.example.cleanarchitecture_mvvm.ui.di.MainModule;
import com.example.cleanarchitecture_mvvm.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, UseCaseModule.class, RepositoryModule.class, MainModule.class})
public interface MyComponent {

    void inject(MainActivity mainActivity);


}
