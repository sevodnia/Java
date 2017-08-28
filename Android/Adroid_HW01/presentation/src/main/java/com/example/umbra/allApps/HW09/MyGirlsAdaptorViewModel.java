package com.example.umbra.allApps.HW09;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.example.domain.entity.Girl;
import com.example.umbra.allApps.R;
import com.example.umbra.allApps.base.BaseViewModelThis;
import com.squareup.picasso.Picasso;


public class MyGirlsAdaptorViewModel implements BaseViewModelThis {

    //конкретный объект, который будет сваливаться из MyGirlsAdaptorViewModel
    private Girl girl;
    ObservableField<String> name;
    ObservableField<String> url;


//пхаем GIRL и заполняем поля объекта
    public void setGirl(Girl girl) {
        this.girl = girl;
        name= new ObservableField<>(girl.getName());
        url = new ObservableField<>(girl.getImage());
    }

    //конструктор
    public MyGirlsAdaptorViewModel() {
    }

    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }


//создаем новый xml атрибут для загрузки данных
    @BindingAdapter("android:src")
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .placeholder(R.drawable.placeholder)
                .into(view);
    }


    public Girl getGirl() {
        return girl;
    }

    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getUrl() {
        return url;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public void setUrl(ObservableField<String> url) {
        this.url = url;
    }
}
