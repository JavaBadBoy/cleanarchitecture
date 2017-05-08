package e7.cleancode.app.adapters;

public interface UseCaseController {

    UseCaseInteractor makeInteractor();
    Datastructure buildRequest();
}
