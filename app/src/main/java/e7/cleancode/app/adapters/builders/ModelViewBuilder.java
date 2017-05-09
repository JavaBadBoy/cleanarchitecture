package e7.cleancode.app.adapters.builders;

import e7.cleancode.app.adapters.Datastructure;

public interface ModelViewBuilder<D extends Datastructure> {
    D build();
}
