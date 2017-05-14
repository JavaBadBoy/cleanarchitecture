package com.cleancode.samples.decorator.adapters;


public abstract class CommandUseCase<D extends Dataset> extends UseCase{

    public CommandUseCase(Gateway gateway) {
        super(gateway);
    }

    abstract void execute(D request);

}
