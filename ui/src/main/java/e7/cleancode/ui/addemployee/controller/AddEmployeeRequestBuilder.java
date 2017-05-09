package e7.cleancode.ui.addemployee.controller;

import e7.cleancode.app.adapters.RequestBuilder;
import e7.cleancode.app.datastructures.AddEmployeeRequest;

public class AddEmployeeRequestBuilder implements RequestBuilder {

    private AddEmployeeRequest request = new AddEmployeeRequest();

    public AddEmployeeRequest build() {

        return request;
    }

    public AddEmployeeRequestBuilder withName(String name) {
        request.employeeName = name;
        return this;
    }

    public AddEmployeeRequestBuilder withId(long id) {
        request.employeeId = id;
        return this;
    }
}
