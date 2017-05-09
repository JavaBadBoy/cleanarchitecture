package e7.cleancode.app.models.modelviews;

import e7.cleancode.app.adapters.builders.BasicEmployeeModelViewBuilder;

public class EmployeeModelViewBuilder implements BasicEmployeeModelViewBuilder {

    private EmployeeModelView view = new EmployeeModelView();

    public BasicEmployeeModelViewBuilder withId(long id) {
        view.id=id;
        return this;
    }

    public BasicEmployeeModelViewBuilder withName(String name) {
        view.name=name;
        return this;
    }

    public EmployeeModelView build() {
        return view;
    }
}
