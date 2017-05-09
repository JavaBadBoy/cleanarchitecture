package e7.cleancode.app.models;

import e7.cleancode.app.adapters.BusinessModel;
import e7.cleancode.app.adapters.builders.BasicEmployeeModelViewBuilder;

public class EmployeeModel extends BusinessModel<BasicEmployeeModelViewBuilder> {


    private  long id;
    private  String name;

    public EmployeeModel(long id, String name) {

        this.id = id;
        this.name = name;
    }

    public void view(BasicEmployeeModelViewBuilder builder) {
        builder.withName(this.name).withId(this.id);

    }
}
