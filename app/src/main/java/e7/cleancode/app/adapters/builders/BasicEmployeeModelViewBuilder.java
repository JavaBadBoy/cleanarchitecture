package e7.cleancode.app.adapters.builders;

public interface BasicEmployeeModelViewBuilder extends ModelViewBuilder<EmployeeModelView> {
    BasicEmployeeModelViewBuilder withId(long id);
    BasicEmployeeModelViewBuilder withName(String name);
}
