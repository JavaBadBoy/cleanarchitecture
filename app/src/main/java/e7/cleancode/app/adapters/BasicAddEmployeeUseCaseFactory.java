package e7.cleancode.app.adapters;

import e7.cleancode.app.interactors.AddEmployeeInteractor;

public interface BasicAddEmployeeUseCaseFactory<I extends AddEmployeeInteractor, R extends Repository> {
    I make(R repository);
}
