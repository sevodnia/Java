package com.example.domain.interaction.base;

/**
 * абстрактый класс для всех моих UseCase
 */

public abstract class UseCaseThis<OutParam> {

    protected abstract OutParam builtUseCase();

    public OutParam execute() {


        return builtUseCase();
    }


}
