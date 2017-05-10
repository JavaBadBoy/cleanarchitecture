package com.cleancode.samples.app2.adapters.models;

import com.cleancode.samples.app2.adapters.builders.DatastructureBuilder;

public interface BusinessModel<B extends DatastructureBuilder> {
    void view(B viewBuilder);

}
