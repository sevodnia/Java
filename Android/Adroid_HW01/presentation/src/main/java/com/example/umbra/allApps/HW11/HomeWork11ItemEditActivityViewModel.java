package com.example.umbra.allApps.HW11;

import android.app.Activity;
import android.databinding.ObservableField;
import android.util.Log;
import android.widget.Toast;

import com.doschechko.matylionak.data.entity.People;
import com.example.domain.interaction.useCaseForHW11.UseCaseOnlyOnePeople;
import com.example.domain.interaction.useCaseForHW11.UseCaseSavePeople;
import com.example.umbra.allApps.base.BaseViewModelThis;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class HomeWork11ItemEditActivityViewModel implements BaseViewModelThis {

    Activity activity;
    DisposableObserver<People> observer;
    UseCaseSavePeople useCaseSavePeople = new UseCaseSavePeople();


    public ObservableField<String> simple = new ObservableField<>("");
    //поля для редактирования
    public ObservableField<String> mName = new ObservableField<>("");
    public ObservableField<String> mSurname = new ObservableField<>("");
    public ObservableField<String> mDepartment = new ObservableField<>("");
    public ObservableField<String> mProfession = new ObservableField<>("");
    public ObservableField<String> mEmail = new ObservableField<>("");
    public ObservableField<String> mPhone = new ObservableField<>("");


    //поля для hint
    private ObservableField<String> name = new ObservableField<>("");
    private ObservableField<String> surname = new ObservableField<>("");
    private ObservableField<String> department = new ObservableField<>("");
    private ObservableField<String> profession = new ObservableField<>("");
    private ObservableField<String> email = new ObservableField<>("");
    private ObservableField<String> phone = new ObservableField<>("");


    UseCaseOnlyOnePeople onePeople = new UseCaseOnlyOnePeople();
    Observable<People> observable = onePeople.load(HomeWork11ItemActivity.id);

    @Override
    public void init() {


        observer = observable
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


    //сохраняем данные после редактирования
    public void onClickSave() {
        People people = new People();
        people.setName(mName.get().equals(simple.get()) ? name.get() : mName.get());
        people.setSurname(mSurname.get().equals(simple.get()) ? surname.get() : mSurname.get());
        people.setDepartment(mDepartment.get().equals(simple.get()) ? department.get() : mDepartment.get());
        people.setProfession(mProfession.get().equals(simple.get()) ? profession.get() : mProfession.get());
        people.setEmail(mEmail.get().equals(simple.get()) ? email.get() : mEmail.get());
        people.setPhone(mPhone.get().equals(simple.get()) ? phone.get() : mPhone.get());
        people.setObjectId(HomeWork11ItemActivity.id);


        Log.e("SURNAME   ", "=" + mSurname.get());


        Toast.makeText(activity, "Имя " + people.getName() + "Фамилия" +
                people.getSurname(), Toast.LENGTH_SHORT).show();






        useCaseSavePeople.save(HomeWork11ItemActivity.id, people);

        Toast.makeText(activity, "ID " + HomeWork11ItemActivity.id, Toast.LENGTH_SHORT).show();

    }

    public HomeWork11ItemEditActivityViewModel(Activity activity) {
        this.activity = activity;
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


    public ObservableField<String> getmName() {
        return mName;
    }

    public void setmName(ObservableField<String> mName) {
        this.mName = mName;
    }


    public ObservableField<String> getmSurname() {
        return mSurname;
    }

    public void setmSurname(ObservableField<String> mSurname) {
        this.mSurname = mSurname;
    }

    public ObservableField<String> getmDepartment() {
        return mDepartment;
    }

    public void setmDepartment(ObservableField<String> mDepartment) {
        this.mDepartment = mDepartment;
    }

    public ObservableField<String> getmProfession() {
        return mProfession;
    }

    public void setmProfession(ObservableField<String> mProfession) {
        this.mProfession = mProfession;
    }

    public ObservableField<String> getmEmail() {
        return mEmail;
    }

    public void setmEmail(ObservableField<String> mEmail) {
        this.mEmail = mEmail;
    }

    public ObservableField<String> getmPhone() {
        return mPhone;
    }

    public void setmPhone(ObservableField<String> mPhone) {
        this.mPhone = mPhone;
    }
}
