package e7.cleancode.ui.addemployee.controller;


import e7.cleancode.app.adapters.*;
import e7.cleancode.app.datastructures.AddEmployeeRequest;
import e7.cleancode.app.interactors.AddEmployeeInteractor;

public class EmployeeController implements UseCaseController {

    private final RequestBuilder requestBuilder;
    private final UseCaseInteractorFactory interactorFactory;

    public EmployeeController(AddEmployeeRequestBuilder requestBuilder, Repository repository) {

       this.requestBuilder = requestBuilder;
        interactorFactory = new AddEmployeeInteractorFactory(repository);
    }

    public AddEmployeeInteractor makeInteractor(){
        return (AddEmployeeInteractor) interactorFactory.make();
    }

    public AddEmployeeRequest buildRequest(){
        return (AddEmployeeRequest) requestBuilder.build();
    }


}
