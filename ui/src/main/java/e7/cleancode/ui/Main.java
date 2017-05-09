package e7.cleancode.ui;

import e7.cleancode.app.adapters.datastructure.DefaultAddEmployeeRequestBuilder;
import e7.cleancode.app.datastructures.AddEmployeeResponse;
import e7.cleancode.ui.addemployee.controller.AddEmployeeRequestBuilder;
import e7.cleancode.ui.addemployee.controller.AddEmployeeController;
import e7.cleancode.ui.repositories.InMemoryRepository;

public class Main {


    public static void main(String[] args) {
        DefaultAddEmployeeRequestBuilder requestBuilder = new AddEmployeeRequestBuilder().withId(-1L).withName("Mousa");
        AddEmployeeController controller = new AddEmployeeController(requestBuilder,new InMemoryRepository());
        try {
            AddEmployeeResponse response = controller.makeInteractor().execute(controller.buildRequest());
            System.out.println(response.id + response.name);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }


    }
}
