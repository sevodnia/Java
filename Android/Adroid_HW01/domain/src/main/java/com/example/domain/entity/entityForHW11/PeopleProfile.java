package com.example.domain.entity.entityForHW11;

/**
 * Укороченный класс, который служит для отображения информации на самом первом экране
 * содержить только имя, фамилию и ID
 */

public class PeopleProfile {


    private String name;
    private String surname;
    private String objectId;


    @Override
    public String toString() {
        return "PeopleProfile{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", objectId='" + objectId + '\'' +
                '}';
    }

    public PeopleProfile() {
    }

    public PeopleProfile(String name, String surname, String objectId) {
        this.name = name;
        this.surname = surname;
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
}
