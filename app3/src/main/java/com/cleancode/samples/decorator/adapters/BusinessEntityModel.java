package com.cleancode.samples.decorator.adapters;

public interface BusinessEntityModel<B extends DatasetBuilder> {
    void view(B builder);
}
