package com.example.cleanarchitecture_mvvm.di;

import com.example.domain.executor.PostExecutionThread;
import com.example.domain.repository.SampleRepository;
import com.example.domain.usecases.GetSum;

import dagger.Module;
import dagger.Provides;

@Module
public class UseCaseModule {

    @Provides
    GetSum provideGetSum(PostExecutionThread postExecutionThread, SampleRepository sampleRepository) {
        return new GetSum(postExecutionThread, sampleRepository);
    }
}
