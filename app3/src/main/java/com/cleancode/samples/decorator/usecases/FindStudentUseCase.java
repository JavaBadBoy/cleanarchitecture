package com.cleancode.samples.decorator.usecases;

import com.cleancode.samples.decorator.adapters.Gateway;
import com.cleancode.samples.decorator.adapters.QueryUseCase;
import com.cleancode.samples.decorator.adapters.StudentDataset;

public class FindStudentUseCase extends QueryUseCase<StudentDataset,StudentDataset> {

    public FindStudentUseCase(Gateway gateway) {
        super(gateway);
    }

    @Override
    StudentDataset execute(StudentDataset request) {
        StudetnModelViewBuilder builder = new StudetnModelViewBuilder();
            gateway.findById().view(builder);
        return builder.build();
    }
}
