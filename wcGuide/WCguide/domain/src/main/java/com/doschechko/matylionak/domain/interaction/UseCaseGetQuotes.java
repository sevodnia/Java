package com.doschechko.matylionak.domain.interaction;


import android.util.Log;

import com.doschechko.matylionak.domain.entity.Quote;

import java.util.ArrayList;

public class UseCaseGetQuotes {

    public UseCaseGetQuotes() {
        Log.e("F", " UseCaseGetQuotes!!!!");

    }

    ArrayList<Quote> list = new ArrayList<>();

    public ArrayList<Quote> getList() {

        Log.e("F", " UseCaseGetQuotes!!!!");

        for (int i = 0; i < 10; i++) {
            list.add(new Quote("sdcdscscsdcsdcscscsdcsc", "dscscsc"));
        }
        return list;
    }


}
