package e7.cleancode.ui.updateemployee.controller;

import e7.cleancode.app.adapters.UseCaseController;
import e7.cleancode.app.datastructures.UpdateEmployeeRequest;
import e7.cleancode.app.interactors.UpdateEmployeeInteractor;
import e7.cleancode.ui.repositories.InMemoryRepository;

public class UpdateEmployeeController implements UseCaseController {

    private final UpdateEmployeeInteractorFactory updateEmployeeInteractorFactory;
    private UpdateEmployeeRequestBuilder requestBuilder;

    public UpdateEmployeeController(UpdateEmployeeRequestBuilder updateEmployeeRequestBuilder, InMemoryRepository inMemoryRepository) {
        this.requestBuilder = updateEmployeeRequestBuilder;
        this.updateEmployeeInteractorFactory = new UpdateEmployeeInteractorFactory(inMemoryRepository);
    }


    public UpdateEmployeeInteractor makeInteractor() {
        return this.updateEmployeeInteractorFactory.make();
    }

    public UpdateEmployeeRequest buildRequest() {
        return (UpdateEmployeeRequest) requestBuilder.build();
    }
}
