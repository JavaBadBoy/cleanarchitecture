package e7.TryOne.app.interactors;

import e7.TryOne.app.adapters.Repository;
import e7.TryOne.app.adapters.UseCaseInteractor;
import e7.TryOne.app.datastructures.UpdateEmployeeRequest;
import e7.TryOne.app.datastructures.UpdateEmployeeResponse;

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
