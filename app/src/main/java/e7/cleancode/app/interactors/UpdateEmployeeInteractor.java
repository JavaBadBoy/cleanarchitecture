package e7.cleancode.app.interactors;

import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractor;
import e7.cleancode.app.datastructures.UpdateEmployeeRequest;
import e7.cleancode.app.datastructures.UpdateEmployeeResponse;

public class UpdateEmployeeInteractor extends UseCaseInteractor<UpdateEmployeeRequest,UpdateEmployeeResponse> {

    private final Repository repository;

    public UpdateEmployeeInteractor(Repository repository) {
        this.repository = repository;
    }

    public UpdateEmployeeResponse execute(UpdateEmployeeRequest input) {
        UpdateEmployeeResponse updateEmployeeResponse = new UpdateEmployeeResponse();
        updateEmployeeResponse.status="OK";
        return updateEmployeeResponse;
    }
}
