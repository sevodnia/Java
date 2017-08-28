package com.example.domain.interaction.useCaseForHW11;

import com.doschechko.matylionak.data.entity.People;
import com.doschechko.matylionak.data.net.RestApiForHW11.RestServiceForHW11;

/**
 * на вход подается обхект peope and id
 */

public class UseCaseSavePeople {
    RestServiceForHW11 data = RestServiceForHW11.getInstance();//объект USECCASE


    //метод с помощью которого мы сохраняем изменения в объекте
    public void save(String s, People people) {
        data.saveProfile(s, people);
    }
}
