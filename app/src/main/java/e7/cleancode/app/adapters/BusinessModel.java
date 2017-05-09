package e7.cleancode.app.adapters;

import e7.cleancode.app.models.ModelValidator;

public abstract class BusinessModel<B> {
    public ModelValidator validator;
    public abstract void view(B builder);
}
