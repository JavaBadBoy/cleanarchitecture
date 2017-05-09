package e7.cleancode.ui.addemployee.controller;

import e7.cleancode.app.adapters.BasicAddEmployeeUseCaseFactory;
import e7.cleancode.app.adapters.Repository;
import e7.cleancode.app.adapters.UseCaseInteractorFactory;
import e7.cleancode.app.interactors.AddEmployeeInteractor;
import e7.cleancode.ui.repositories.InMemoryRepository;

public class AddEmployeeInteractorFactory implements BasicAddEmployeeUseCaseFactory<AddEmployeeInteractor,InMemoryRepository> {
    private Repository repository;


    public AddEmployeeInteractor make(InMemoryRepository repository) {
        return new AddEmployeeInteractor(repository);
    }
}
