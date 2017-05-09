package e7.cleancode.ui.repositories;

import e7.cleancode.app.adapters.BusinessModel;
import e7.cleancode.app.adapters.DefaultEmployeeRepository;
import e7.cleancode.app.models.EmployeeModel;
import e7.cleancode.app.models.modelviews.EmployeeModelView;
import e7.cleancode.app.models.modelviews.EmployeeModelViewBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository implements DefaultEmployeeRepository<EmployeeModel> {

    public BusinessModel save(BusinessModel businessModel) {
        businessModel.view(modelViewBuilder);
        EmployeeModelView view = modelViewBuilder.build();
        store.put(view.id, view);
        return new EmployeeModel(100L,view.name);
    }

    private final EmployeeModelViewBuilder modelViewBuilder = new EmployeeModelViewBuilder();
    public Map<Long, EmployeeModelView> store = new HashMap<Long, EmployeeModelView>();


    public List findAll() {
        return (List) store.values();
    }
}
