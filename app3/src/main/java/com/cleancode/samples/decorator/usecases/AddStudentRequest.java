package com.cleancode.samples.decorator.usecases;

import com.cleancode.samples.decorator.adapters.StudentDataset;

public class AddStudentRequest implements StudentDataset {
    public String id;
    public String name;
    public String major;
}
