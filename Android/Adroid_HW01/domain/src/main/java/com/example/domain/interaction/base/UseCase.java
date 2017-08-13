package com.example.domain.interaction.base;


public abstract class UseCase<InParam, OutParam> {


    protected abstract OutParam builtUseCase();

    public OutParam execute(InParam param) {


        return builtUseCase();
    }

}
