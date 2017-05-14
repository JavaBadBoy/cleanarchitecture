package com.cleancode.samples.decorator.adapters;

public interface Gateway<M extends BusinessEntityModel> {
    default void save(M model) {

    }

    default M findById() {
        return null;
    }
}
