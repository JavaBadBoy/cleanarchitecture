package e7.cleancode.ui.addemployee.controller;

import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractorFactory;
import e7.cleancode.app.interactors.AddEmployeeInteractor;

public class AddEmployeeInteractorFactory implements UseCaseInteractorFactory {
    private Repository repository;

    public AddEmployeeInteractorFactory(Repository repository) {

        this.repository = repository;
    }

    public AddEmployeeInteractor make() {
        return new AddEmployeeInteractor(repository);
    }
}
