package com.cleancode.samples.app2.adapters.usecases;

import com.cleancode.samples.app2.adapters.boundaries.Boundary;

public interface CommandUseCase<I extends Boundary> {
    void execute(I request);
}
