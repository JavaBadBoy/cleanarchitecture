package e7.cleancode.ui.updateemployee.controller;

import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractorFactory;
import e7.cleancode.app.interactors.UpdateEmployeeInteractor;

public class UpdateEmployeeInteractorFactory implements UseCaseInteractorFactory {
    private Repository repository;

    public UpdateEmployeeInteractorFactory(Repository repository) {

        this.repository = repository;
    }

    public UpdateEmployeeInteractor make() {
        return new UpdateEmployeeInteractor(repository);
    }
}
