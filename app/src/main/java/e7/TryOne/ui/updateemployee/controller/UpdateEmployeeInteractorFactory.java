package e7.TryOne.ui.updateemployee.controller;

import e7.TryOne.app.adapters.Repository;
import e7.TryOne.app.adapters.UseCaseInteractor;
import e7.TryOne.app.adapters.UseCaseInteractorFactory;
import e7.TryOne.app.interactors.UpdateEmployeeInteractor;

public class UpdateEmployeeInteractorFactory implements UseCaseInteractorFactory {
    private Repository repository;

    public UpdateEmployeeInteractorFactory(Repository repository) {

        this.repository = repository;
    }

    public UpdateEmployeeInteractor make() {
        return new UpdateEmployeeInteractor(repository);
    }
}
