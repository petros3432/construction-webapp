package gr.pf.team2.constructionwebapp.models;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.UserType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class OwnerModel {
    private String afm;

    private String name;

    private String surname;

    private String address;

    private String tel;

    private String email;

    private String password;

    private UserType userType;

    private TypeOfProperty typeOfProperty;

    private Long id;

    public OwnerModel(String afm, String name, String surname, String address, String tel, String email, String password, TypeOfProperty typeOfProperty, Long id) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.typeOfProperty = typeOfProperty;
        this.id = id;
    }
    public OwnerModel(){

    }
    public String getAfm() {
        return afm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setAfm(String afm) {
        this.afm = afm;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }
}
