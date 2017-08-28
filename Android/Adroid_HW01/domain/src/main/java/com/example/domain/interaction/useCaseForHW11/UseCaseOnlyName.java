package com.example.domain.interaction.useCaseForHW11;

import android.util.Log;

import com.doschechko.matylionak.data.entity.People;
import com.doschechko.matylionak.data.net.RestApiForHW11.RestServiceForHW11;
import com.example.domain.entity.entityForHW11.PeopleProfile;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;


/**
 * UseCase для того, чтобы выдернуть в списко только Имена и Фамилии
 * которые будут отображать на первом экране
 */

public class UseCaseOnlyName {

    RestServiceForHW11 listOfPeople = RestServiceForHW11.getInstance();//объект USECCASE
    Observable<List<People>> data = listOfPeople.getPeople();//получаем шаболду элементов PEOPLE
    Observable<List<PeopleProfile>> listObservable; //эту хуйню нужно вернуть всем


    public Observable<List<PeopleProfile>> getList() {

        listObservable = data.map(new Function<List<People>, List<PeopleProfile>>() {
            @Override
            public List<PeopleProfile> apply(@NonNull List<People> peoples) throws Exception {

                List<PeopleProfile> profiles = new ArrayList<>();
                for (int i = 0; i < peoples.size(); i++) {
                    PeopleProfile profile = new PeopleProfile();
                    profile.setName(peoples.get(i).getName());
                    profile.setSurname(peoples.get(i).getSurname());
                    profile.setObjectId(peoples.get(i).getObjectId());
                    profiles.add(profile);
                }
                Log.e("People в PeopleProfile", profiles.toString());
                return profiles;
            }
        });


        return listObservable;

    }

}
