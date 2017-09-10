package com.doschechko.matylionak.wcguide.citaty;

import android.app.Activity;
import android.databinding.ObservableField;
import android.widget.Toast;
import com.doschechko.matylionak.domain.entity.Quote;
import com.doschechko.matylionak.domain.interaction.UseCaseGetQuotesByAuthor;
import com.doschechko.matylionak.wcguide.STATE;
import com.doschechko.matylionak.wcguide.base.BaseFragmentViewModel;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;


public class Activity_QuoteViewModel implements BaseFragmentViewModel {
    private String authorName = new String(Activity_Authors.AUTHOR_NAME); //костыль, чтобы создать новый объект Стринг
    private Activity activity;
    private MyAdaptor adaptor = new MyAdaptor();
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);
    private UseCaseGetQuotesByAuthor useCaseGetQuotesByAuthor = new UseCaseGetQuotesByAuthor(authorName);

    @Override
    public void init() {
        pull();
     }

     //при нажатии на кнопку - "показать ещё
    public void showMore() {
        pull();
    }


    //метод, который подтягивает нам данные из UseCaseGetQuotesByAuthor
    private void pull() {
        state.set(STATE.PROGRESS);
        useCaseGetQuotesByAuthor.execute(null, new DisposableObserver<List<Quote>>() {
            @Override
            public void onNext(@NonNull List<Quote> quotes) {
                adaptor.setList(new ArrayList<>(quotes));
                state.set(STATE.DATA);
                if (quotes.isEmpty()) {
                    Toast.makeText(activity, "Конец", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onError(@NonNull Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });


    }


    @Override
    public void resume() {

    }

    @Override
    public void pause() {
        useCaseGetQuotesByAuthor.dispose();
    }

    @Override
    public void release() {

    }


    public MyAdaptor getAdaptor() {
        return adaptor;
    }

    public void setAdaptor(MyAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
