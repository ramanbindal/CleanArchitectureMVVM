package com.example.cleanarchitecture_mvvm.ui.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cleanarchitecture_mvvm.MainApplication;
import com.example.cleanarchitecture_mvvm.R;
import com.example.cleanarchitecture_mvvm.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainViewModel> implements MainNavigator  {

    private TextView textView;
    @Inject
    ViewModelProvider.Factory viewModelFactory;

    MainViewModel mainViewModel;

    @Override
    public MainViewModel getViewModel() {
        return mainViewModel;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MainApplication) getApplicationContext()).getComponent().inject(this);


        textView = (TextView) findViewById(R.id.activity_main_text_view);

        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);

        mainViewModel.setNavigator(this);
        mainViewModel.callGetSum(4, 5);



    }

    @Override
    public void displaySum(Integer integer) {
        textView.setText(integer.toString());
    }

}
