package com.example.domain.repository;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public interface SampleRepository {

    Single<Integer> sum(int a, int b);




}
