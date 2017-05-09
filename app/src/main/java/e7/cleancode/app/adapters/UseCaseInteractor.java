package e7.cleancode.app.adapters;

import e7.cleancode.app.adapters.datastructure.Datastructure;

public abstract class UseCaseInteractor<I extends Datastructure,O extends Datastructure> {
   public abstract O execute(I input);
}
