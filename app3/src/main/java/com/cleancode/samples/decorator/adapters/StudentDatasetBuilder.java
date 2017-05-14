package com.cleancode.samples.decorator.adapters;

public interface StudentDatasetBuilder<D extends StudentDataset> extends DatasetBuilder<StudentDataset> {
    @Override
    StudentDataset build();
}
