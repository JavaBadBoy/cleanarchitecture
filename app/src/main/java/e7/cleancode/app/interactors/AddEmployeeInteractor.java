package e7.cleancode.app.interactors;


import e7.cleancode.app.adapters.BusinessModel;
import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractor;
import e7.cleancode.app.models.modelviews.EmployeeModelViewBuilder;
import e7.cleancode.app.datastructures.AddEmployeeRequest;
import e7.cleancode.app.datastructures.AddEmployeeResponse;
import e7.cleancode.app.datastructures.AddEmployeeResponseBuilder;
import e7.cleancode.app.models.EmployeeModel;

public class AddEmployeeInteractor extends UseCaseInteractor<AddEmployeeRequest,AddEmployeeResponse> {


    private Repository repository;
    private final EmployeeModelViewBuilder builder = new EmployeeModelViewBuilder();

    public AddEmployeeInteractor(Repository repository) {

        this.repository = repository;
    }

    public AddEmployeeResponse execute(AddEmployeeRequest input) {

        EmployeeModel employeeModel = new EmployeeModel(1L,"Mousa");
        repository.save(employeeModel);

        employeeModel.view(builder);
        return new AddEmployeeResponseBuilder().withId(builder.build().id).build();
    }
}
