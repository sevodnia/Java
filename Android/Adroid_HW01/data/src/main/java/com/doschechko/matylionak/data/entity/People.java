package com.doschechko.matylionak.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * POJO класс, для описания модели сотрудника, который парсится из json, который сваливается и
 * backendless
 */

public class People implements DataModel {
    @SerializedName("name")
    private String name;

    @SerializedName("surname")
    private String surname;

    @SerializedName("profession")
    private String profession;

    @SerializedName("email")
    private String email;

    @SerializedName("phone")
    private String phone;

    @SerializedName("objectId")
    private String objectId;

    @SerializedName("department")
    private String department;

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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", objectId='" + objectId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
