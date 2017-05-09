package e7.cleancode.app.adapters;

import e7.cleancode.app.adapters.datastructure.Datastructure;

public interface UseCaseController<I extends UseCaseInteractor,D extends Datastructure> {
    I makeInteractor();
    D buildRequest();
}
