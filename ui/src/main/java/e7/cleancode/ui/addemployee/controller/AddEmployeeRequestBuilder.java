package e7.cleancode.ui.addemployee.controller;

import e7.cleancode.app.adapters.datastructure.DefaultAddEmployeeRequestBuilder;
import e7.cleancode.app.datastructures.AddEmployeeRequest;

public class AddEmployeeRequestBuilder implements DefaultAddEmployeeRequestBuilder {

    private AddEmployeeRequest request = new AddEmployeeRequest();

    public AddEmployeeRequest build() {
        return request;
    }

    public DefaultAddEmployeeRequestBuilder<?> withId(long id) {
        request.employeeId=id;
        return this;
    }

    public DefaultAddEmployeeRequestBuilder<?> withName(String name) {
        request.employeeName=name;
        return this;
    }


}
