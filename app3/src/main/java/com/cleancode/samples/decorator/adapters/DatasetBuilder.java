package com.cleancode.samples.decorator.adapters;

public interface DatasetBuilder<D extends Dataset> {

    D build();

}
