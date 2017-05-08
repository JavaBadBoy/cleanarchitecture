package e7.TryOne.app.interactors;


import e7.TryOne.app.adapters.Repository;
import e7.TryOne.app.adapters.UseCaseInteractor;
import e7.TryOne.app.datastructures.AddEmployeeRequest;
import e7.TryOne.app.datastructures.AddEmployeeResponse;
import e7.TryOne.app.datastructures.AddEmployeeResponseBuilder;

public class AddEmployeeInteractor extends UseCaseInteractor<AddEmployeeRequest,AddEmployeeResponse> {


    private Repository repository;

    public AddEmployeeInteractor(Repository repository) {

        this.repository = repository;
    }

    public AddEmployeeResponse execute(AddEmployeeRequest input) {

        return new AddEmployeeResponseBuilder().withId(10L).build();
    }
}
