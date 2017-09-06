package com.doschechko.matylionak.domain.interaction;

import com.doschechko.matylionak.domain.entity.Anekdot;

import java.util.ArrayList;
import java.util.List;


public class UseCaseGetAndekdot {

    List<Anekdot> list = new ArrayList<>();


    public List<Anekdot> getList() {
        for (int i = 0; i < 20; i++) {
            Anekdot anekdot = new Anekdot("dcsdcdcsddscdsd" +
                    "sdcdcsdcsdcsdcs  dda" +
                    " das sdddddddddddd csccscsdcscs" +
                    "dadas " +
                    " adsdada");

            list.add(anekdot);
        }

        return list;
    }
}
