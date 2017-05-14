package com.cleancode.samples.decorator.usecases;

import com.cleancode.samples.decorator.adapters.StudentDataset;
import com.cleancode.samples.decorator.adapters.StudentDatasetBuilder;

public class StudetnModelViewBuilder implements StudentDatasetBuilder<StudentModelView> {

    @Override
    public StudentDataset build() {
        return new StudentModelView();
    }
}
