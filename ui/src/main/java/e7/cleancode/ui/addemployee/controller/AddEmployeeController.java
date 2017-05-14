package e7.cleancode.ui.addemployee.controller;


import e7.cleancode.app.adapters.BasicAddEmployeeUseCaseFactory;
import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseController;
import e7.cleancode.app.adapters.datastructure.DefaultAddEmployeeRequestBuilder;
import e7.cleancode.app.datastructures.AddEmployeeRequest;
import e7.cleancode.app.interactors.AddEmployeeInteractor;

public class AddEmployeeController implements UseCaseController<AddEmployeeInteractor,AddEmployeeRequest> {

    private final DefaultAddEmployeeRequestBuilder requestBuilder;
    private final Repository repository;
    private final BasicAddEmployeeUseCaseFactory interactorFactory;

    public AddEmployeeController(DefaultAddEmployeeRequestBuilder<?> requestBuilder, Repository repository) {

        this.requestBuilder = requestBuilder;
        this.repository = repository;
        interactorFactory = new AddEmployeeInteractorFactory();
    }

    public AddEmployeeInteractor makeInteractor(){
        return interactorFactory.make(repository);
    }

    public AddEmployeeRequest buildRequest(){
        return requestBuilder.build();
    }


}
