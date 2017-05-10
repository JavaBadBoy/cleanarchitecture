package com.cleancode.samples.app2.adapters.boundaries;

import com.cleancode.samples.app2.adapters.datastructure.Datastructure;

public abstract class Boundary {
    Datastructure datastructure;

    public Boundary(Datastructure datastructure) {
        this.datastructure = datastructure;
    }
}
