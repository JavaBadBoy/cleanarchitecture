package e7.cleancode.ui;

import e7.cleancode.app.datastructures.AddEmployeeResponse;
import e7.cleancode.app.datastructures.UpdateEmployeeResponse;
import e7.cleancode.ui.addemployee.controller.AddEmployeeRequestBuilder;
import e7.cleancode.ui.addemployee.controller.EmployeeController;
import e7.cleancode.ui.repositories.InMemoryRepository;
import e7.cleancode.ui.updateemployee.controller.UpdateEmployeeController;
import e7.cleancode.ui.updateemployee.controller.UpdateEmployeeRequestBuilder;

public class Main {


    public static void main(String[] args) {
        AddEmployeeRequestBuilder requestBuilder = new AddEmployeeRequestBuilder().withName("Mousa");
        EmployeeController controller = new EmployeeController(requestBuilder,new InMemoryRepository());
        AddEmployeeResponse response = controller.makeInteractor().execute(controller.buildRequest());
        System.out.println(response.id);


        UpdateEmployeeController updateEmployeeController = new UpdateEmployeeController(new UpdateEmployeeRequestBuilder(),new InMemoryRepository());
        UpdateEmployeeResponse updateResponse = updateEmployeeController.makeInteractor().execute(updateEmployeeController.buildRequest());
        System.out.println(updateResponse.status);

    }
}
