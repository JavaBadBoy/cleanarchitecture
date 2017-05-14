package com.cleancode.samples.decorator.usecases;

import com.cleancode.samples.decorator.adapters.CommandUseCase;
import com.cleancode.samples.decorator.adapters.Gateway;
import com.cleancode.samples.decorator.adapters.StudentDataset;

public class AddStudentUseCase extends CommandUseCase<StudentDataset> {

    public AddStudentUseCase(Gateway gateway) {
        super(gateway);
    }

    @Override
    void execute(StudentDataset request) {
        gateway.save(new StudentModel());


    }




}
