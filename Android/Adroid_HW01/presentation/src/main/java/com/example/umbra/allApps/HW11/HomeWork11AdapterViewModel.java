package com.example.umbra.allApps.HW11;


import android.databinding.ObservableField;

public class HomeWork11AdapterViewModel {

    ObservableField<String> name = new ObservableField<>("");
    ObservableField<String> surname = new ObservableField<>("");


    public ObservableField<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = new ObservableField<>(name);

    }

    public ObservableField<String> getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = new ObservableField<>(surname);
    }
}
