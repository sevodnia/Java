package com.doschechko.matylionak.wcguide.citaty;


import android.databinding.ObservableField;


public class Item_QuoteViewModel {

    ObservableField<String> body = new ObservableField<>("");

    ObservableField<String> author = new ObservableField<>("");

    public ObservableField<String> getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = new ObservableField<>(body);
    }

    public ObservableField<String> getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = new ObservableField<>(author);
    }
}
