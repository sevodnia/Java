package com.example.umbra.allApps.HW10;

import android.app.Activity;
import android.databinding.ObservableField;
import android.util.Log;

import com.example.umbra.allApps.base.BaseViewModelThis;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class Activity_HomeWork10ViewModel implements BaseViewModelThis {
    private Activity activity;
    private ObservableField<String> data = new ObservableField<>("");
    private Observer<Integer> observer;
    DisposableObserver<Integer> disposableObserver;

    @Override
    public void init() {

        Observable<Integer> count = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                for (int i = 100; i > 0; i--) {
                    e.onNext(i);


                    try {
                        Thread.sleep(1000);
                    } catch (Exception e1) {
                        Log.e("Ошибка", "ошибка пробуждения");
                    }


                }
            }
        });

        disposableObserver = new DisposableObserver<Integer>() {
            @Override
            public void onNext(@NonNull Integer integer) {
                data.set(integer.toString());
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };


        count
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver);


//            //создадим обсервер
//        observer = new Observer<Integer>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//            }
//
//            @Override
//            public void onNext(@NonNull Integer integer) {
//                data.set(integer.toString());
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//            }
//
//            @Override
//            public void onComplete() {
//            }
//        };
//
//        count
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(observer);


    }

    @Override
    public void release() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void pause() {

        disposableObserver.dispose();

    }


    public ObservableField<String> getData() {
        return data;
    }

    public void setData(ObservableField<String> data) {
        this.data = data;
    }

    public Activity_HomeWork10ViewModel(Activity activity) {
        this.activity = activity;
    }


}
