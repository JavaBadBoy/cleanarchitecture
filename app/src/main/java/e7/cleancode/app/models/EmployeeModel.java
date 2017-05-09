package e7.cleancode.app.models;

import e7.cleancode.app.adapters.BusinessModel;
import e7.cleancode.app.adapters.builders.BasicEmployeeModelViewBuilder;

import java.util.Collections;

public class EmployeeModel extends BusinessModel<BasicEmployeeModelViewBuilder> {


    private  long id;
    private  String name;

    public EmployeeModel(long id, String name) {


        if(id <0)
            throw new EmployeeModelInvalidIdRuntimeException();
        if(validator.isNull(Collections.singletonList(name)) || validator.isEmpty(Collections.singletonList(name)))
            throw new EmployeeModelInvalidEmployeeNameRuntimeException();

        this.id = id;
        this.name = name;
    }

    public void view(BasicEmployeeModelViewBuilder builder) {
        builder.withName(this.name).withId(this.id);

    }

    private class EmployeeModelInvalidIdRuntimeException extends RuntimeException {
    }

    private class EmployeeModelInvalidEmployeeNameRuntimeException extends RuntimeException {
    }
}
