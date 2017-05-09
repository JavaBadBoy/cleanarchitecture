package e7.cleancode.app.interactors;


import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractor;
import e7.cleancode.app.adapters.builders.EmployeeModelView;
import e7.cleancode.app.adapters.builders.EmployeeModelViewBuilder;
import e7.cleancode.app.datastructures.AddEmployeeRequest;
import e7.cleancode.app.datastructures.AddEmployeeResponse;
import e7.cleancode.app.datastructures.AddEmployeeResponseBuilder;
import e7.cleancode.app.models.EmployeeModel;

public class AddEmployeeInteractor extends UseCaseInteractor<AddEmployeeRequest,AddEmployeeResponse> {


    private Repository repository;

    public AddEmployeeInteractor(Repository repository) {

        this.repository = repository;
    }

    public AddEmployeeResponse execute(AddEmployeeRequest input) {

        EmployeeModel employeeModel = new EmployeeModel(1L,"Mousa");
        EmployeeModelViewBuilder builder = new EmployeeModelViewBuilder();
        employeeModel.view(builder);
        EmployeeModelView view = builder.build();

        return new AddEmployeeResponseBuilder().withId(view.id).build();
    }
}
