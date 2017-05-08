package e7.TryOne.ui.addemployee.controller;


import e7.TryOne.app.adapters.*;
import e7.TryOne.app.datastructures.AddEmployeeRequest;
import e7.TryOne.app.interactors.AddEmployeeInteractor;

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
