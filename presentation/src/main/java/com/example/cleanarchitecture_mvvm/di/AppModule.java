package com.example.cleanarchitecture_mvvm.di;

import android.content.Context;

import com.example.data.data.SampleRoomDatabase;
import com.example.data.network.ApiClient;
import com.example.data.network.ApiInterface;
import com.example.data.sharedpreference.SharedPreferenceHelper;
import com.example.domain.executor.PostExecutionThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return this.context;
    }

    @Provides
    @Singleton
    SharedPreferenceHelper provideSharedPreferenceHelper() {
        return new SharedPreferenceHelper(this.context);
    }

    @Provides
    @Singleton
    SampleRoomDatabase provideWordRoomDatabase(Context context) {
        return SampleRoomDatabase.getDatabase(this.context);
    }

    @Provides
    @Singleton
    ApiInterface provideApiInterface() {
        return ApiClient.getClient().create(ApiInterface.class);
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread() {
        return new UIThread();
    }
}
