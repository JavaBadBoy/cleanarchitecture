package com.cleancode.samples.app2.adapters.factories;

import com.cleancode.samples.app2.adapters.repositories.Repository;
import com.cleancode.samples.app2.adapters.usecases.CommandUseCase;

public interface CommandUseCaseFactory<R extends Repository, U extends CommandUseCase> {
    U make(R repository);
    U make();
}
