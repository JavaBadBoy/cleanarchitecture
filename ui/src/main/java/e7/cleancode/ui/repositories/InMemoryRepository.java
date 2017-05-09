package e7.cleancode.ui.repositories;

import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.models.EmployeeModel;

public class InMemoryRepository implements Repository<EmployeeModel>{
    public EmployeeModel save(EmployeeModel businessModel) {
        return new EmployeeModel(1L,"mousa");
    }

}
