package com.example.domain.usecases;

import com.example.domain.base.SingleUseCase;
import com.example.domain.executor.PostExecutionThread;
import com.example.domain.repository.SampleRepository;

import io.reactivex.Single;

public class GetSum extends SingleUseCase<Integer, GetSum.Params> {

    //take repository here
    private SampleRepository sampleRepository;

    public GetSum(PostExecutionThread postExecutionThread, SampleRepository sampleRepository) {
        super(postExecutionThread);
        this.sampleRepository = sampleRepository;
    }

    @Override
    public Single<Integer> buildUseCaseObservable(final Params params) {
        return sampleRepository.sum(params.number1, params.number2);
    }

    public static final class Params {

        private int number1;
        private int number2;

        private Params(int number1, int number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        public static GetSum.Params getSum(int number1, int number2) {
            return new GetSum.Params(number1, number2);
        }
    }
}
