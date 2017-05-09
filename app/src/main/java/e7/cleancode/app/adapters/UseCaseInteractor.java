package e7.cleancode.app.adapters;

public abstract class UseCaseInteractor<I extends Datastructure,O extends Datastructure> {
   public abstract O execute(I input);
}
