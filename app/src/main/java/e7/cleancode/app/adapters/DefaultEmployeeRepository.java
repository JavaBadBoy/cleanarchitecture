package e7.cleancode.app.adapters;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface DefaultEmployeeRepository<B extends BusinessModel> extends Repository {

    @Override
    default BusinessModel save(BusinessModel businessModel) {
        throw new RepositoryNotImplementedRuntimeException();
    }
}
