package e7.TryOne.ui.addemployee.controller;

import e7.TryOne.app.adapters.RequestBuilder;
import e7.TryOne.app.datastructures.AddEmployeeRequest;

public class AddEmployeeRequestBuilder implements RequestBuilder {

    private AddEmployeeRequest request = new AddEmployeeRequest();

    public AddEmployeeRequest build() {

        return request;
    }

    public AddEmployeeRequestBuilder withName(String name) {
        request.employeeName = name;
        return this;
    }
}
