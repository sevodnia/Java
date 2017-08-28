package com.example.domain.interaction.useCaseForHW11;

import com.doschechko.matylionak.data.entity.People;
import com.doschechko.matylionak.data.net.RestApiForHW11.RestServiceForHW11;

import io.reactivex.Observable;


public class UseCaseOnlyOnePeople {

    RestServiceForHW11 data = RestServiceForHW11.getInstance();//объект USECCASE
    public Observable<People> load(String s) {
        Observable<People> observable = data.getPeopleByName(s);
        return observable;
    }


}
