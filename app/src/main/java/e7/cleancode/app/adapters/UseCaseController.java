package e7.cleancode.app.adapters;

public interface UseCaseController<I extends UseCaseInteractor,D extends Datastructure> {
    I makeInteractor();
    D buildRequest();
}
