package e7.cleancode.ui.updateemployee.controller;

import e7.cleancode.app.adapters.Datastructure;
import e7.cleancode.app.adapters.RequestBuilder;
import e7.cleancode.app.datastructures.UpdateEmployeeRequest;

public class UpdateEmployeeRequestBuilder implements RequestBuilder{
    public Datastructure build() {
        return new UpdateEmployeeRequest();
    }
}
