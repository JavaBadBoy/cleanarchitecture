package e7.cleancode.app.adapters.builders;

import e7.cleancode.app.models.modelviews.EmployeeModelView;

public interface BasicEmployeeModelViewBuilder extends BasicDatastructureBuilder<EmployeeModelView> {
    BasicEmployeeModelViewBuilder withId(long id);
    BasicEmployeeModelViewBuilder withName(String name);
}
