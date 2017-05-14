package com.cleancode.samples.decorator.adapters;

public abstract class QueryUseCase<I extends Dataset, O extends Dataset> extends UseCase {

    public QueryUseCase(Gateway gateway) {
        super(gateway);
    }

    abstract O execute(I request);
}
