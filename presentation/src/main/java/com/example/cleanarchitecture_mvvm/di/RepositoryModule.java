package com.example.cleanarchitecture_mvvm.di;

import android.content.Context;

import com.example.data.data.SampleRoomDatabase;
import com.example.data.network.ApiInterface;
import com.example.data.repository.SampleRepositoryImpl;
import com.example.data.sharedpreference.SharedPreferenceHelper;
import com.example.domain.repository.SampleRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    @Provides
    @Singleton
    SampleRepository provideSampleRepository(ApiInterface apiInterface, SharedPreferenceHelper sharedPreferenceHelper, SampleRoomDatabase db, Context context) {
        return new SampleRepositoryImpl(apiInterface, sharedPreferenceHelper, db, context);
    }
}
