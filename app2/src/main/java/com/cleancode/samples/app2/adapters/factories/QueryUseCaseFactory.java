package com.cleancode.samples.app2.adapters.factories;

import com.cleancode.samples.app2.adapters.repositories.Repository;
import com.cleancode.samples.app2.adapters.usecases.QueryUseCase;

public interface QueryUseCaseFactory<R extends Repository, U extends QueryUseCase> {
    U make(R repository);
    U make();
}
