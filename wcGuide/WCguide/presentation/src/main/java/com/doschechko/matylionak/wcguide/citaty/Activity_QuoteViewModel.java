package com.doschechko.matylionak.wcguide.citaty;

import android.util.Log;

import com.doschechko.matylionak.domain.interaction.UseCaseGetQuotes;
import com.doschechko.matylionak.wcguide.base.BaseFragmentViewModel;


public class Activity_QuoteViewModel implements BaseFragmentViewModel {
    public MyAdaptor adaptor = new MyAdaptor();


    @Override
    public void init() {

        //вызов USECASE на получение цитат
        //добавление в адаптер коллекции цитат
        UseCaseGetQuotes useCaseGetQuotes = new UseCaseGetQuotes();
        adaptor.setList(useCaseGetQuotes.getList());
        Log.e("FUCK", "sx " + useCaseGetQuotes.getList().toString());

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void release() {

    }
}
