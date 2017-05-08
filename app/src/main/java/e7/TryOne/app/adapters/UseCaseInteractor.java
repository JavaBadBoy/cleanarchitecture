package e7.TryOne.app.adapters;

public abstract class UseCaseInteractor<I,O> {
   public abstract O execute(I input);
}
