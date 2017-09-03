package com.doschechko.matylionak.domain.entity;



public class Quote {

    String body;
    String author;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Quote(String body, String author) {
        this.body = body;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Quote{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
