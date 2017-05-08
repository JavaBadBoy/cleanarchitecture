package e7.cleancode.app.adapters;

public abstract class UseCaseInteractor<I,O> {
   public abstract O execute(I input);
}
