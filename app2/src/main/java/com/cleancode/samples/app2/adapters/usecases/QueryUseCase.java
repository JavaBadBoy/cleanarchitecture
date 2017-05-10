package com.cleancode.samples.app2.adapters.usecases;

import com.cleancode.samples.app2.adapters.boundaries.Boundary;

public interface QueryUseCase<I extends Boundary,O extends Boundary> {
    O execute(I request);
}
