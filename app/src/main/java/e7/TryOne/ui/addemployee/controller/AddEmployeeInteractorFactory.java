package e7.TryOne.ui.addemployee.controller;

import e7.TryOne.app.adapters.Repository;
import e7.TryOne.app.adapters.UseCaseInteractorFactory;
import e7.TryOne.app.interactors.AddEmployeeInteractor;

public class AddEmployeeInteractorFactory implements UseCaseInteractorFactory {
    private Repository repository;

    public AddEmployeeInteractorFactory(Repository repository) {

        this.repository = repository;
    }

    public AddEmployeeInteractor make() {
        return new AddEmployeeInteractor(repository);
    }
}
