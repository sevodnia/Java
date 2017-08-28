package com.example.umbra.allApps.HW11;

import android.app.Activity;
import android.databinding.ObservableField;
import android.widget.Toast;

import com.doschechko.matylionak.data.entity.People;
import com.example.domain.interaction.useCaseForHW11.UseCaseOnlyOnePeople;
import com.example.umbra.allApps.base.BaseViewModelThis;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class HomeWork11ItemActivityViewModel implements BaseViewModelThis {
    private String id;

    Activity activity;
    DisposableObserver<People> observer;



   private ObservableField<String> name =  new ObservableField<>("");
    private  ObservableField<String> surname =  new ObservableField<>("");
    private ObservableField<String> department =  new ObservableField<>("");
    private ObservableField<String> profession =  new ObservableField<>("");
    private ObservableField<String> email =  new ObservableField<>("");
    private ObservableField<String> phone =  new ObservableField<>("");


    public HomeWork11ItemActivityViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

        UseCaseOnlyOnePeople useCase= new UseCaseOnlyOnePeople();

        final Observable<People> peopleObservable = useCase.load(id);


        observer= peopleObservable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<People>() {
                    @Override
                    public void onNext(@NonNull People people) {
                        name.set(people.getName());
                        surname.set(people.getSurname());
                        department.set(people.getDepartment());
                        profession.set(people.getProfession());
                        email.set(people.getEmail());
                        phone.set(people.getPhone());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });



    }



    //запускаем активити для редактирования
    public void onClickButton() {
        HomeWork11ItemEditActivity.show(activity);
        Toast.makeText(activity, "Редактировать контакт", Toast.LENGTH_SHORT).show();
    }


    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {
        observer.dispose();
    }


    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getSurname() {
        return surname;
    }

    public void setSurname(ObservableField<String> surname) {
        this.surname = surname;
    }

    public ObservableField<String> getDepartment() {
        return department;
    }

    public void setDepartment(ObservableField<String> department) {
        this.department = department;
    }

    public ObservableField<String> getProfession() {
        return profession;
    }

    public void setProfession(ObservableField<String> profession) {
        this.profession = profession;
    }

    public ObservableField<String> getEmail() {
        return email;
    }

    public void setEmail(ObservableField<String> email) {
        this.email = email;
    }

    public ObservableField<String> getPhone() {
        return phone;
    }

    public void setPhone(ObservableField<String> phone) {
        this.phone = phone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
