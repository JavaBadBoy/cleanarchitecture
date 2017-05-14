package com.cleancode.samples.decorator.adapters;

import com.cleancode.samples.decorator.adapters.Gateway;

public abstract class UseCase {
    Gateway gateway;

    public UseCase(Gateway gateway) {
        this.gateway = gateway;
    }
}
