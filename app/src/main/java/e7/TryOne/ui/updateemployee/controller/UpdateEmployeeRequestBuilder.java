package e7.TryOne.ui.updateemployee.controller;

import e7.TryOne.app.adapters.Datastructure;
import e7.TryOne.app.adapters.RequestBuilder;
import e7.TryOne.app.datastructures.UpdateEmployeeRequest;

public class UpdateEmployeeRequestBuilder implements RequestBuilder{
    public Datastructure build() {
        return new UpdateEmployeeRequest();
    }
}
